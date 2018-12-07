package com.restaurant;


import java.util.*;

import com.restaurant.util.UserUtil;


import java.sql.*;

public class RestaurantSearch
{

	Scanner scan;
	public RestaurantSearch()
	{
		scan = new Scanner(System.in);
	}
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	RestaurantSearch webApp= new RestaurantSearch();
    	UserUtil computing = new UserUtil();
    	computing.computeUser(webApp.scan);

		
    	

		}
    }

