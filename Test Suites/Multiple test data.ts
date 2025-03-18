<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Multiple test data</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>f500f6b9-52d9-4bd0-be64-bb83925e1567</testSuiteGuid>
   <testCaseLink>
      <guid>ae0a63c3-828a-4ca4-af6c-f9b432d26b49</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'Atlanta'</defaultValue>
         <description></description>
         <id>c9adc9f4-926e-4193-a89b-3af07b710c06</id>
         <masked>false</masked>
         <name>city</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/Katalon Academy/Practitioner/Data-Driven Testing/Fine a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7f08c497-32e0-42ee-8565-8e503d46a05b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Excel_Cities</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b3c2f841-2c86-4fc2-9f73-6c8e9ea06833</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Cities</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>7f08c497-32e0-42ee-8565-8e503d46a05b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>c9adc9f4-926e-4193-a89b-3af07b710c06</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b3c2f841-2c86-4fc2-9f73-6c8e9ea06833</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>3212d94f-8819-428e-bc02-13b9ef366d94</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
