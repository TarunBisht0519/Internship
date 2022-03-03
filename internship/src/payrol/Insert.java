package payrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert
{
    public void connection(Employee d )
    {
        String dburl="jdbc:mysql://localhost:3306/employee";
        String user="root";
        String pass="Tarunbisht@0519";
        Connection myconn=null;
        PreparedStatement st=null;
        try
        {
            myconn=DriverManager.getConnection(dburl,user,pass);
            String first=d.fname;
            first=first.toUpperCase();
            String second=d.lname;
            second=second.toUpperCase();
            int age=d.age;
            String dep=d.dep;
            dep=dep.toUpperCase();
            int sal=d.salary();
            st=myconn.prepareStatement("insert into info values(?,?,?,?,?)");
            st.setString(1, first);
            st.setString(2, second);
            st.setInt(3, age);
            st.setString(4, dep);
            st.setInt(5,sal);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try 
            {
                st.close();
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }
    

}
