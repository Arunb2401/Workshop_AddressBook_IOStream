package com.wokshop.iostreams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	public void connectSQL() {
		String jdbcURL = "jdbc:mysql://localhost:3306/addressbook_service";
		String username = "Arunb2401";
		String password = "Arun@1234";
		Connection connection = null;
		try {
			System.out.println("Connecting to Database: " + jdbcURL);
			connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("\n<<< Connection Established Successfully >>>" + connection);
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try  {
			if (connection != null) {
				String sqlInsert = "INSERT INTO Customer (firstname, lastname) values (?, ?, ?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
				preparedStatement.setInt(1, 5);
				preparedStatement.setString(2, "ARUN");
				preparedStatement.setString(3, "BIRADAR");

				int rowInserted = preparedStatement.executeUpdate();
				if (rowInserted > 0) {
					System.out.println("******Data Added Successfully******");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException sqlException) {
					System.out.println(sqlException.getMessage());
				}
	}
		}
	}
}
