package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

public class connectToDB {
	@Keyword
	def executeQuery(String query) {
		// Database Credential
		String url = GlobalVariable.DB_URL+GlobalVariable.DB_NAME //"jdbc:sqlserver://your-database-host:port;your_database"
		String user = GlobalVariable.DB_USER
		String password = GlobalVariable.DB_PASSWORD

		// Establish Connection
		Connection conn = DriverManager.getConnection(url, user, password)
		Statement stmt = conn.createStatement()

		// Execute Query
		int rowsAffected = stmt.executeUpdate(query)

		WebUI.comment(rowsAffected + " Rows Affected" )

		// Close Connection
		stmt.close()
		conn.close()
	}

	@Keyword
	def selectQuery(String query) {

		// Database Credential
		String url = GlobalVariable.DB_URL+GlobalVariable.DB_NAME //"jdbc:sqlserver://your-database-host:port;your_database"
		String user = GlobalVariable.DB_USER
		String password = GlobalVariable.DB_PASSWORD

		// Connect to Database
		Connection conn = DriverManager.getConnection(url, user, password)
		Statement stmt = conn.createStatement()

		// Execute Select Query
		ResultSet resultSet = stmt.executeQuery(query)

		// Store data as a Map
		def rowData = [:]
		if (resultSet.next()) {
			int totalColumns = resultSet.getMetaData().getColumnCount()
			for (int i = 1; i <= totalColumns; i++) {
				String column = resultSet.getMetaData().getColumnName(i)
				rowData[column] = resultSet.getObject(i)
			}
		}

		// Close Connections
		resultSet.close()
		stmt.close()
		conn.close()

		return rowData
	}
}
