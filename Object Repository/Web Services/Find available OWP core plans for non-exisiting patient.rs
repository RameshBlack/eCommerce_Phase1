<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Guust User OWP core Plans</description>
   <name>Find available OWP core plans for non-exisiting patient</name>
   <tag></tag>
   <elementGuidId>9c963562-4966-4a3a-a29a-48d35b23eaac</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Ocp-Apim-Subscription-Key</name>
      <type>Main</type>
      <value>1d1b3161b856466ca8a1ef2b3b977b50</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://dev12.api.banfield.com/owp/api/WellnessPlan/availableCorePlans/newPatient/:hospitalNumber/:dateOfBirth/:gender/:speciesID?hospitalNumber=0912&amp;dateOfBirth=01-25-2019&amp;gender=M&amp;speciesID=3</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiI4ZTlkYzQ3OS05MWZmLTQ0NWMtYWNjZi0wNDI2MTY4ZjdlYmQiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC82NzlmNjNkMS1lMTg1LTRhNDctYTA4MS1jNTMwY2NmNzM0ZjgvIiwiaWF0IjoxNjE4NTc2NzcwLCJuYmYiOjE2MTg1NzY3NzAsImV4cCI6MTYxODU4MDY3MCwiYWlvIjoiRTJaZ1lHaVFuOWgwVm5sM3BjKzg3R016SFN0MUFBPT0iLCJhcHBpZCI6IjZkOTRiOWIzLTgxMWYtNGE2OC1hOTAxLTRjY2Y3MGI4NDYwNCIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzY3OWY2M2QxLWUxODUtNGE0Ny1hMDgxLWM1MzBjY2Y3MzRmOC8iLCJvaWQiOiIxOTI1NjZmYi01MTJmLTRlMTEtYmI2Ni01OTBiZjE3OTBkNzIiLCJyaCI6IjAuQVNjQTBXT2ZaNFhoUjBxZ2djVXd6UGMwLUxPNWxHMGZnV2hLcVFGTXozQzRSZ1FuQUFBLiIsInN1YiI6IjE5MjU2NmZiLTUxMmYtNGUxMS1iYjY2LTU5MGJmMTc5MGQ3MiIsInRpZCI6IjY3OWY2M2QxLWUxODUtNGE0Ny1hMDgxLWM1MzBjY2Y3MzRmOCIsInV0aSI6IkE0MDZWT182UUVHb1JVNWJNY0pDQUEiLCJ2ZXIiOiIxLjAifQ.XLmcj-OFVU1K5hXQxXDem4STPnsUiygEm35qaCh22wxNxsDV6A4tzc2A5xkl2_SkwwmTPOeJKa0C0OxuZy51GTyxR2j1h6Dr_RBPd9FYJAe5qhNISt9bwooVKM92UMqwBmlC7HBiE6vDV4mMoI_gafSmzk02oAELaSESBZSflLcl10bvfo-FO1Zoig8858Y1SDs8L4-H5PLvc1I0QDNIJbYTd1igZZRoAcHD9vy6sgjuGyZR-rUO7mKsmXvyh7ZbCebMmZ2xoGPJSKgO74EHZEFUcLj0RXm99cQw6JTJ_Mf0wGRG0qvjUQsP6FnwIjKKXKl5RjjbSuD72vH2YkmseQ'</defaultValue>
      <description></description>
      <id>d00a41f5-2176-4cb6-9e8f-64ac297b5700</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
