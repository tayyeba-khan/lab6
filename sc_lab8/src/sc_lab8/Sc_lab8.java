/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_lab8;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Teny
 */
public class Sc_lab8 {

     Connection conn;
   Statement st;
   ResultSet rs;
   public void Sc_lab81() {
   
   try{
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab8","root","");
       st=conn.createStatement();
       conn.setAutoCommit(false);
        for(int i=5000;i<10000;i++){
               String query="insert into student (name,regnumber,semester,adress) values('tayyeba"+i+"',"+i+",'5','home sweet home')";
               st.executeUpdate(query);
           }
        conn.commit();
//           while(rs.next())
//           {
//               String name=rs.getString("name");
//               int regno=rs.getInt("regnumber");
//               String cl=rs.getString("semester");
//               String address=rs.getString("address");
//               System.out.println("Name: "+name+"   Registration number: "+regno+"   semester: "+cl+"   Address: "+address);
//           }

   }
   catch(Exception ex){
      //Handle errors for JDBC
      System.out.println("Error: "+ex);
   } 
    
}//end main
   
   public void Sc_lab82() {
   
   try{
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab8","root","");
       
       //conn.setAutoCommit(false);
        for(int i=15000;i<20000;i++){
               String name="tayyeba"+i;
              
               String query="insert into student (name,regnumber,semester,adress) values(?,?,?,?)";
               PreparedStatement st=conn.prepareStatement(query);
               st.setString(1,name);
               st.setInt(2,i);
               st.setString(3,"5");
               st.setString(4,"home sweet home");
               
               st.execute();
           }
       // conn.commit();
//           while(rs.next())
//           {
//               String name=rs.getString("name");
//               int regno=rs.getInt("regnumber");
//               String cl=rs.getString("semester");
//               String address=rs.getString("address");
//               System.out.println("Name: "+name+"   Registration number: "+regno+"   semester: "+cl+"   Address: "+address);
//           }

   }
   catch(Exception ex){
      //Handle errors for JDBC
      System.out.println("Error: "+ex);
   } 
    
}//end main
   
   
   public void Sc_lab83() {
   
   try{
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab8","root","");
       st=conn.createStatement();
       //conn.setAutoCommit(false);
        for(int i=20000;i<25000;i++){
               String query="insert into student (name,regnumber,semester,adress) values('tayyeba"+i+"',"+i+",'5','home sweet home')";
               st.addBatch(query);
               st.executeUpdate(query);
           }
        //conn.commit();
//           while(rs.next())
//           {
//               String name=rs.getString("name");
//               int regno=rs.getInt("regnumber");
//               String cl=rs.getString("semester");
//               String address=rs.getString("address");
//               System.out.println("Name: "+name+"   Registration number: "+regno+"   semester: "+cl+"   Address: "+address);
//           }

   }
   catch(Exception ex){
      //Handle errors for JDBC
      System.out.println("Error: "+ex);
   } 
    
}//end main
   
   public static void main(String[] args) {
        Sc_lab8 lab=new Sc_lab8();
        lab.Sc_lab83();
    }
   
}
