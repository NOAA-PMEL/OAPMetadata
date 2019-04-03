<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:oa="http://ncei.noaa.gov/oads_metadata" 
  xmlns:xs="http://www.w3.org/2001/XMLSchema"
  exclude-result-prefixes="xs"
  version="1.0">
  <xsl:output omit-xml-declaration="true"/>
  
  <xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'" />
  <xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />
  <xsl:variable name="obsTypes" select="translate(/oa:oads_metadata/oa:variables/*/oa:observationType, $uppercase, $lowercase)"/>
  <xsl:template match="/oa:oads_metadata">
    
    <xsl:for-each select="oa:variables/*">
      <xsl:variable name="obsType" select="translate(normalize-space(oa:observationType), $uppercase, $lowercase)"/>
      <xsl:variable name="preceding" select="translate(normalize-space(preceding::oa:observationType), $uppercase, $lowercase)"/>
      <xsl:value-of select="translate(normalize-space(oa:observationType[not($preceding = $obsType)]),$uppercase, $lowercase)"/>
    </xsl:for-each>
    
  </xsl:template>
  
</xsl:stylesheet>