import java.time.*;
// import java.util.Date;

/*
  This program is used to try on Java class
  especially static
 */
class Employee {
    /*
      Employee class contains employee's namt, salary and date he was hired
      status says which status is in the company
     */
    private String name;
    private double salary;
    private LocalDate date;
    public static String status;

    public Employee(String n, double s, LocalDate d)
    {
        this.name = n;
        this.salary = s;
        this.date = d;
    }

    /*
      Set status of all employees.
     */
    public static void setStatus(String newStatus)
    {
        status = newStatus;
    }

    public static String getStatus()
    {
        return Employee.status;
    }

    public void setSalary(double newSalary)
    {
        this.salary = newSalary;
    }

    public void setHiredDate(LocalDate newD)
    {
        this.date = (LocalDate) newD.clone();
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public LocalDate getDate()
    {
        return this.date;
    }

    public void raiseSalary(double ratio)
    {
        double raise = this.salary*ratio/100;
        this.salary += raise;
    }

    public static void main()
    {
        LocalDate d = LocalDate.of(2005, 5, 18);
        Employee XiaoMing = new Employee("Xiao Ming", 20000, d);
        System.out.println("Employee Info\nName:\t"+XiaoMing.getName()+"\nSalary:\t"+XiaoMing.getSalary()+
        "\nHire Day:\t" + XiaoMing.getDate());
        XiaoMing.raiseSalary(6.3);
        System.out.println("After raising salary for 6.3%");
        System.out.println("Employee Info\nName:\t"+XiaoMing.getName()+"\nSalary:\t"+XiaoMing.getSalary()+
                "\nHire Day:\t" + XiaoMing.getDate());
    }
}

public class StaticTest
{
    public static void main()
    {
        Employee.setStatus("Manager");
        Employee[] ems = new Employee[3];
        LocalDate[] dates = new LocalDate[3];
        dates[0] = LocalDate.of(2010, 3, 13);
        dates[1] = LocalDate.of(1997, 8, 1);
        dates[2] = LocalDate.of(2003, 5, 8);
        ems[1] = new Employee("Li Hua", 8000, dates[0]);
        ems[2] = new Employee("Zhang Jin", 45000, dates[1]);
        ems[3] = new Employee("Victorial", 15000, dates[2]);

        System.out.println("Employee Status" + Employee.getStatus());
        for (Employee e : ems){
            System.out.println("Name:\t" + e.getName()+"\nSalary:\t"+e.getSalary()+"\nHire Day:\t"+e.getDate());
        }
    }
}
