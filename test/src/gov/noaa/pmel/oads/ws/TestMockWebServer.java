/**
 * 
 */
package gov.noaa.pmel.oads.ws;



import gov.noaa.pmel.tws.util.ApplicationConfiguration;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletConfig;
//import javax.ws.rs.core.Context;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.SecureRequestCustomizer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.webapp.WebAppContext;

//import com.sun.jersey.api.core.DefaultResourceConfig;
//import com.sun.jersey.spi.container.servlet.ServletContainer;
//import com.sun.jersey.spi.inject.SingletonTypeInjectableProvider;

/**
 * This class provides a simple, stand-alone servlet container.
 * It has been used primarily for stand-alone testing.  
 * However, we keep it in the project to provide an internal end-point destination to upload and process 
 * benchmark test results.
 * 
 * @author kamb
 *
 */
public class TestMockWebServer {

	private static final String MODULE_NAME = "oads";

	private static final int DEFAULT_PORT = 8088;
	private static final String DEFAULT_CONTEXT = "oads";
	private static final String DEFAULT_HANDLER = "org.eclipse.jetty.server.handler.DefaultHandler";


	private static int port = DEFAULT_PORT;
	private static final String pPORT = MODULE_NAME + ".server.port";
	
	// web application root path
	private static String contextPath = "/" + DEFAULT_CONTEXT;
	private static final String pCONTEXT = MODULE_NAME + ".server.context";
	
	// Jetty Handler.
	private static String handlerClassName = DEFAULT_HANDLER;
	private static final String pHANDLER = MODULE_NAME + ".server.handler";

	private static void parseArgs(String[] args) {
		Integer portArg = null;
		String ctxtArg = null;
		String handlerArg = null;
		List<String> argList = Arrays.asList(args);
		for (int i = 0; i < args.length; i++) {
			String argName = argList.get(i);
			switch (argName) {
				case "-p":
				case "--port":
					try { 
						if ( portArg != null ) { throw new IllegalArgumentException("Multiple ports specified: " + argList); }
						portArg = new Integer(argList.get(++i)); }
					catch (Exception ex) { throw new IllegalArgumentException("Illegal port value: " + argList, ex); }
					break;
				case "-P":
				case "--path":
					try { 
						if ( ctxtArg != null ) { throw new IllegalArgumentException("Multiple contexts specified: " + argList); }
						ctxtArg = argList.get(++i); 
						if ( ! ctxtArg.startsWith("/")) {
							ctxtArg = "/" + ctxtArg;
						}
					} catch (Exception ex) { throw new IllegalArgumentException("Invalid context path value: " + argList, ex); }
					break;
				case "-c":
				case "--class":
					try { 
						if ( handlerArg == null ) {
							handlerArg = argList.get(++i);
						} else {
							handlerArg += ";"+argList.get(++i);
						}
					} catch (Exception ex) { throw new IllegalArgumentException("Invalid handler class name: " + argList, ex); }
					break;
				default:
					System.out.println("Ignoring unknown argument: " + argName); 
			}
		}
		if ( portArg != null ) { port = portArg.intValue(); }
		if ( ctxtArg != null ) { contextPath = ctxtArg; }
		if ( handlerArg != null ) { handlerClassName = handlerArg; }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		System.setProperty("configuration_debug", "true");

//		port = ApplicationConfiguration.getProperty(pPORT, port);
//		contextPath = ApplicationConfiguration.getProperty(pCONTEXT, contextPath);
//		handlerClassName = ApplicationConfiguration.getProperty(pHANDLER, handlerClassName);
		
		if ( args.length > 0 ) {
			parseArgs(args);
		}
		
		@SuppressWarnings("resource")
		ServerConnector  connector = null; 
		try {
			System.out.println("Running server on port " + port + ", listener " + handlerClassName + " for " + contextPath);
			Server server = new Server();
			connector = new ServerConnector(server); connector.setPort(port);
			server.setConnectors(new Connector[] { connector });
			 
			HttpConfiguration https = new HttpConfiguration();
			https.addCustomizer(new SecureRequestCustomizer());
			 
			runWsRsServices(server);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ( connector != null ) { connector.close(); }
		}
	}
	
	private static void runWsRsServices(Server server) throws Exception {
		HandlerCollection contexts = new HandlerList();
		 
		ServletHolder sh = new ServletHolder();
		String location = "argo/files";
		int maxFileSize = 100000000;
		int maxRequestSize = 100000000;
		int fileSizeThreshold = 5000;
		sh.getRegistration().setMultipartConfig(new MultipartConfigElement(location, maxFileSize, maxRequestSize, fileSizeThreshold));
//		sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
//		sh.setInitParameter("com.sun.jersey.config.property.packages", "gov.noaa.pmel.argo.tws.ws");//Set the package where the services reside
//		sh.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
		
		ServletContextHandler jerseyContext = new ServletContextHandler(server, contextPath, ServletContextHandler.SESSIONS);
//        jerseyContext.addFilter(gov.noaa.pmel.argo.tws.ws.SignedMsgVerifier.class, "/tws/ifm/*", EnumSet.of(DispatcherType.REQUEST));
//		jerseyContext.addServlet(sh, "/tws/*");
		jerseyContext.setResourceBase("WebContent");
		
		jerseyContext.addServlet(DefaultServlet.class, "/*");
		
		contexts.addHandler(jerseyContext);
		
		server.setHandler(contexts);
		
		server.start();
		server.join();
		
	}
}
