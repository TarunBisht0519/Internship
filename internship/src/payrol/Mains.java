package payrol;
import java.util.*;
import java.sql.*;
public class Mains extends Search
{
    public void connection(Department d )
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
            int i=st.executeUpdate();  

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
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Mains object=new Mains();
        
        try
        {
            while(true)
            {
                System.out.println("ENTER 1 FOR ENTER NEW EMPLOYEE");
                System.out.println("ENTER 2 FOR SEARCHING EMPLOYEE");
                System.out.println("ENTER 3 FOR EXITING");
                int option=sc.nextInt();
                sc.nextLine();
                switch(option) 
                {
                case 1:
                    System.out.println("ENTER YOUR FIRST NAME");
                    String fname=sc.nextLine();
                    System.out.println("ENTER YOUR LAST NAME");
                    String lname=sc.nextLine();
                    System.out.println("ENTER YOUR AGE");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("SELECT OPTION FOR PAYMENT TYPE");
                    System.out.println("SELECT 1 FOR SALARIED TYPE ");
                    System.out.println("SELECT 2 FOR HOURLY TYPE ");
                    System.out.println("SELECT 3 FOR COMMISSIONED TYPE ");
                    System.out.println("SELECT 4 FOR BASE SALARIED COMMISSION TYPE ");
                    int option1=sc.nextInt();
                    sc.nextLine();
                    switch(option1)
                    {
                    case 1:
                        String dep="salaried";
                        Salaried obj=new Salaried(fname,lname,dep,age);
                        object.connection(obj);
                        break;
                    case 2:
                        System.out.println("ENTER THE NUMBER OF HOURS WORKED");
                        int hour=sc.nextInt();
                        sc.nextLine();
                        String dep1="HOURLY";
                        Hourly obj2=new Hourly(fname,lname,dep1,age,hour);
                        object.connection(obj2);
                        break;
                    case 3:
                        String dep2="Commission";
                        System.out.println("ENTER SALES RECORDED");
                        int sales=sc.nextInt();
                        sc.nextLine();
                        Commission obj3=new Commission(fname,lname,dep2,age,sales);
                        object.connection(obj3);
                        break;
                    case 4:
                        String dep3="BASE SALARIED COMMISSION";
                        System.out.println("ENTER THE SALES RECORDED");
                        int sales1=sc.nextInt();
                        sc.nextLine();
                        Bsc obj4=new Bsc(fname,lname,dep3,age,sales1);
                        object.connection(obj4);
                        break;
                        default:
                            System.out.println("PLEASE ENTER NUMBER BETWEEN 1 TO 4");
                            break;  
                            }
                    
                    break;
                case 2:
                    System.out.println("ENTER FIRST NAME OF EMPLOYEE YOU WANT TO SEARCH");
                    String first=sc.nextLine();
                    first=first.toUpperCase();
                    System.out.println("ENTER SECOND NAME OF EMPLOYEE YOU WANT TO SEARCH");
                    String second=sc.nextLine();
                    second=second.toUpperCase();
                    object.searching(first, second);
                    continue;
                case 3:
                    System.exit(0);
                    default:
                        System.out.println("PLEASE ENTER NUMBER BEWTWEEN 1 TO 3");
                        sc.close();
                        break;
                        
                }
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

}
