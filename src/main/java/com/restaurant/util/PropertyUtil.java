package com.restaurant.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import org.slf4j.*;

import com.restaurant.RestaurantSearch;
public class PropertyUtil {


	    private static Connection coni ;
	    static Logger logger = LoggerFactory.getLogger(RestaurantSearch.class);

	    private PropertyUtil() {
	      // private constructor //
	    }

	    public static Connection getConnection() throws SQLException, ClassNotFoundException{
	    	Properties prop = new Properties();
	    	InputStream input = null;
	    	

	        if(coni==null){
	        	
	            try {
					input = new FileInputStream("/Users/srikarrampally/programs/Restaurant/src/main/java/com/restaurant/properties/config.properties");
					prop.load(input);
					
	                String host = prop.getProperty("database");
	                String username = prop.getProperty("dbuser");
	                String password = prop.getProperty("dbpassword");
//	                System.out.println(host  + " "+ username + " " + password );

	                coni = DriverManager.getConnection( host, username, password );
	                logger.info("Connection established");
	            }  
	            
	            catch (IOException exe) {
	            	logger.warn("error");
					exe.printStackTrace();
				}
	            catch (SQLException ex) {
	            	logger.warn("error");
	            	ex.printStackTrace();
	            	
	                
	            }
	            catch (Exception e) {
	            	logger.warn("error");
	            	e.printStackTrace();
	            }
	            finally
	            {
	            	logger.error("connection problem");
	            	coni.close();
	            }
	        }

	        return coni;
	    }
}
