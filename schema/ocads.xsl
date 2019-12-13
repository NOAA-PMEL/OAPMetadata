<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0" xmlns:oa="http://ncei.noaa.gov/oads/v_a0_2_2" 
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
   >
  
  <xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'" />
  <xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />
  
  <xsl:template match="/oa:oads_metadata">

    <xsl:variable name='confxml' select='"ocads-conf.xml"' />
    <xsl:variable name='confDoc' select='document($confxml)' />
    <xsl:variable name='title' select='$confDoc//config/option[@name="title"]'/>
    <xsl:variable name='keywords' select='$confDoc//config/option[@name="keywords"]'/>
    <xsl:variable name='website' select='$confDoc//config/option[@name="website"]'/>
    <xsl:variable name='project' select='$confDoc//config/option[@name="project"]'/>
 
    <html style="overflow-y:scroll;" > <!-- xmlns="http://www.w3.org/1999/xhtml" -->

      <head>
        <xsl:comment>Script $Id: 45b658d59e8323a235990945dd6e1a215c756090 $</xsl:comment>

        <title><xsl:value-of select="$title"/>: NCEI Accession <xsl:value-of select="oa:accn"/></title>
        <meta name="keywords">
          <xsl:attribute name="content">
            <xsl:value-of select="$keywords"/>
          </xsl:attribute>
        </meta>

        <style type="text/css">
div.indent {
        padding-left: 30px;
        text-indent: -10px;
}
td {
        vertical-align: top;
}
td.desc {
        width: 20%;
        text-align: right;
        font-weight: bold;
}
.val {
        padding-left: 10px;
        vertical-align:middle;
}
        </style>

      </head>

      <!-- style="background:#0e2e55 url(/media/images/common/bkg_nodc_dark1_top.jpg) top center no-repeat;"  -->
      <body >
        <!--  style="position:relative;padding-left:15px; padding-right:15px; width:945px; height:auto; margin-left:auto; margin-right:auto; border: 0px solid #000000;z-index:1; background-color:#fff;" -->
        <div>

          <a href="http://www.ncei.noaa.gov/" target="_blank"><img src="https://www.nodc.noaa.gov/Images/nceilogo-banner.png"/></a>

          <div style="width:100%; background-color:#ebebeb;"><span class="val"></span>
          <a target="_blank">
            <xsl:attribute name="href">
              <xsl:value-of select="$website"/>
            </xsl:attribute>
            <xsl:value-of select="$project"/>
          </a>
          </div>

          <!--title of the data set-->
          <h2><xsl:value-of select="oa:title"/></h2>

          <!--Investigators-->
          <span style="font-weight:bold">INVESTIGATOR(S): </span><br/>

   
          <xsl:for-each select="oa:investigators/oa:investigator">

            <div style="width:900px; margin-left: 30px; text-indent:-20px;">

              <strong>
                <xsl:value-of select="concat(concat(oa:name/oa:first,' '),oa:name/oa:last)"/>
              </strong>
              {
              <xsl:value-of select="oa:organization"/>,

              <xsl:if test="oa:contactInfo/oa:address/oa:deliveryPoint != ''">
                <xsl:for-each select="oa:contactInfo/oa:address/oa:deliveryPoint">
                  <xsl:apply-templates/>, 
                </xsl:for-each>
              </xsl:if>

              <xsl:if test="oa:contactInfo/oa:address/oa:city != ''">
                <xsl:value-of select="oa:contactInfo/oa:address/oa:city"/>,
              </xsl:if>

              <xsl:if test="oa:contactInfo/oa:address/oa:administrativeArea != ''">
                <xsl:value-of select="oa:contactInfo/oa:address/oa:administrativeArea"/>,
              </xsl:if>

              <xsl:if test="oa:contactInfo/oa:address/oa:postalCode != ''">
                <xsl:value-of select="oa:contactInfo/oa:address/oa:postalCode"/>,
              </xsl:if>

              <xsl:value-of select="oa:contactInfo/oa:address/oa:country"/>
              }
              <br/>

            </div>

          </xsl:for-each>

          <br/>

          <span style="font-weight:bold">ABSTRACT: </span><xsl:value-of select="oa:abstract"/>
          <br/><br/>

          <span style="font-weight:bold">CITE AS: </span><xsl:value-of select="oa:citation"/>
          <br/><br/>

          <xsl:if test="oa:dataUse != ''">
            <span style="font-weight:bold">DATA USE: </span>
            <xsl:value-of select="oa:dataUse"/>
            <br/><br/>
          </xsl:if>

          <!--Buttons for NCEI landing page and data downloading
          <span style="padding-left:250px">
            <a href="{link_landing}" target="_blank"><input type="button" style="background-color:#A9E2F3;" value="NCEI metadata"/></a>
          </span>

          <span style="padding-left:220px">
            <a href="{link_download}" target="_blank"><input type="button" style="background-color:#A9E2F3;" value="Download data"/></a>
          </span>
          <br/><br/>
