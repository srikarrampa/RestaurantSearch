package com.restaurant.service.implement;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import com.restaurant.RestaurantSearch;
import com.restaurant.entity.User;
import com.restaurant.service.UserService;

public class UserServiceImpl implements UserService {
	
	static Logger logger = LoggerFactory.getLogger(RestaurantSearch.class);
	public void postUser(int n,Scanner scan,Connection myCon)
	{
		for(int i=0;i<n;i++)
		{
			User u = new User();
			logger.info("enter name:");
			u.setName(scan.next());
			logger.info("enter name of the person who created the user:");
			u.setUserCreatedBy(scan.next());
			logger.info("enter the date:");
			u.setUserCreatedDate(scan.next());
			String sql = "insert into user (username,user_created_date,user_created_by) values(?,?,?)";
			PreparedStatement myStat;
			try {
				myStat = myCon.prepareStatement(sql);
				myStat.setString(1,u.getName());
				myStat.setString(2,u.getUserCreatedDate());
				myStat.setString(3,u.getUserCreatedBy());
				myStat.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logger.warn("exception occured in postUser");
				e.printStackTrace();
			}
			
			
		}
	}

	public void updateUser(int n,Scanner scan,Connection myCon) {
		try
		{
			User u = new User();
			logger.info("enter updated name:");
			u.setName(scan.next());
			logger.info("enter name of the person who created the user:");
			u.setUserCreatedBy(scan.next());
			logger.info("enter the date:");
			u.setUserCreatedDate(scan.next());
			
			
			String s = "Update user set username=?,user_created_by=?,user_created_date=? where id_user=?";
			PreparedStatement myState = myCon.prepareStatement(s);
			myState.setString(1, u.getName());
			myState.setString(2, u.getUserCreatedBy());
			myState.setString(3, u.getUserCreatedDate());
			myState.setInt(4, n);
			myState.executeUpdate();
		}catch(Exception exc)
		{
			logger.warn("exception occured updateUser");
			exc.printStackTrace();
		}
		
		
	}

	public void deleteUser(int n,Scanner scan,Connection myCon) {
		try {
			String sql="delete from user where id_user= ? ";
			PreparedStatement myStmt =  myCon.prepareStatement(sql);
			myStmt.setInt(1, n);
			int res=myStmt.executeUpdate();
			logger.info("no of rows affected="+res);
		}
		catch(Exception e)
		{
			logger.warn("exception occured in deleteUser");
			e.printStackTrace();
		}
		
	}

	public void getUser(int n,Scanner scan,Connection myCon) {
		
		String sql2="select * from user where id_user=?";
		try {
			PreparedStatement mySt = myCon.prepareStatement(sql2);
			mySt.setInt(1, n);
			ResultSet myRs=mySt.executeQuery();
			while(myRs.next())
			{
				logger.info(myRs.getInt("id_user")+","+myRs.getString("username")+","+myRs.getString("user_created_date")+","+myRs.getString("user_created_by"));
			}
		}
		catch(Exception exc)
		{
			logger.warn("exception occured getUser");
			exc.printStackTrace();
		}
	}

}
