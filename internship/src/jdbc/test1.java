package jdbc;
import java.sql.*;
public class test1 
{
    public static void main(String[] args) 
    {
        Connection myconn=null;
        String dburl=" ";
        String user="root";
        String password="Tarunbisht@0519";
         try
         {
             
            myconn=DriverManager.getConnection(dburl,user,password);
            Statement myst=myconn.createStatement();
            myst.execute("truncate table info");
            
            int rows=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('tarun','bisht',22,'salaried',200000000)");
            int rows2=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('mankirat','kaur',22,'commissioned',15000000)");
            int rows3=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('taniya','bisht',25,'salaried',150000000)");
            int rows4=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('harish','thakur',22,'salaried',100000000)");
            int rows5=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('sameer','ahmed',22,'commissioned',1600000)");
            int rows6=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('rakesh','shaw',25,'salaried',190000000)");
            int rows7=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('sudhanshu','nautiyal',22,'salaried',100000000)");
            int rows8=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('hitesh','moudgil',28,'permanent',1500000)");
            int rows9=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('thejus','thomas',22,'salaried',1000000)");
            int rows10=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('Jyothis','maria',26,'salaried',2000000)");
            int rows11=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('aayush','vatsa',22,'commissioned',15000)");
            int rows12=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('akshit','moudgil',18,'salaried',15000)");
            int rows14=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('jasdeep','singh',22,'salaried',200000)");
            int rows15=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('mridu','sharma',27,'commissioned',150000)");
            int rows16=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('ram','charan',35,'salaried',1500000)");
            int rows17=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('shiker','thakur',22,'salaried',25000)");
            int rows18=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('raman','deep',22,'commissioned',70000)");
            int rows19=myst.executeUpdate("insert into info "+"(fname,lname,age,dep,salary)"+"values "+"('tanish','singh',25,'salaried',9000)");
            ResultSet myrs=myst.executeQuery("select * from info");
            
             while(myrs.next())
             {
                 System.out.println(myrs.getString("fname")+" "+myrs.getString("lname")+" "+myrs.getString("age")+" "+myrs.getString("dep"));
             }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
         finally
         {
             
         }
        
    }

}
