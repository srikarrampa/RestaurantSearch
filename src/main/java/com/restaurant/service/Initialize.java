package com.restaurant.service;

import java.util.Scanner;
import java.sql.*;

public interface Initialize {
	
	void update(int n,Scanner scan,Connection myCon);
	void post(int n,Scanner scan,Connection myCon);
	void delete(int n,Scanner scan,Connection myCon);
	void get(int n,Scanner scan,Connection myCon);

}
