package com.globallogic.day14;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MYJDBC {
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "admin123";
			String url = "jdbc:mysql://localhost:3306/buddy";
			Connection con = DriverManager.getConnection(url , username , password);
			Statement st = con.createStatement();
			
			//insert Query
			String insertQuery = "insert into employee(id,name,fname,salary,deptid) values (10 ,'Ankush','singh',20000,1005)";
			st.execute(insertQuery);
			
			//delete Query
			String deleteQuery = "delete from employee where id = 3";
			st.execute(deleteQuery);
			
			String updateQuery = "update employee set salary = 500001 where id = 1";
			st.execute(updateQuery);
			
	
			String Query = "Select * from employee";
			ResultSet rs = st.executeQuery(Query);
			while(rs.next()) {
				System.out.println("id :" + " " + rs.getInt(1) +" " +"Name :" +rs.getString(2)+" "+"fname :" +rs.getString(3) + " " + "salary :" + rs.getInt(4)+" " + "deptid :" + rs.getInt(5));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
