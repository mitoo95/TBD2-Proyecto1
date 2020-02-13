/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.sql.*;

/**
 *
 * @author erasmo
 */
public class conexionClass {
    
    public static Connection conexionF(String user, String pass){
        try {
            Class.forName( "com.sybase.jdbc4.jdbc.SybDriver" ).newInstance();
            Connection con = DriverManager.getConnection("jdbc:sybase:Tds:localhost:5000/PROD",user,pass);
            con.commit();
            if(con != null){
                return con;
            }
        }
        catch ( Exception e ) {
        e.printStackTrace();
        }
        return null;
    }
    
    public String showTables(){
        String sql = "SELECT convert(varchar(30),o.name) AS table_name from sysobjects o where type = 'U' order by table_name";
        return sql;
    }
    
    public String showIndexes(){
        String sql = "Select id, name from sysindexes";
        return sql;
    }
    
    public String showStoredProcedures(){
        String sql = "SELECT convert(varchar(30),o.name) AS procedures from sysobjects o where type = 'P'";
        return sql;
    }
    
    public String showTriggers(){
        String sql = "SELECT convert(varchar(30),o.name) AS triggers from sysobjects o where type = 'TR'";
        return sql;
    }
    
    public String showUsers(){
        String sql = "select name as user_name from sysusers";
        return sql;
    }
    
    public String showDatabases(){
        String sql = "Select name as database_name from sysdatabases";
        return sql;
    }
    
    public String showViews(){
        String sql = "SELECT convert(varchar(30),o.name) AS views from sysobjects o where type = 'V'";
        return sql;
    }
    
    public String createTable(String tbl_name, String val1, String val2, String val3, String val4){
        val1 = "";
        val2 = "";
        val3 = "";
        val4 = "";
        String sql = "CREATE TABLE " + tbl_name + "( " + val1 + " , " + val2 + " , " + val3 + " , " + val4 + ") ";
        return sql;
    }
    
    public String createUser(String username, String password){
        String sql = "CREATE USER " + username + " IDENTIFIED BY " + password;
        return sql;
    }
    
}
