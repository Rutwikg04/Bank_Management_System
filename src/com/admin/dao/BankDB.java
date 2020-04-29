package com.admin.dao;
import java.sql.*;
public class BankDB {
	 public static Connection getConnection() 
			  throws Exception
			  {
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement?autoReconnect=true&useSSL=false","root","root");
				  return conn;
			  }
}