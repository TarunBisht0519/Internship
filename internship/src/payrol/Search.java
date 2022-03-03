package payrol;
import java.sql.*;
public class Search extends Insert
{
    String dburl="jdbc:mysql://localhost:3306/employee";
    String user ="root";
    String pass="Tarunbisht@0519";
    Connection myconn=null;
    PreparedStatement st=null;
    ResultSet res=null;
    public void searching(String first,String second)
    {
        try
        {
            myconn=DriverManager.getConnection(dburl,user,pass);
            st=myconn.prepareStatement("Select * from info where fname = ? and lname = ?");
            st.setString(1, first);
            st.setString(2, second);
            res=st.executeQuery();
            if(res!=null)
            {
                while(res.next())
                {
                    String name=res.getString("fname");
                    String surname=res.getString("lname");
                    long aged=res.getLong("age");
                    String department=res.getString("dep");
                    long pay=res.getLong("salary");
                    System.out.println("FIRST NAME : "+name);
                    System.out.println("LAST NAME : "+surname);
                    System.out.println("AGE : "+aged);
                    System.out.println("DEPARTMENT : "+department);
                    System.out.println("SALARY : "+pay);
                }
            }
            else
            {
                System.out.println("NOT FOUND");
            }
        }
        catch(Exception e)
        {
            
        }
    }

}
