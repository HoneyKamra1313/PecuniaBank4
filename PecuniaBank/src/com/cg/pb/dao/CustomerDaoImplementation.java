package com.cg.pb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.cg.pb.bean.Customer;

public class CustomerDaoImplementation implements CustomerDao {
	
	Connection connection=null;

	@Override
	public void addCustomer(Customer c) throws Exception{
		// TODO Auto-generated method stub
		
		try{
			Class.forName("com.mysql.jdbc.Ddriver");
			String url="localhost:3306";//driver/ipadd/database instance"
			String user="root";
			String password="orcl11g"; 
		 Connection connection=DriverManager.getConnection(url, user, password);
		PreparedStatement ps = connection.prepareStatement("insert into Customer values(?,?,?,?,?,?,?)");
		ps.setString(1, c.getName());
		ps.setDouble(2, c.getContact()); 
		ps.setDouble(3, c.getAadhar());
		ps.setString(4,c.getPAN());
		ps.setString(5,c.getGender());
		ps.setString(6,c.getAddressLine1());
		ps.setString(7,c.getAddressLine2());
		ps.executeUpdate();
		
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			if(connection!=null)
			connection.close();
		}
	}

	@Override
	public void udpateCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}


}
