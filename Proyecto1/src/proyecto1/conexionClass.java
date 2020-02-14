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
    
    public static Connection conexionF(String DB, String user, String pass){
        try {
            Class.forName( "com.sybase.jdbc4.jdbc.SybDriver" ).newInstance();
            Connection con = DriverManager.getConnection("jdbc:sybase:Tds:localhost:5000/"+DB,user,pass);
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
        String sql = "select name from syslogins";
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
    
    public String showTableContent(String tbl_name){
        String sql = "SELECT * FROM " + tbl_name;
        return sql;
    }
    
    public String dropTable(String tbl_name){
        String sql = "DROP TABLE " + tbl_name;
        return sql;
    }
    
    public String dropUser(String username){
        String sql = "DROP LOGIN " + username;
        return sql;
    }
    
    public String dropView(String view){
        String sql = "DROP VIEW " + view;
        return sql;
    }
    
    public String dropTrigger(String trigger){
        String sql = "DROP TRIGGER " + trigger;
        return sql;
    }
    
    public String dropDB(String database){
        String sql = "DROP DATABSE " + database;
        return sql;
    }
    
    public String dropIndex(String index){
        String sql = "DROP INDEX " + index;
        return sql;
    }
    
    public String dropProcedure(String procedure){
        String sql = "DROP PROCEDURE " + procedure;
        return sql;
    }
    
    public String createTable(String tbl_name, String val1, String val2, String val3, String val4, String val5){
        String sql = "CREATE TABLE " + tbl_name;
        if(!val1.equalsIgnoreCase("")){
            sql += " (" + val1;
        }
        if(!val2.equalsIgnoreCase("")){
            sql += ", " + val2;
        }
        if(!val3.equalsIgnoreCase("")){
            sql += ", " + val3;
        }
        if(!val4.equalsIgnoreCase("")){
            sql += ", " + val4;
        }
        if(!val5.equalsIgnoreCase("")){
            sql +=", " + val5;
        }
        sql += ")";
        return sql;
    }
    
    public String createUser(String username, String password){
        String sql = "CREATE LOGIN " + username + " with password " + password;
        return sql;
    }
    
    public String createTrigger(String triggerName, String tbl_name, String triggerType, String stmt){
        String sql = "CREATE TRIGGER " + triggerName + " ON " + tbl_name + " FOR " + triggerType + " AS " + stmt;
        return sql;
    }
    
    public String createProcedure(String procName, String procType, String stmt){
        String sql = "CREATE PROCEDURE " + procName + " " + procType + " AS " + stmt;
        return sql;
    }
    
    public String createIndex(String indexName, String tbl_name){
        String sql = "CREATE INDEX " + indexName + " ON " + tbl_name;
        return sql;
    }
    
    public String createDB(String DBName){
        String sql = "CREATE DATABASE " + DBName;
        return sql;
    }
    
    public String createView(String viewName, String stmt){
        String sql = "CREATE VIEW " + viewName + " AS " + stmt;
        return sql;
    }
    
}
