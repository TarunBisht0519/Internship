package payrol;
import java.util.*;
import java.io.*;
public class Mains 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Department>list=new ArrayList<Department>();
        try
        {
            File ob=new File("C:\\Users\\tarun.bisht\\Documents\\emp.txt");
            FileWriter fr=new FileWriter(ob);
            fr.write("EMPLOYEES INFORMATION IS SAVED IN THIS FILE "+"\n");
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
                        list.add(obj);
                        String detail=obj.getinfo();
                        fr.append(detail);
                        fr.flush(); 
                        break;
                    case 2:
                        System.out.println("ENTER THE NUMBER OF HOURS WORKED");
                        int hour=sc.nextInt();
                        sc.nextLine();
                        String dep1="HOURLY";
                        Hourly obj2=new Hourly(fname,lname,dep1,age,hour);
                        list.add(obj2);
                        String detail1=obj2.getinfo();
                        fr.append(detail1);
                        fr.flush();
                        break;
                    case 3:
                        String dep2="Commission";
                        System.out.println("ENTER SALES RECORDED");
                        int sales=sc.nextInt();
                        sc.nextLine();
                        Commission obj3=new Commission(fname,lname,dep2,age,sales);
                        list.add(obj3);
                        String detail2=obj3.getinfo();
                        fr.append(detail2);
                        fr.flush();
                        break;
                    case 4:
                        String dep3="BASE SALARIED COMMISSION";
                        System.out.println("ENTER THE SALES RECORDED");
                        int sales1=sc.nextInt();
                        sc.nextLine();
                        Bsc obj4=new Bsc(fname,lname,dep3,age,sales1);
                        list.add(obj4);
                        String detail3=obj4.getinfo();
                        fr.append(detail3);
                        fr.flush();
                        break;
                        default:
                            System.out.println("PLEASE ENTER NUMBER BETWEEN 1 TO 4");
                            break;  
                            }
                    
                    break;
                case 2:
                    System.out.println("ENTER FIRST NAME OF EMPLOYEE YOU WANT TO SEARCH");
                    String first=sc.nextLine();
                    int count=0;
                    for(Department y:list)
                    {
                        if(y.fname.equals(first))
                        {
                            count++;
                            y.salary();
                        }
                    }
                    if(count==0)
                    {
                        System.out.println("EMPLOYEE NOT FOUND");
                        
                    }
                    continue;
                case 3:
                    System.exit(0);
                    default:
                        System.out.println("PLEASE ENTER NUMBER BEWTWEEN 1 TO 3");
                        fr.close();
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
