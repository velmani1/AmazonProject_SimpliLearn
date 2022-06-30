package Com.Selenium;


import java.sql.Connection;
		import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
		import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

		public class ConnectDB {
			WebDriver driver;
			ResultSet rs;
            public Statement statement;
         public ConnectDB(WebDriver driver)
        	{
        		this.driver=driver;
       	}
			public Connection con;
            
            ProductDetails details;
            public ConnectDB(ProductDetails details)
            {
            	this.details=details;
            }
           
           public ConnectDB() throws SQLException, ClassNotFoundException
           {
        	   try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            	this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","MyPass@123");
            	System.out.println("connection success");
        	   }
        	   catch(SQLException | ClassNotFoundException e)
          		{
          			e.printStackTrace();
          			
          		}
          		catch(Exception e1)
          		{
          			System.out.println(e1);
          		}
           }
            	public void insertProducts( ProductDetails details) throws SQLException
            	{
          		 
          		  for(int i=0; i<details.n; i++)
                  {	  
            	String qry="insert into products(name,price,offer)"+ "values("+details.pname+","+details.pprice+","+details.poff+")";
          	    PreparedStatement preparedStmt = con.prepareStatement(qry);  
          	    preparedStmt.execute(qry);
        	      }
            	}
            	  
            	@SuppressWarnings("unchecked")
				public void select( ProductDetails details) throws SQLException
            	{
                 String qry="select * from products";
                 Statement stmnt=con.createStatement();
                 ResultSet rs=stmnt.executeQuery(qry);
                 while(rs.next()) {
                	 List<WebElement> dbname=(List<WebElement>) rs.getArray("name");
                	 List<WebElement> dbprice=(List<WebElement>) rs.getArray("price");
                	 List<WebElement> dboff=(List<WebElement>) rs.getArray("offer");
                	}
                 con.close();
            	}
            	
		
		
		}
            
            
			

