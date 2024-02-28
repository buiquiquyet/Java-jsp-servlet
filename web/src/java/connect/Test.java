/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
   	public Connection getConnection()throws Exception{
	 String dbURL = "jdbc:sqlserver://DESKTOP-UTRCQSJ;DatabaseName=test1;instance=SQLSERVER;encrypt=true;TrustServerCertificate=true;";

        

	 String dbUser = "";
     String dbPass = "";
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	return DriverManager.getConnection(dbURL );
    
}
}
