package payrol;

public class Commission extends Department 
{
    String lname;
    int age;
    int sales;
    Commission(String fn,String lname,String department,int age,int sales)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
        this.sales=sales;
    }
    int sal;
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        sal=(int)(sales*(15/100.0f));
        System.out.println("SALARY :"+sal);
        
    }
    public String getinfo()
    {
        return new StringBuffer("(.)First Name: ").append(fname).append("\n")
                .append(" Last Name : ").append(this.lname).append("\n").append(" Age : ").append(this.age).append("\n")
                .append(" DEPARTMENT TYPE :").append(dep).append("\n").append(" SALARY OF EMPLOYEE :").append(sal).append("\n").toString();
        
    }

}