-->

          <span style="font-weight:bold; padding-left:0px; ">IDENTIFICATION INFORMATION FOR THIS DATA PACKAGE: </span><br/>

          <span style="padding-left:20px; font-weight: bold;">NCEI ACCESSION: </span><xsl:value-of select="oa:accn"/>
          <br/>

          <span style="padding-left:20px; font-weight: bold;">NCEI DOI: </span><xsl:value-of select="oa:doi"/>
          <br/>

          <div class="indent"><span style="font-weight: bold;">EXPOCODE: </span>
          <xsl:if test="oa:expocodes/oa:expocode != ''">
            <xsl:for-each select="oa:expocodes/oa:expocode">
              <xsl:apply-templates/>;
            </xsl:for-each>
          </xsl:if>
          </div>

          <div class="indent"><span style="font-weight: bold;">CRUISE ID: </span>
          <xsl:if test="oa:cruiseIds/oa:cruiseId != ''">
            <xsl:for-each select="oa:cruiseIds/oa:cruiseId">
              <xsl:apply-templates/>;
            </xsl:for-each>
          </xsl:if>
          </div>

          <span style="padding-left:20px; font-weight: bold;">SECTION/LEG: </span>
          <xsl:if test="oa:section != ''">
            <xsl:for-each select="oa:section">
              <xsl:apply-templates/>;
            </xsl:for-each>
          </xsl:if>
          <br/><br/>

          <table style="width:945px">
            <tr><td style="width: 450px;">
              <table style="padding-left:0px; width:430px">
                <span style="font-weight:bold">TYPES OF STUDY: </span><br/>
                   <xsl:for-each select="oa:variables/*/oa:observationType[not(preceding::oa:observationType = .)]">
                      <span style="padding-left:20px;"><xsl:value-of select="."/>;</span>  <!-- <xsl:apply-templates/> -->
                      <br/>
                    </xsl:for-each>
                <br/>
              </table>

              <span style="font-weight:bold;">TEMPORAL COVERAGE: </span> <br/>
              <table style="padding-left:20px; width:500px">
                <tr>
                  <td style="width: 50%; text-align:left;">START DATE: <xsl:value-of select="oa:temporalExtents/oa:startDate"/></td>
                  <td style="width: 50%; text-align:left;">END DATE: <xsl:value-of select="oa:temporalExtents/oa:endDate"/></td>
                </tr>
                </table> <br/>

                <span style="font-weight:bold;">SPATIAL COVERAGE: </span> <br/>
                <table style="padding-left:20px; width:500px">
                  <tr>
                    <td style="padding-left:110px; text-align:left;">NORTH BOUNDARY: 
                      <xsl:value-of select="oa:spatialExtents/oa:northernBounds"/></td>
                  </tr>
                </table>

                <table style="padding-left:20px; width:500px">
                  <tr>
                    <td style="width: 50%; text-align:left;">WEST BOUNDARY: 
                      <xsl:value-of select="oa:spatialExtents/oa:westernBounds"/></td>
                    <td style="width: 50%; text-align:left;">EAST BOUNDARY: 
                      <xsl:value-of select="oa:spatialExtents/oa:easternBounds"/></td>
                  </tr>
                </table>
                <table style="padding-left:20px; width:500px">
                  <tr>
                    <td style="padding-left:110px; text-align:left;">SOUTH BOUNDARY: 
                      <xsl:value-of select="oa:spatialExtents/oa:southernBounds"/></td>
                  </tr>
                  </table><br/>

                  <table style="padding-left:0px; width:430px">
                    <span style="font-weight:bold">GEOGRAPHIC NAMES: </span><br/>
                    <span style="padding-left:15px;">
                      <xsl:for-each select="oa:sampleCollectionRegions/oa:region">
                        <span style="padding-left:5px;"><xsl:apply-templates/>;</span>
                      </xsl:for-each>
                      </span><br/>

                      <xsl:if test="oa:locationOrganism != ''">
                        <br/>
                        <span style="font-weight:bold">LOCATION OF ORGANISM COLLECTION: </span><br/>
                        <xsl:for-each select="oa:organismCollectionRegions/oa:region">
                          <span style="padding-left:5px;"><xsl:apply-templates/>;</span>
                        </xsl:for-each>
                        <br/>
                      </xsl:if>

                      <br/>

                      <span style="font-weight:bold">PLATFORMS: </span><br/>
                      <xsl:if test="oa:platforms/oa:platform != ''">
                        <div style="padding-left:15px;">
                          <xsl:for-each select="oa:platforms/oa:platform">
                            <xsl:choose>
                              <xsl:when test="oa:identifier =''">
                                <xsl:value-of select="oa:name"/>;
                              </xsl:when>
                              <xsl:otherwise>
                                <xsl:value-of select="oa:name"/> (ID (<xsl:value-of select="oa:identifier/@type"/>): <xsl:value-of select="oa:identifier"/>);
                              </xsl:otherwise>
                            </xsl:choose><br/>
                            </xsl:for-each>
                        </div>
                        </xsl:if><br/>

                        <span style="font-weight:bold">RESEARCH PROJECT(S): </span><br/>
                        <xsl:if test="oa:researchProjects/oa:project != ''">
                          <xsl:for-each select="oa:researchProjects/oa:project">
                            <span style="padding-left:20px;"><xsl:apply-templates/></span><br/>
                          </xsl:for-each>
                        </xsl:if>

                  </table>

                </td>

                <!--map or image-->
                <td style="width:450px; height:400px;">
                  <a href="{link_img}" target="_blank"><img src="{link_img}" style="max-width:420px; max-height:400px;"/></a>
                </td>

            </tr>
          </table>
          <br/>

          <xsl:apply-templates select="oa:variables"/>
          
          <span style="font-weight:bold">DATA PACKAGES RELATED TO THIS ONE:</span><br/>
          <xsl:if test="oa:related/oa:name != ''">
            <span style="padding-left:20px;"></span>
            NCEI Accession(s)
            <xsl:for-each select="oa:related">
              <a href="{link}"><xsl:value-of select="oa:name"/></a>;
            </xsl:for-each>
          </xsl:if>

          <br/><br/>

          <span style="font-weight:bold">PUBLICATIONS DESCRIBING THIS DATA SET: </span><br/>
          <xsl:if test="oa:references/oa:reference != ''">
            <xsl:for-each select="oa:references/oa:reference">
              <span style="padding-left:20px;"></span><xsl:apply-templates/><br/>
            </xsl:for-each>
          </xsl:if>

          <br/>

          <span style="font-weight:bold">ADDITIONAL INFORMATION: </span><br/>
          <span style="padding-left:20px;"></span>
          <xsl:if test="oa:suppleInfo != ''">
            <xsl:for-each select="oa:suppleInfo">
              <span style="padding-left:20px;"><xsl:apply-templates/></span><br/>
            </xsl:for-each>
          </xsl:if>
          <br/>

          <span style="font-weight:bold">FUNDING Information: </span><br/>
          <ul>
          <xsl:for-each select="oa:fundingInfo/oa:source">
            <li>
            <span style="padding-left:20px;"><xsl:value-of select="oa:agency"/></span><br/>
            <span style="font-style:italic; padding-left:40px;">PROJECT TITLE: </span><xsl:value-of select="oa:title"/><br/>
            <span style="font-style:italic; padding-left:40px;">PROJECT ID: </span><xsl:value-of select="oa:identifier"/><br/><br/>
            </li>
          </xsl:for-each>
          </ul>

          <span style="font-weight:bold">SUBMITTED BY: </span>
          <xsl:for-each select="oa:dataSubmitter">
            <span style="padding-left:3px;"><xsl:value-of select="oa:name"/> (<xsl:value-of select="oa:contactInfo/oa:email"/>) </span><br/>
          </xsl:for-each>
          <br/>

          <span style="font-weight:bold">SUBMISSION DATE: </span>
          <xsl:value-of select="oa:submissionDate"/>
          <br/><br/>

          <span style="font-weight:bold">REVISION DATE: </span>
          <xsl:value-of select="oa:revisionDate"/>
          <br/><br/>

          <span style="font-weight:bold">PREVIOUS VERSIONS: </span>
          <xsl:for-each select="oa:old">
            <span style="padding-left:5px;"><a href="{link}" target="_blank"><xsl:value-of select="oa:name"/></a></span>
          </xsl:for-each>
          <br/><br/>

        </div>

        <!-- FOOTER from ../oceans/includes/footlinks.inc -X->
        <div style="text-align:center;"><br/>
        <span style="color:white">Last updated on: <xsl:value-of select="oa:update"/></span><br/>
        <span style="color:white"><a href="https://www.commerce.gov/" title="U.S. Department of Commerce" target="_blank" style="color:white;">DOC</a></span>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.noaa.gov/" title="National Oceanic and Atmospheric Administration" target="_blank"  style="color:white;">NOAA</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="https://www.nesdis.noaa.gov/" title="National Environmental Satellite, Data, and Information Service" target="_blank"  style="color:white;">NESDIS</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="https://www.ncei.noaa.gov/" title="National Centers for Environmental Information" target="_blank"  style="color:white;">NCEI</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="mailto:NCEI.Info@noaa.gov" title="Send mail to NCEI" target="_blank"  style="color:white;">NCEI.Info@noaa.gov</a>
        <br/>

        <a href="/about/disclaimer.html" title="NOAA Disclaimer" target="_blank"  style="color:white;">Disclaimer</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.noaa.gov/privacy.html" title="NOAA Privacy Policy" target="_blank"  style="color:white;">Privacy Policy</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.copyright.gov/title17/92chap4.html#403" title="Copyright Notice" target="_blank"  style="color:white;">Copyright Notice</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.rdc.noaa.gov/~foia/" title="Freedom of Information Act" target="_blank"  style="color:white;">FOIA</a>
        <br/>

        <a href="/survey.html" title="NCEI, Maryland Office, Website Survey" target="_blank"  style="color:white;">Take our survey</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.cio.noaa.gov/services_programs/info_quality.html" title="Information Quality" target="_blank"  style="color:white;">Info Quality</a>
        <xsl:text>&#160;&#160;|&#160;&#160;</xsl:text>
        <a href="http://www.usa.gov/" title="U.S. Government's Official Web Portal" target="_blank"  style="color:white;">USA.gov</a>
        <br/><br/>

        <a href="https://twitter.com/NOAANCEIocngeo"><img src="/media/images/common/twitter3.gif" alt="Like us on Twitter" width="20" height="20" /></a>
        <a href="http://www.facebook.com/NOAANCEIoceangeo"><img src="/media/images/common/facebook3.gif" alt="Like us on Facebook" width="20" height="20" /></a>
        <a href="/rss/"><img src="/media/images/common/rssfeed-icon2.jpg" alt="RSS feed" width="20" height="20" /></a>
        <br/><br/><br/>
        </div>
        <!-X- footer ends-->

      </body>
    </html>

  </xsl:template>

  <xsl:template name="variables" match="oa:variables">
          <span style="font-weight:bold;">VARIABLES / PARAMETERS: </span>
          <br/><br/>  
  
          <!-- Dissolved Inorganic Carbon -->
          <xsl:for-each select="oa:variable[@xsi:type='dic_variable_type']|oa:dic">

            <hr/>

            <table width="940">
              <tr>
                <td style="font-weight:bold; font-style:italic; text-align:center;">Dissolved Inorganic Carbon</td>
              </tr>
            </table>
            <br/>
            <table width="940">

              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr>
              </xsl:if>
              <xsl:if test="oa:description != ''"><tr>
                <td class="desc">Description: </td>
                <td class="val"><xsl:value-of select="oa:description"/></td>
              </tr></xsl:if>
              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>
              
              <xsl:if test="oa:units != ''"><tr>
                <td class="desc">Units: </td>
                <td class="val"><xsl:value-of select="oa:units"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">Variable type: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:replicate != ''"><tr>
                <td class="desc">Replicate information: </td>
                <td class="val"><xsl:value-of select="oa:replicate"/></td>
              </tr></xsl:if>

              <!--standard-->
              <xsl:for-each select="oa:standard">

                <xsl:if test="oa:description != ''"><tr>
                  <td class="desc">Standardization description: </td>
                  <td class="val"><xsl:value-of select="oa:description"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:frequency != ''"><tr>
                  <td class="desc">Standardization frequency: </td>
                  <td class="val"><xsl:value-of select="oa:frequency"/></td>
                </tr></xsl:if>

                <xsl:for-each select="oa:crm">

                  <xsl:if test="oa:manufacturer != ''"><tr>
                    <td class="desc">CRM manufacturer: </td>
                    <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:batch != ''"><tr>
                    <td class="desc">CRM batch number: </td>
                    <td class="val"><xsl:value-of select="oa:batch"/></td>
                  </tr></xsl:if>

                </xsl:for-each>

              </xsl:for-each>

              <!-- poison -->
              <xsl:for-each select="oa:poison">

                <xsl:if test="oa:poisonName != ''"><tr>
                  <td class="desc">Poison name: </td>
                  <td class="val"><xsl:value-of select="oa:poisonName"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:volume != ''"><tr>
                  <td class="desc">Poison volume: </td>
                  <td class="val"><xsl:value-of select="oa:volume"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:correction != ''"><tr>
                  <td class="desc">Poison correction: </td>
                  <td class="val"><xsl:value-of select="oa:correction"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
                <td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
                <td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <!-- Total alkalinity -->

          <xsl:for-each select="oa:variable[@xsi:type='ta_variable_type']|oa:ta">

            <hr/>

            <table width="940"><tr>
              <td style="font-weight:bold; font-style:italic; text-align:center;">Total alkalinity</td>
            </tr></table>

            <br/>

            <table width="940">

              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:description != ''"><tr>
                <td class="desc">Description: </td>
                <td class="val"><xsl:value-of select="oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:units != ''"><tr>
                <td class="desc">Units: </td>
                <td class="val"><xsl:value-of select="oa:units"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">In-situ / Manipulation / Response variable: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measured != ''"><tr>
                <td class="desc">Measured or calculated: </td>
                <td class="val"><xsl:value-of select="oa:measured"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:titrationType != ''"><tr>
                <td class="desc">Type of titration: </td>
                <td class="val"><xsl:value-of select="oa:titrationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:cellType != ''"><tr>
                <td class="desc">Cell type (open or closed): </td>
                <td class="val"><xsl:value-of select="oa:cellType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:curveFitting != ''"><tr>
                <td class="desc">Curve fitting method: </td>
                <td class="val"><xsl:value-of select="oa:curveFitting"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:replicate != ''"><tr>
                <td class="desc">Replicate information: </td>
                <td class="val"><xsl:value-of select="oa:replicate"/></td>
              </tr></xsl:if>

              <!--standard-->
              <xsl:for-each select="oa:standard">

                <xsl:if test="oa:description != ''"><tr>
                  <td class="desc">Standardization description: </td>
                  <td class="val"><xsl:value-of select="oa:description"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:frequency != ''"><tr>
                  <td class="desc">Standardization frequency: </td>
                  <td class="val"><xsl:value-of select="oa:frequency"/></td>
                </tr></xsl:if>

                <xsl:for-each select="oa:crm">

                  <xsl:if test="oa:manufacturer != ''"><tr>
                    <td class="desc">CRM manufacturer: </td>
                    <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:batch != ''"><tr>
                    <td class="desc">CRM batch number: </td>
                    <td class="val"><xsl:value-of select="oa:batch"/></td>
                  </tr></xsl:if>

                </xsl:for-each>

              </xsl:for-each>

              <!-- poison -->
              <xsl:for-each select="oa:poison">

                <xsl:if test="oa:poisonName != ''"><tr>
                  <td class="desc">Poison name: </td>
                  <td class="val"><xsl:value-of select="oa:poisonName"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:volume != ''"><tr>
                  <td class="desc">Poison volume: </td>
                  <td class="val"><xsl:value-of select="oa:volume"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:correction != ''"><tr>
                  <td class="desc">Poison correction: </td>
                  <td class="val"><xsl:value-of select="oa:correction"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <xsl:if test="oa:blank != ''"><tr>
                <td class="desc">TA blank correction: </td>
                <td class="val"><xsl:value-of select="oa:blank"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <!-- pH -->

    <xsl:for-each select="oa:variable[@xsi:type='ph_variable_type']|oa:ph">
            <hr/>

            <table width="940"><tr>
              <td style="font-weight:bold; font-style:italic; text-align:center;">pH</td>
            </tr></table>

            <br/>

            <table width="940">
              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:description != ''"><tr>
                <td class="desc">Description: </td>
                <td class="val"><xsl:value-of select="oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:phScale != ''"><tr>
                <td class="desc">pH scale: </td>
                <td class="val"><xsl:value-of select="oa:phScale"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">In-situ / Manipulation / Response variable: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measured != ''"><tr>
                <td class="desc">Measured or calculated: </td>
                <td class="val"><xsl:value-of select="oa:measured"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:temperatureMeasure != ''"><tr>
                <td class="desc">Temperature of pH measurement: </td>
                <td class="val"><xsl:value-of select="oa:temperatureMeasure"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:replicate != ''"><tr>
                <td class="desc">Replicate information: </td>
                <td class="val"><xsl:value-of select="oa:replicate"/></td>
              </tr></xsl:if>

              <!--standard-->
              <xsl:for-each select="oa:standardization">

                <xsl:if test="oa:description != ''"><tr>
                  <td class="desc">Standardization description: </td>
                  <td class="val"><xsl:value-of select="oa:description"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:frequency != ''"><tr>
                  <td class="desc">Standardization frequency: </td>
                  <td class="val"><xsl:value-of select="oa:frequency"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:phOfStandards != ''"><tr>
                  <td class="desc">pH standard values: </td>
                  <td class="val"><xsl:value-of select="oa:phOfStandards"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:temperature != ''"><tr>
                  <td class="desc">Temperature of standardization: </td>
                  <td class="val"><xsl:value-of select="oa:temperature"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <xsl:if test="oa:temperatureCorrectionMethod != ''"><tr>
                <td class="desc">Temperature correction method: </td>
                <td class="val"><xsl:value-of select="oa:temperatureCorrectionMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:phReportTemperature != ''"><tr>
                <td class="desc">At what temperature was pH reported: </td>
                <td class="val"><xsl:value-of select="oa:phReportTemperature"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <!-- pCO2 autonomous -->

          <xsl:for-each select="oa:variable[@xsi:type='co2d_variable_type']|oa:co2a">
            <hr/>

            <table width="940"><tr>
              <td style="font-weight:bold; font-style:italic; text-align:center;">pCO2 (fCO2) autonomous</td>
            </tr></table>

            <br/>

            <table width="940">

              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:description != ''"><tr>
                <td class="desc">Description: </td>
                <td class="val"><xsl:value-of select="oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:units != ''"><tr>
                <td class="desc">Units: </td>
                <td class="val"><xsl:value-of select="oa:units"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">In-situ / Manipulation / Response variable: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measured != ''"><tr>
                <td class="desc">Measured or calculated: </td>
                <td class="val"><xsl:value-of select="oa:measured"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:locationSeawaterIntake != ''"><tr>
                <td class="desc">Location of seawater intake: </td>
                <td class="val"><xsl:value-of select="oa:locationSeawaterIntake"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:depthSeawaterIntake != ''"><tr>
                <td class="desc">Depth of seawater intake: </td>
                <td class="val"><xsl:value-of select="oa:depthSeawaterIntake"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measurementFrequency != ''"><tr>
                <td class="desc">Measurement Frequency: </td>
                <td class="val"><xsl:value-of select="oa:measurementFrequency"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:environmentalControl != ''"><tr>
                <td class="desc">Environmental control: </td>
                <td class="val"><xsl:value-of select="oa:environmentalControl"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analysisCO2comparison != ''"><tr>
                <td class="desc">Analysis of CO2 comparison: </td>
                <td class="val"><xsl:value-of select="oa:analysisCO2comparison"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measuredCO2params != ''"><tr>
                <td class="desc">Measured CO2 parameters: </td>
                <td class="val"><xsl:value-of select="oa:measuredCO2params"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:numberNonZeroGasStds != ''"><tr>
                <td class="desc">Number of none zero standards: </td>
                <td class="val"><xsl:value-of select="oa:numberNonZeroGasStds"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <!--equilibrator-->
              <xsl:for-each select="oa:equilibrator">

                <xsl:if test="oa:type != ''"><tr>
                  <td class="desc">Equilibrator type: </td>
                  <td class="val"><xsl:value-of select="oa:type"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:volume != ''"><tr>
                  <td class="desc">Equilibrator volume: </td>
                  <td class="val"><xsl:value-of select="oa:volume"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:vented != ''"><tr>
                  <td class="desc">Is the equilibrator vented or not: </td>
                  <td class="val"><xsl:value-of select="oa:vented"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:waterFlowRate != ''"><tr>
                  <td class="desc">Water flow rate: </td>
                  <td class="val"><xsl:value-of select="oa:waterFlowRate"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:gasFlowRate != ''"><tr>
                  <td class="desc">Gas flow rate: </td>
                  <td class="val"><xsl:value-of select="oa:gasFlowRate"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:temperatureEquilibratorMethod != ''"><tr>
                  <td class="desc">How was temperature inside the equilibrator measured: </td>
                  <td class="val"><xsl:value-of select="oa:temperatureEquilibratorMethod"/></td>
                </tr></xsl:if>

                <xsl:for-each select="oa:equilibratorTemp">

                  <xsl:if test="oa:location != ''"><tr>
                    <td class="desc">Equilibrator temperature location: </td>
                    <td class="val"><xsl:value-of select="oa:location"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:manufacturer != ''"><tr>
                    <td class="desc">Equilibrator temperature sensor manufacturer: </td>
                    <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:model != ''"><tr>
                    <td class="desc">Equilibrator temperature sensor model: </td>
                    <td class="val"><xsl:value-of select="oa:model"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:accuracy != ''"><tr>
                    <td class="desc">Equilibrator temperature sensor accuracy: </td>
                    <td class="val"><xsl:value-of select="oa:accuracy"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:precision != ''"><tr>
                    <td class="desc">Equilibrator temperature sensor precision: </td>
                    <td class="val"><xsl:value-of select="oa:precision"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:calibration != ''"><tr>
                    <td class="desc">Equilibrator temperature sensor calibration: </td>
                    <td class="val"><xsl:value-of select="oa:calibration"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:warming != ''"><tr>
                    <td class="desc">Equilibrator temperature warming: </td>
                    <td class="val"><xsl:value-of select="oa:warming"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:otherComments != ''"><tr>
                    <td class="desc">Equilibrator temperature other comments: </td>
                    <td class="val"><xsl:value-of select="oa:otherComments"/></td>
                  </tr></xsl:if>

                </xsl:for-each>

                <xsl:if test="oa:pressureEquilibratorMethod != ''"><tr>
                  <td class="desc">How was pressure inside the equilibrator measured: </td>
                  <td class="val"><xsl:value-of select="oa:pressureEquilibratorMethod"/></td>

                  <xsl:for-each select="oa:equilibratorPress">

                    <xsl:if test="oa:location != ''"><tr>
                      <td class="desc">Equilibrator pressure location: </td>
                      <td class="val"><xsl:value-of select="oa:location"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:manufacturer != ''"><tr>
                      <td class="desc">Equilibrator pressure sensor manufacturer: </td>
                      <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:model != ''"><tr>
                      <td class="desc">Equilibrator pressure sensor model: </td>
                      <td class="val"><xsl:value-of select="oa:model"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:accuracy != ''"><tr>
                      <td class="desc">Equilibrator pressure sensor accuracy: </td>
                      <td class="val"><xsl:value-of select="oa:accuracy"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:precision != ''"><tr>
                      <td class="desc">Equilibrator pressure sensor precision: </td>
                      <td class="val"><xsl:value-of select="oa:precision"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:calibration != ''"><tr>
                      <td class="desc">Equilibrator pressure sensor calibration: </td>
                      <td class="val"><xsl:value-of select="oa:calibration"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:warming != ''"><tr>
                      <td class="desc">Equilibrator pressure warming: </td>
                      <td class="val"><xsl:value-of select="oa:warming"/></td>
                    </tr></xsl:if>

                    <xsl:if test="oa:otherComments != ''"><tr>
                      <td class="desc">Equilibrator pressure other comments: </td>
                      <td class="val"><xsl:value-of select="oa:otherComments"/></td>
                    </tr></xsl:if>

                  </xsl:for-each>

                </tr></xsl:if>

                <xsl:if test="oa:dryMethod != ''"><tr>
                  <td class="desc">Drying method for gas: </td>
                  <td class="val"><xsl:value-of select="oa:dryMethod"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <!--  gas detector for water -->
              <xsl:for-each select="oa:gasDetector">

                <xsl:if test="oa:manufacturer != ''"><tr>
                  <td class="desc">SEA CO2 gas detector manufacturer: </td>
                  <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:model != ''"><tr>
                  <td class="desc">SEA CO2 gas detector model: </td>
                  <td class="val"><xsl:value-of select="oa:model"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:resolution != ''"><tr>
                  <td class="desc">SEA CO2 gas detector resolution: </td>
                  <td class="val"><xsl:value-of select="oa:resolution"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:uncertainty != ''"><tr>
                  <td class="desc">SEA CO2 gas detector uncertainty: </td>
                  <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <!--  gas detector for atmosphere-->
              <xsl:for-each select="oa:gasDetectorAtm">

                <xsl:if test="oa:manufacturer != ''"><tr>
                  <td class="desc">ATM CO2 gas detector manufacturer: </td>
                  <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:model != ''"><tr>
                  <td class="desc">ATM CO2 gas detector model: </td>
                  <td class="val"><xsl:value-of select="oa:model"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:resolution != ''"><tr>
                  <td class="desc">ATM CO2 gas detector resolution: </td>
                  <td class="val"><xsl:value-of select="oa:resolution"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:uncertainty != ''"><tr>
                  <td class="desc">ATM CO2 gas detector uncertainty: </td>
                  <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <!--  standardization -->
              <xsl:for-each select="oa:standardization">

                <xsl:if test="oa:description != ''"><tr>
                  <td class="desc">Standardization technique: </td>
                  <td class="val"><xsl:value-of select="oa:description"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:frequency != ''"><tr>
                  <td class="desc">Standardization frequency: </td>
                  <td class="val"><xsl:value-of select="oa:frequency"/></td>
                </tr></xsl:if>

                <xsl:for-each select="oa:standardgas">

                  <xsl:if test="oa:manufacturer != ''"><tr>
                    <td class="desc">Standard gas manufacturer: </td>
                    <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:concentration != ''"><tr>
                    <td class="desc">Standard gas concentration: </td>
                    <td class="val"><xsl:value-of select="oa:concentration"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:uncertainty != ''"><tr>
                    <td class="desc">Standard gas uncertainty: </td>
                    <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
                  </tr></xsl:if>

                </xsl:for-each>

              </xsl:for-each>

              <xsl:if test="oa:waterVaporCorrection != ''"><tr>
                <td class="desc">Water vapor correction method: </td>
                <td class="val"><xsl:value-of select="oa:waterVaporCorrection"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:temperatureCorrection != ''"><tr>
                <td class="desc">Temperature correction method: </td>
                <td class="val"><xsl:value-of select="oa:temperatureCorrection"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:co2ReportTemperature != ''"><tr>
                <td class="desc">At what temperature was pCO2 reported: </td>
                <td class="val"><xsl:value-of select="oa:co2ReportTemperature"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

              <xsl:for-each select="oa:atmCO2">

                <xsl:if test="oa:measurement != ''"><tr>
                  <td class="desc">Atmosphere CO2 measurement frequency: </td>
                  <td class="val"><xsl:value-of select="oa:measurement"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:locationAndHeight != ''"><tr>
                  <td class="desc">Atmosphere CO2 measurement location and height: </td>
                  <td class="val"><xsl:value-of select="oa:locationAndHeight"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:dryMethod != ''"><tr>
                  <td class="desc">Atmosphere CO2 measurement dry method: </td>
                  <td class="val"><xsl:value-of select="oa:dryMethod"/></td>
                </tr></xsl:if>

              </xsl:for-each>

			  <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <!-- pCO2 discrete -->

          <xsl:for-each select="variable[@xsi:type='co2d_variable_type']|oa:co2d">

            <hr/>

            <table width="940"><tr>
              <td style="font-weight:bold; font-style:italic; text-align:center;">pCO2 (fCO2) discrete</td>
            </tr></table>

            <br/>

            <table width="940">

              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:description != ''"><tr>
                <td class="desc">Description: </td>
                <td class="val"><xsl:value-of select="oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:units != ''"><tr>
                <td class="desc">Units: </td>
                <td class="val"><xsl:value-of select="oa:units"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">In-situ / Manipulation / Response variable: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:measured != ''"><tr>
                <td class="desc">Measured or calculated: </td>
                <td class="val"><xsl:value-of select="oa:measured"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:storageMethod != ''"><tr>
                <td class="desc">Storage method: </td>
                <td class="val"><xsl:value-of select="oa:storageMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:seawatervol != ''"><tr>
                <td class="desc">Seawater volume: </td>
                <td class="val"><xsl:value-of select="oa:seawatervol"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:headspacevol != ''"><tr>
                <td class="desc">Headspace volume: </td>
                <td class="val"><xsl:value-of select="oa:headspacevol"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:temperatureMeasure != ''"><tr>
                <td class="desc">Temperature of measurement: </td>
                <td class="val"><xsl:value-of select="oa:temperatureMeasure"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:replicate != ''"><tr>
                <td class="desc">Sample replicate information: </td>
                <td class="val"><xsl:value-of select="oa:replicate"/></td>
              </tr></xsl:if>

              <!--  gas detector -->
              <xsl:for-each select="oa:gasDetector">

                <xsl:if test="oa:manufacturer != ''"><tr>
                  <td class="desc">Gas detector manufacturer: </td>
                  <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:model != ''"><tr>
                  <td class="desc">Gas detector model: </td>
                  <td class="val"><xsl:value-of select="oa:model"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:resolution != ''"><tr>
                  <td class="desc">Gas detector resolution: </td>
                  <td class="val"><xsl:value-of select="oa:resolution"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:uncertainty != ''"><tr>
                  <td class="desc">Gas detector uncertainty: </td>
                  <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
                </tr></xsl:if>

              </xsl:for-each>

              <!--  standardization -->
              <xsl:for-each select="oa:standardization">

                <xsl:if test="oa:description != ''"><tr>
                  <td class="desc">Standardization technique: </td>
                  <td class="val"><xsl:value-of select="oa:description"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:frequency != ''"><tr>
                  <td class="desc">Standardization frequency: </td>
                  <td class="val"><xsl:value-of select="oa:frequency"/></td>
                </tr></xsl:if>

                <xsl:if test="oa:temperatureStd != ''"><tr>
                  <td class="desc">Temperature of standardization: </td>
                  <td class="val"><xsl:value-of select="oa:temperatureStd"/></td>
                </tr></xsl:if>

                <xsl:for-each select="oa:standardgas">

                  <xsl:if test="oa:manufacturer != ''"><tr>
                    <td class="desc">Standard gas manufacturer: </td>
                    <td class="val"><xsl:value-of select="oa:manufacturer"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:concentration != ''"><tr>
                    <td class="desc">Standard gas concentration: </td>
                    <td class="val"><xsl:value-of select="oa:concentration"/></td>
                  </tr></xsl:if>

                  <xsl:if test="oa:uncertainty != ''"><tr>
                    <td class="desc">Standard gas uncertainty: </td>
                    <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
                  </tr></xsl:if>

                </xsl:for-each>

              </xsl:for-each>

              <xsl:if test="oa:waterVaporCorrection != ''"><tr>
                <td class="desc">Water vapor correction method: </td>
                <td class="val"><xsl:value-of select="oa:waterVaporCorrection"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:temperatureCorrection != ''"><tr>
                <td class="desc">Temperature correction method: </td>
                <td class="val"><xsl:value-of select="oa:temperatureCorrection"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:co2ReportTemperature != ''"><tr>
                <td class="desc">At what temperature was pCO2 reported: </td>
                <td class="val"><xsl:value-of select="oa:co2ReportTemperature"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <!--Variables-->

          <xsl:for-each select="oa:variable[not(@xsi:type)]">

            <hr/>

            <table width="940"><tr>
              <td style="font-weight:bold; font-style:italic; text-align:center;"><xsl:value-of select="oa:fullName"/></td>
            </tr></table>

            <br/>

            <table width="940">

