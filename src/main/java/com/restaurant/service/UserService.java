package com.restaurant.service;

import java.util.Scanner;
import java.sql.*;

public interface UserService {
	
	void updateUser(int n,Scanner scan,Connection myCon);
	void postUser(int n,Scanner scan,Connection myCon);
	void deleteUser(int n,Scanner scan,Connection myCon);
	void getUser(int n,Scanner scan,Connection myCon);

}
