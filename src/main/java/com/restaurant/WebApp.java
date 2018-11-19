package com.restaurant;


import java.util.*;

import com.restaurant.util.UserTableCompute;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.sql.*;

public class WebApp
{
	
	static Scanner scan;
	public WebApp()
	{
		scan = new Scanner(System.in);
	}
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	WebApp webApp= new WebApp();
    	UserTableCompute computing = new UserTableCompute();
    	computing.compute(webApp.scan);

		
    	

		}
    }

