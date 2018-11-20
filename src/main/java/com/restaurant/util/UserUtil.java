package com.restaurant.util;

import java.sql.*;
import java.util.*;

import com.restaurant.entity.User;
import com.restaurant.util.PropertyUtil;
import com.restaurant.service.implement.UserServiceImpl;

public class UserUtil {
	
	//changes in user table
	public void computeUser(Scanner scan) throws SQLException
	{
		UserServiceImpl methods= new UserServiceImpl();
		boolean flag= true;
		System.out.println("Establishing Connection...");
		
		Connection myCon = PropertyUtil.getConnection();
		
		try {
			
			while(flag)
			{
				System.out.println("choose an option");
				System.out.println("1: post into UserTable");
				System.out.println("2: get the UserTable");
				System.out.println("3: update the value in a UserTable");
				System.out.println("4: delete a value in a UserTable");
				System.out.println("5: exit");
				
				int num = scan.nextInt();
				switch(num)
				{
				case 1:
					System.out.println("enter the number of users you wish to enter into UserTable:");
					int n = scan.nextInt();
					methods.post(n,scan,myCon);
					//YYYY-MM-DD
					break;
				case 2:
					System.out.println("enter the id which you wish to display:");
					int ids= scan.nextInt();
					methods.get(ids, scan, myCon);
					break;
				case 3:
					User u = new User();
					System.out.println("enter the id to be updated:");
					u.setId(scan.nextInt());
					methods.update(u.getId(), scan, myCon);
					break;
				case 4:
					System.out.println("Enter the id which you wish to delete from the UserTable:");
					int id = scan.nextInt();					
					methods.delete(id, scan, myCon);
					break;
				case 5:
					flag=false;
					myCon.close();
					System.out.println("exiting..");
					break;
				default:
					System.out.println("invalid input");
				
					
					
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
