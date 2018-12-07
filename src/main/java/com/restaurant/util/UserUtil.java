package com.restaurant.util;

import java.sql.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.restaurant.RestaurantSearch;
import com.restaurant.entity.User;
import com.restaurant.util.PropertyUtil;
import com.restaurant.service.implement.UserServiceImpl;

public class UserUtil {
	
	//changes in user table
	static Logger logger = LoggerFactory.getLogger(RestaurantSearch.class);
	public void computeUser(Scanner scan) throws SQLException, ClassNotFoundException
	{
		UserServiceImpl methods= new UserServiceImpl();
		boolean flag= true;
		logger.info("Establishing Connection...");
		
		Connection myCon = PropertyUtil.getConnection();
		
		try {
			
			while(flag)
			{
				logger.info("choose an option");
				logger.info("1: post into UserTable");
				logger.info("2: get the UserTable");
				logger.info("3: update the value in a UserTable");
				logger.info("4: delete a value in a UserTable");
				logger.info("5: exit");
				
				int num = scan.nextInt();
				switch(num)
				{
				case 1:
					logger.info("enter the number of users you wish to enter into UserTable:");
					int n = scan.nextInt();
					methods.postUser(n,scan,myCon);
					//YYYY-MM-DD
					break;
				case 2:
					logger.info("enter the id which you wish to display:");
					int ids= scan.nextInt();
					methods.getUser(ids, scan, myCon);
					break;
				case 3:
					User u = new User();
					//nothing
					logger.info("enter the id to be updated:");
					u.setId(scan.nextInt());
					methods.updateUser(u.getId(), scan, myCon);
					break;
				case 4:
					logger.info("Enter the id which you wish to delete from the UserTable:");
					int id = scan.nextInt();					
					methods.deleteUser(id, scan, myCon);
					break;
				case 5:
					flag=false;
					myCon.close();
					logger.info("exiting..");
					break;
				default:
					logger.info("invalid input");
				
					
					
				}
			}
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}	
		finally
		{
			myCon.close();
		}
		
	}

}
