package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		System.out.print("Enter email : ");
		String email = sc.nextLine();
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		System.out.print("Enter city : ");
		String city = sc.nextLine();
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");){
			Class.forName("com.mysql.cj.jdbc.Driver");
		PreparedStatement ps = con.prepareStatement("INSERT INTO registerdata (name, email, password, city) VALUES (?, ?, ?, ?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, city);
		int i = ps.executeUpdate();
		if(i>0)
			System.out.println("data instered successfully");
		else
			System.out.println("went wrong !!!");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
