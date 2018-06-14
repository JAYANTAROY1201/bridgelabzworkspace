import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String query=null;
		int count=0;
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstn=null;
		ResultSet rslt=null;
		try {
			//load the driver
			Driver drive=new Driver();
			DriverManager.registerDriver(drive);
			
			//get the db connection via driver

			con = DriverManager.getConnection("jdbc:mysql://localhost/bridgelabz?useSSL=false","root","root");
			
			//issue sql query via connection
            /* query="create table emp(id int(10) primary key,fName varchar(20),lName varchar(20),mobile varchar(10))";
			pstn=con.prepareStatement(query);
			count=pstn.executeUpdate();
			System.out.println(count+" row affected");*/
			boolean close=false;
			while(close==false) {
			String query1="insert into emp "+"values(?,?,?,?)";
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter first name:");
			String fname=sc.next();
			System.out.println("enter last name:");
			String lname=sc.next();
			System.out.println("enter  mobile:");
			String mobile=sc.next();
			pstn=con.prepareStatement(query1);
			pstn.setInt(1,id);
			pstn.setString(2,fname);
			pstn.setString(3,lname);
			pstn.setString(4,mobile);
			count=pstn.executeUpdate();
			System.out.println(count+" row affected");
			System.out.println("Do you want to continue:");
			char choice=sc.next().charAt(0);
			switch(choice)
			{
			case 'Y' | 'y':close=false;
			break;
			case 'N' | 'n': close=true;
			break;
			default: close=true;
			break;
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{			
				try {
					if(con!=null)
					{
					con.close();
					}
					if(stmt!=null)
					{
						stmt.close();
					}
					if(rslt!=null)
					{
						rslt.close();
					}				
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

