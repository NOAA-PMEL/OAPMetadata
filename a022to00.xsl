<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:xs="http://www.w3.org/2001/XMLSchema"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:oa="http://ncei.noaa.gov/oads/v_a0_2_2" 
  xmlns:xalan="xml.apache.org/xalan"
  exclude-result-prefixes="xs oa xsi xsl xalan" version="2.0">
   
  <xsl:variable name="newLine"><xsl:text>&#xa;</xsl:text></xsl:variable>
  <xsl:variable name="nbsp"><xsl:text>&#160;</xsl:text></xsl:variable> <!-- &#xa0; or &#160; -->
  <xsl:variable name="space"><xsl:text>&#x20;</xsl:text></xsl:variable>
  <xsl:param name="obs_type"/>
  <xsl:preserve-space elements="oa:methodReference methodReference"/>
  
  <xsl:output method="xml" version="1.0" encoding="UTF-8" 
    indent="yes" xalan:indent-amount="2"/>
    
    <xsl:template match="oa:investigator|oa:dataSubmitter">
          <name>
            <xsl:value-of select="oa:name/oa:first"/><xsl:value-of select="$space"/>
            <xsl:if test="oa:name/oa:middle != ''">
                <xsl:value-of select="oa:name/oa:middle"/><xsl:value-of select="$space"/>
            </xsl:if>
            <xsl:value-of select="oa:name/oa:last"/></name>
          <xsl:if test="oa:organization != ''">
            <xsl:for-each select="oa:organization">
              <organization><xsl:value-of select="current()"/></organization>
            </xsl:for-each>
          </xsl:if>
          <deliverypoint1><xsl:value-of select="oa:contactInfo/oa:address/oa:deliveryPoint[@index = 1]"/></deliverypoint1>
          <xsl:if test="oa:contactInfo/oa:address/oa:deliveryPoint[@index = 2] != ''">
            <deliverypoint2><xsl:value-of select="oa:contactInfo/oa:address/oa:deliveryPoint[@index = 2]"/></deliverypoint2>
          </xsl:if>
          <city><xsl:value-of select="oa:contactInfo/oa:address/oa:city"/></city>
          <administrativeArea><xsl:value-of select="oa:contactInfo/oa:address/oa:administrativeArea"/></administrativeArea>
          <zip><xsl:value-of select="oa:contactInfo/oa:address/oa:postalCode"/></zip>
          <country><xsl:value-of select="oa:contactInfo/oa:address/oa:country"/></country>
          <phone><xsl:value-of select="oa:contactInfo/oa:phone"/></phone>
          <email><xsl:value-of select="oa:contactInfo/oa:email"/></email>
          <xsl:if test="oa:identifier != ''">
            <ID><xsl:value-of select="oa:identifier"/></ID>
            <IDtype><xsl:value-of select="oa:identifier/@type"/></IDtype>
          </xsl:if>
          <link></link>
    </xsl:template>
    
  <xsl:template match="/oa:oads_metadata">
  <xsl:value-of select="$newLine"/>
    <metadata>
    <!--  -->
      <image>/Images/nceilogo-banner.png</image>
      <submissionDate><xsl:value-of select="oa:submissionDate"/></submissionDate>
      <revisionDate/>
      <accn/>
      <doi/>
      <type><xsl:value-of select="$obs_type"/></type>
      <xsl:if test="oa:relatedDataSets != ''">
        <xsl:for-each select="oa:relatedDataSets/oa:dataset">
          <related>
            <name><xsl:value-of select="oa:dataset"/></name>
            <link><xsl:value-of select="oa:link"/></link>
          </related>
        </xsl:for-each>
      </xsl:if>
      <dataLicense>
      	<xsl:attribute name="url"><xsl:value-of select="oa:dataLicense/@url"/></xsl:attribute>
      	<xsl:value-of select="oa:dataLicense"/>
      </dataLicense>
      <useLimitation><xsl:value-of select="oa:useLimitation"/></useLimitation>
      <xsl:for-each select="oa:investigators/oa:investigator">
        <person>
          <xsl:apply-templates select="current()"/>
          <role>Investigator</role>
        </person>
      </xsl:for-each>
      <datasubmitter>
          <xsl:apply-templates select="oa:dataSubmitter"/>
      </datasubmitter>
      <title>
        <xsl:value-of select="oa:title"/>
      </title>
      <abstract>
        <xsl:value-of select="oa:abstract"/>
      </abstract>
      <purpose>
        <xsl:value-of select="oa:purpose"/>
      </purpose>
      <startdate>
        <xsl:value-of select="oa:temporalExtents/oa:startDate"/>
      </startdate>
      <enddate>
        <xsl:value-of select="oa:temporalExtents/oa:endDate"/>
      </enddate>
      <westbd><xsl:value-of select="oa:spatialExtents/oa:westernBounds"/></westbd>
      <eastbd><xsl:value-of select="oa:spatialExtents/oa:easternBounds"/></eastbd>
      <northbd><xsl:value-of select="oa:spatialExtents/oa:northernBounds"/></northbd>
      <southbd><xsl:value-of select="oa:spatialExtents/oa:southernBounds"/></southbd>
      <spatialReference>
        <xsl:value-of select="oa:spatialReference"/>
      </spatialReference>
      <xsl:if test="oa:sampleCollectionRegions/oa:region != ''">
          <xsl:for-each select="oa:sampleCollectionRegions/oa:region">
            <geographicName><xsl:value-of select="current()"/></geographicName>
          </xsl:for-each>
      </xsl:if>
      <xsl:if test="organismCollectionRegions/oa:region != ''">
        <xsl:for-each select="oa:sampleCollectionRegions/oa:region">
          <locationOrganism><xsl:value-of select="current()"/></locationOrganism>
        </xsl:for-each>
      </xsl:if>
      <xsl:if test="oa:fundingInfo/oa:source != ''" >
        <xsl:for-each select="oa:fundingInfo/oa:source">
          <fundingAgency>
            <agency><xsl:value-of select="oa:agency"/></agency>
            <title><xsl:value-of select="oa:title"/></title>
            <ID><xsl:value-of select="oa:identifier"/></ID>
          </fundingAgency>
        </xsl:for-each>
      </xsl:if>
      <xsl:for-each select="oa:researchProjects/oa:project">
        <researchProject><xsl:value-of select="current()"/></researchProject>
      </xsl:for-each>
      <xsl:if test="oa:platforms/oa:platform != ''">
        <xsl:for-each select="oa:platforms/oa:platform">
          <platform>
            <name><xsl:value-of select="oa:name"/></name>
            <ID><xsl:value-of select="oa:identifier"/></ID>
            <type><xsl:value-of select="oa:type"/></type>
            <owner><xsl:value-of select="oa:owner"/></owner>
            <country><xsl:value-of select="oa:country"/></country>
          </platform>
        </xsl:for-each>
      </xsl:if>
      <xsl:if test="oa:expocodes/oa:expocode != ''">
        <xsl:for-each select="oa:expocodes/oa:expocode">
         <expocode><xsl:value-of select="current()"/></expocode>
        </xsl:for-each>
      </xsl:if>
      <xsl:if test="oa:cruiseIds/oa:cruiseId != ''">
        <xsl:for-each select="oa:cruiseIds/oa:cruiseId">
         <cruiseID><xsl:value-of select="current()"/></cruiseID>
        </xsl:for-each>
      </xsl:if>
      <xsl:if test="oa:sections/oa:section != ''">
        <xsl:for-each select="oa:sections/oa:section">
         <section><xsl:value-of select="current()"/></section>
        </xsl:for-each>
      </xsl:if>
      <authors>
        <xsl:for-each select="oa:authors/oa:author">
            <author><xsl:value-of select="current()"/></author>
        </xsl:for-each>
      </authors>
      <xsl:if test="oa:references/oa:reference != ''">
        <xsl:for-each select="oa:references/oa:reference">
         <reference><xsl:value-of select="current()" disable-output-escaping="no"/></reference>
        </xsl:for-each>
      </xsl:if>
      <suppleInfo><xsl:value-of select="oa:supplementalInfo"/></suppleInfo>
      <!-- more NCEI internal stuff -->
      <xsl:comment>
      <link_landing>https://accession.nodc.noaa.gov/XXXXXXX</link_landing>
      <link_download>https://data.nodc.noaa.gov/ncei/ocads/data/XXXXXXX/</link_download>
      <link_img>https://data.nodc.noaa.gov/cgi-bin/gfx?id=gov.noaa.nodc:XXXXXXX</link_img>
      </xsl:comment>
      <xsl:apply-templates select="oa:variables"/>
    </metadata>
  </xsl:template>
  
  <xsl:template match="oa:variable">
      <abbrev><xsl:value-of select="oa:datasetVarName"/></abbrev>
      <fullname><xsl:value-of select="oa:fullName"/></fullname>
      <unit><xsl:value-of select="oa:units"/></unit>
      <observationType><xsl:value-of select="oa:observationType"/></observationType>
      <insitu><xsl:value-of select="oa:variableType"/></insitu>
      <xsl:if test="oa:measuredOrCalculated != ''">
        <measured><xsl:value-of select="oa:measuredOrCalculated"/></measured>
      </xsl:if>
      <xsl:if test="oa:calculationMethod/oa:description != ''">
        <calcMethod><xsl:value-of select="oa:calculationMethod/oa:description"/></calcMethod>
      </xsl:if>
      <xsl:if test="oa:manipulationMethod != ''">
        <manipulationMethod><xsl:value-of select="oa:manipulationMethod"/></manipulationMethod>
      </xsl:if>
      <samplingInstrument><xsl:value-of select="oa:samplingInstrument"/></samplingInstrument>
      <analyzingInstrument><xsl:value-of select="oa:analyzingInstrument"/></analyzingInstrument>
      <detailedInfo><xsl:value-of select="oa:detailedInfo"/></detailedInfo>
      <replicate><xsl:value-of select="oa:fieldReplicateHandling"/></replicate>
  </xsl:template>
  
  <xsl:template match="oa:variables">
  
    <!-- Dissolved Inorganic Carbon -->
    <xsl:for-each select="oa:variable[@xsi:type='dic_variable_type']|oa:dic">
    <variable>
    <xsl:apply-templates select="current()"/>
        <!--standard-->
        <xsl:for-each select="oa:standardization">
          <standard>
          <xsl:if test="oa:description != ''">
            <description>
            <xsl:value-of select="oa:description"/>
            </description>
          </xsl:if>
          <xsl:if test="oa:frequency != ''">
            <frequency><xsl:value-of select="oa:frequency"/></frequency>
          </xsl:if>
          <xsl:for-each select="oa:crm">
            <crm>
            <xsl:if test="oa:manufacturer != ''">
              <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
            </xsl:if>
            <xsl:if test="oa:batch != ''">
              <batch><xsl:value-of select="oa:batch"/></batch>
            </xsl:if>
            </crm>
          </xsl:for-each>
          </standard>
        </xsl:for-each>
      <poison>
        <poisonName><xsl:value-of select="oa:poison/oa:name"/></poisonName>
        <volume><xsl:value-of select="oa:poison/oa:volume"/></volume>
        <correction><xsl:value-of select="oa:poison/oa:description"/></correction>
      </poison>
      <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
      <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
      <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
      <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
      <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
      <internal>1</internal>
    </variable>
    </xsl:for-each>
    
    <!-- Total alkalinity -->
    <xsl:for-each select="oa:variable[@xsi:type='ta_variable_type']|oa:ta">
      <variable>
      <xsl:apply-templates select="current()"/>
      
        <xsl:if test="oa:titrationType != ''">
          <titrationType><xsl:value-of select="oa:titrationType"/></titrationType>
        </xsl:if>
        <xsl:if test="oa:cellType != ''">
          <cellType><xsl:value-of select="oa:cellType"/></cellType>
        </xsl:if>
        <xsl:if test="oa:curveFitting != ''">
          <curveFitting><xsl:value-of select="oa:curveFitting"/></curveFitting>
        </xsl:if>
        
        <!--standard-->
        <xsl:for-each select="oa:standardization">
          <standard>
          <xsl:if test="oa:description != ''">
            <description>
            <xsl:value-of select="oa:description"/>
            </description>
          </xsl:if>
          <xsl:if test="oa:frequency != ''">
            <frequency><xsl:value-of select="oa:frequency"/></frequency>
          </xsl:if>
          <xsl:for-each select="oa:crm">
            <crm>
            <xsl:if test="oa:manufacturer != ''">
              <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
            </xsl:if>
            <xsl:if test="oa:batch != ''">
              <batch><xsl:value-of select="oa:batch"/></batch>
            </xsl:if>
            </crm>
          </xsl:for-each>
          </standard>
        </xsl:for-each>
        
        <!-- poison -->
        <xsl:for-each select="oa:poison">
        <poison>
          <xsl:if test="oa:name != ''">
            <poisonName><xsl:value-of select="oa:name"/></poisonName>
          </xsl:if>
          <xsl:if test="oa:volume != ''">
            <volume><xsl:value-of select="oa:volume"/></volume>
          </xsl:if>
          <xsl:if test="oa:description != ''">
            <correction><xsl:value-of select="oa:description"/></correction>
          </xsl:if>
        </poison>
        </xsl:for-each>
        <xsl:if test="oa:blankCorrection != ''">
          <blank><xsl:value-of select="oa:blankCorrection"/></blank>
        </xsl:if>
        
        <xsl:if test="oa:uncertainty != ''">
          <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
        </xsl:if>
        <xsl:if test="oa:qcFlag/oa:description != ''">
          <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
        </xsl:if>
        <xsl:if test="oa:methodReference != ''">
          <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
        </xsl:if>
        <xsl:if test="oa:researcher/oa:name != ''">
          <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
        <xsl:if test="oa:researcher/oa:organization != ''">
        </xsl:if>
          <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
        </xsl:if>
        <internal>2</internal>
      </variable>
      
    </xsl:for-each>
    
    <!-- pH -->
    <xsl:for-each select="oa:variable[@xsi:type='ph_variable_type']|oa:ph">
      <variable>
      <xsl:apply-templates select="current()"/>
        
      <xsl:if test="oa:phScale != ''">
        <phscale><xsl:value-of select="oa:phScale"/></phscale>
      </xsl:if>
      <xsl:if test="oa:measurementTemperature != ''">
        <temperatureMeasure><xsl:value-of select="oa:temperatureMeasure"/></temperatureMeasure>
      </xsl:if>
      <!--standard-->
      <xsl:for-each select="oa:standardization">
      <standard>
        <xsl:if test="oa:description != ''">
          <description><xsl:value-of select="oa:description"/></description>
        </xsl:if>
        <xsl:if test="oa:frequency != ''">
          <frequency><xsl:value-of select="oa:frequency"/></frequency>
        </xsl:if>
        <xsl:if test="oa:phOfStandards != ''">
          <standardphvalues><xsl:value-of select="oa:phOfStandards"/></standardphvalues>
        </xsl:if>
        <xsl:if test="oa:temperature != ''">
          <temperatureStandardization><xsl:value-of select="oa:temperature"/></temperatureStandardization>
        </xsl:if>
      </standard>
      </xsl:for-each>
      <temperatureMeasure><xsl:value-of select="oa:measurementTemperature"/></temperatureMeasure>
      <xsl:if test="oa:temperatureCorrectionMethod != ''">
        <temperatureCorrectionMethod><xsl:value-of select="oa:temperatureCorrectionMethod"/></temperatureCorrectionMethod>
      </xsl:if>
      <xsl:if test="oa:phReportTemperature != ''">
        <phReportTemperature><xsl:value-of select="oa:phReportTemperature"/></phReportTemperature>
      </xsl:if>
      <xsl:if test="oa:uncertainty != ''">
        <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
      </xsl:if>
      <xsl:if test="oa:qcFlag/oa:description != ''">
        <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
      </xsl:if>
      <xsl:if test="oa:methodReference != ''">
        <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
      </xsl:if>
      <xsl:if test="oa:researcher/oa:name != ''">
        <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
      </xsl:if>
      <xsl:if test="oa:researcher/oa:organization != ''">
        <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
      </xsl:if>
      <internal>3</internal>
      </variable>
    </xsl:for-each> <!-- ph -->
    
    <!-- pCO2 autonomous -->
    <xsl:for-each select="oa:variable[@xsi:type='co2_autonomous']|oa:co2a">
      <variable>
      <xsl:apply-templates select="current()"/>
        
        <xsl:if test="oa:locationSeawaterIntake != ''">
          <locationSeawaterIntake><xsl:value-of select="oa:locationSeawaterIntake"/></locationSeawaterIntake>
        </xsl:if>
        <xsl:if test="oa:depthSeawaterIntake != ''">
          <DepthSeawaterIntake><xsl:value-of select="oa:depthSeawaterIntake"/></DepthSeawaterIntake>
        </xsl:if>
        <xsl:if test="oa:analyzingInstrument != ''">
          <analyzingInstrument><xsl:value-of select="oa:analyzingInstrument"/></analyzingInstrument>
        </xsl:if>
        
        <xsl:for-each select="oa:equilibrator">
        <equilibrator>
          <xsl:if test="oa:type != ''">
             <type><xsl:value-of select="oa:type"/></type>
          </xsl:if>
          <xsl:if test="oa:volume != ''">
             <volume><xsl:value-of select="oa:volume"/></volume>
          </xsl:if>
          <xsl:if test="oa:vented != ''">
             <vented><xsl:value-of select="oa:vented"/></vented>
          </xsl:if>
          <xsl:if test="oa:waterFlowRate != ''">
             <waterFlowRate><xsl:value-of select="oa:waterFlowRate"/></waterFlowRate>
          </xsl:if>
          <xsl:if test="oa:gasFlowRate != ''">
             <gasFlowRate><xsl:value-of select="oa:gasFlowRate"/></gasFlowRate>
          </xsl:if>
          <xsl:if test="oa:temperatureMeasurement/oa:method != ''">
             <temperatureEquilibratorMethod><xsl:value-of select="oa:temperatureMeasurement/oa:method"/></temperatureEquilibratorMethod>
          </xsl:if>
          <xsl:if test="oa:pressureMeasurement/oa:method != ''">
             <pressureEquilibratorMethod><xsl:value-of select="oa:pressureMeasurement/oa:method"/></pressureEquilibratorMethod>
          </xsl:if>
          <xsl:if test="oa:dryMethod != ''">
             <dryMethod><xsl:value-of select="oa:dryMethod"/></dryMethod>
          </xsl:if>
        </equilibrator>
        </xsl:for-each>
              
        <xsl:for-each select="oa:gasDetector">
        <gasDetector>
           <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
           <model><xsl:value-of select="oa:model"/></model>
           <resolution><xsl:value-of select="oa:resolution"/></resolution>
           <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
        </gasDetector>
        </xsl:for-each>
        
        <xsl:for-each select="oa:standarization">
          <standardization>
           <description><xsl:value-of select="oa:description"/></description>
           <frequency><xsl:value-of select="oa:frequency"/></frequency>
           <standardgas>
              <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
              <concentration><xsl:value-of select="oa:concentration"/></concentration>
              <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
           </standardgas>
        </standardization>
        </xsl:for-each>
        
      <waterVaporCorrection><xsl:value-of select="oa:waterVaporCorrection"/></waterVaporCorrection>
      <temperatureCorrection><xsl:value-of select="oa:temperatureCorrectionMethod"/></temperatureCorrection>
      <co2ReportTemperature><xsl:value-of select="oa:co2ReportTemperature"/></co2ReportTemperature>
      <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
      <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
      <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
      <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
      <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
      <internal>4</internal>
    </variable>
    </xsl:for-each> <!-- pCO2a -->
    
    <!-- pCO2 discrete -->
    <xsl:for-each select="oa:variable[@xsi:type='co2_discrete']|oa:co2d">
      <variable>
      <xsl:apply-templates select="current()"/>
        
        <storageMethod><xsl:value-of select="oa:storageMethod"/></storageMethod>
        <seawatervol><xsl:value-of select="oa:seawaterVolume"/></seawatervol>
        <headspacevol><xsl:value-of select="oa:heaspaceVolume"/>5 mL</headspacevol>
        <temperatureMeasure><xsl:value-of select="oa:measurementTemperature"/></temperatureMeasure>
        
        <xsl:for-each select="oa:gasDetector">
        <gasDetector>
           <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
           <model><xsl:value-of select="oa:model"/></model>
           <resolution><xsl:value-of select="oa:resolution"/></resolution>
           <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
        </gasDetector>
        </xsl:for-each>
        
        <xsl:for-each select="oa:standarization">
          <standardization>
           <description><xsl:value-of select="oa:description"/></description>
           <frequency><xsl:value-of select="oa:frequency"/></frequency>
           <standardgas>
              <manufacturer><xsl:value-of select="oa:manufacturer"/></manufacturer>
              <concentration><xsl:value-of select="oa:concentration"/></concentration>
              <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
           </standardgas>
        </standardization>
        </xsl:for-each>
        
      <waterVaporCorrection><xsl:value-of select="oa:waterVaporCorrection"/></waterVaporCorrection>
      <temperatureCorrection><xsl:value-of select="oa:temperatureCorrectionMethod"/></temperatureCorrection>
      <co2ReportTemperature><xsl:value-of select="oa:co2ReportTemperature"/></co2ReportTemperature>
      <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
      <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
      <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
      <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
      <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
      <internal>5</internal>
    </variable>
    </xsl:for-each> <!-- pCO2d -->
    
    <!-- General and Biological variables -->
    <xsl:for-each select="oa:variable[not(@xsi:type)]|oa:variable[@xsi:type='biological_variable']">
    <variable>
      <xsl:apply-templates select="current()"/>
      
      <uncertainty><xsl:value-of select="oa:uncertainty"/></uncertainty>
      <flag><xsl:value-of select="oa:qcFlag/oa:description"/></flag>
      <methodReference><xsl:value-of select="oa:methodReference"/></methodReference>
      <researcherName><xsl:value-of select="oa:researcher/oa:name"/></researcherName>
      <researcherInstitution><xsl:value-of select="oa:researcher/oa:organization"/></researcherInstitution>
      <!--  biological elements -->
      <xsl:if test="oa:duration != ''">
      <duration><xsl:value-of select="oa:duration"/></duration>
      </xsl:if>
      <xsl:if test="oa:biologicalSubject != ''">
      <biologicalSubject><xsl:value-of select="oa:biologicalSubject"/></biologicalSubject>
      </xsl:if>
      <xsl:if test="oa:speciesID != ''">
      <speciesID><xsl:value-of select="oa:speciesID"/></speciesID>
      </xsl:if>
      <xsl:if test="oa:lifeStage != ''">
      <lifeStage><xsl:value-of select="oa:lifeStage"/></lifeStage>
      </xsl:if>
      <internal>0</internal>
    </variable>
    </xsl:for-each> <!-- General and Biological -->
  </xsl:template>
  
</xsl:stylesheet>
