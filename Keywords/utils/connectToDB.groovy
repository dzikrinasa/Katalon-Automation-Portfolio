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
	def selectQuery() {
		String url = "jdbc:mysql://your-database-host:3306/your_database"
		String user = "your_username"
		String password = "your_password"

		Connection conn = DriverManager.getConnection(url, user, password)
		Statement stmt = conn.createStatement()

		// ✅ Execute SQL Query
		String query = "SELECT username, password FROM users WHERE status = 'active'"
		ResultSet resultSet = stmt.executeQuery(query)

		// ✅ Iterate Through Results
		while (resultSet.next()) {
			String username = resultSet.getString("username")
			String passworduser = resultSet.getString("password")

			println("Username: " + username + " | Password: " + passworduser)

			// ✅ Use Data in Your Test Case
			WebUI.setText(findTestObject('Object Repository/LoginPage/txt_username'), username)
			WebUI.setText(findTestObject('Object Repository/LoginPage/txt_password'), password)
			WebUI.click(findTestObject('Object Repository/LoginPage/btn_login'))
		}

		// ✅ Close Connections
		resultSet.close()
		stmt.close()
		conn.close()
	}

	@Keyword
	def executeQuery() {
		// ✅ Database Connection Details
		String url = "jdbc:mysql://your-database-host:3306/your_database"
		String user = "your_username"
		String password = "your_password"

		// ✅ Establish Connection
		Connection conn = DriverManager.getConnection(url, user, password)
		Statement stmt = conn.createStatement()

		// ✅ Execute UPDATE Query
		String updateQuery = "UPDATE users SET status = 'inactive' WHERE id = 1"
		int rowsAffected = stmt.executeUpdate(updateQuery)

		println("✅ Rows Updated: " + rowsAffected)

		// ✅ Close Connection
		stmt.close()
		conn.close()
	}
}