<!--
              <xsl:if test="oa:fullName != ''"><tr>
                <td class="desc">Name: </td>
                <td class="val"><xsl:value-of select="oa:fullName"/></td>
              </tr></xsl:if>
-->
              <xsl:if test="oa:datasetVarName != ''"><tr>
                <td class="desc">Dataset Variable Name: </td>
                <td class="val"><xsl:value-of select="oa:datasetVarName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:units != ''"><tr>
                <td class="desc">Units: </td>
                <td class="val"><xsl:value-of select="oa:units"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:controlledName != ''"><tr>
                <td class="desc">Controlled vocabulary name: </td>
                <td class="val"><xsl:value-of select="oa:controlledName"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:observationType != ''"><tr>
                <td class="desc">Observation type: </td>
                <td class="val"><xsl:value-of select="oa:observationType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:variableType != ''"><tr>
                <td class="desc">Variable Type: </td>
                <td class="val"><xsl:value-of select="oa:variableType"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:calcMethod != ''"><tr>
                <td class="desc">Calculation method and parameters: </td>
                <td class="val"><xsl:value-of select="oa:calcMethod"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:samplingInstrument != ''"><tr>
                <td class="desc">Sampling instrument: </td>
                <td class="val"><xsl:value-of select="oa:samplingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:analyzingInstrument != ''"><tr>
                <td class="desc">Analyzing instrument: </td>
                <td class="val"><xsl:value-of select="oa:analyzingInstrument"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:sensorManufacturer != ''"><tr>
                <td class="desc">Sensor manufacturer: </td>
                <td class="val"><xsl:value-of select="oa:sensorManufacturer"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:sensorModel != ''"><tr>
                <td class="desc">Sensor model: </td>
                <td class="val"><xsl:value-of select="oa:sensorModel"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:sensorResolution != ''"><tr>
                <td class="desc">Sensor resolution: </td>
                <td class="val"><xsl:value-of select="oa:sensorResolution"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:sensorCalibration != ''"><tr>
                <td class="desc">Sensor calibration: </td>
                <td class="val"><xsl:value-of select="oa:sensorCalibration"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:sensorDepth != ''"><tr>
                <td class="desc">Sensor depth: </td>
                <td class="val"><xsl:value-of select="oa:sensorDepth"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:duration != ''"><tr>
                <td class="desc">Duration: </td>
                <td class="val"><xsl:value-of select="oa:duration"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:detailedInfo != ''"><tr>
                <td class="desc">Detailed sampling and analyzing information: </td>
                <td class="val"><xsl:value-of select="oa:detailedInfo"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:replicate != ''"><tr>
                <td class="desc">Replicate information: </td>
                <td class="val"><xsl:value-of select="oa:replicate"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:uncertainty != ''"><tr>
                <td class="desc">Uncertainty: </td>
                <td class="val"><xsl:value-of select="oa:uncertainty"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:qcFlag/oa:description != ''"><tr>
                <td class="desc">Quality flag convention: </td>
                <td class="val"><xsl:value-of select="oa:qcFlag/oa:description"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:methodReference != ''"><tr>
                <td class="desc">Method reference: </td>
                <td class="val"><xsl:value-of select="oa:methodReference"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:biologicalSubject != ''"><tr>
                <td class="desc">Biological subject: </td>
                <td class="val"><xsl:value-of select="oa:biologicalSubject"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:speciesID != ''"><tr>
                <td class="desc">Species ID: </td>
                <td class="val"><xsl:value-of select="oa:speciesID"/></td>
              </tr></xsl:if>

              <xsl:if test="oa:QC != ''"><tr>
                <td class="desc">QC steps: </td>
                <td class="val"><xsl:value-of select="oa:QC"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:name != ''"><tr>
                <td class="desc">Researcher name: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:name"/></td>
              </tr></xsl:if>

			  <xsl:if test="oa:researcher/oa:organization != ''"><tr>
                <td class="desc">Researcher organization: </td>
				<td class="val"><xsl:value-of select="oa:researcher/oa:organization"/></td>
              </tr></xsl:if>

            </table>

          </xsl:for-each>

          <hr/>
          <br/>
        
  </xsl:template>
</xsl:stylesheet>
