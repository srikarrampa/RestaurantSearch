package com.restaurant;


import java.util.*;

import com.restaurant.util.UserUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.sql.*;

public class RestaurantSearch
{
	
	static Scanner scan;
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

