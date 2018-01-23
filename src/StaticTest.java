import java.time.LocalDate;

public class StaticTest
{
    public static void main(String[] args)
    {
        Employee.setStatus("Manager");
        Employee[] ems = new Employee[3];
        LocalDate[] dates = new LocalDate[3];
        dates[0] = LocalDate.of(2010, 3, 13);
        dates[1] = LocalDate.of(1997, 8, 1);
        dates[2] = LocalDate.of(2003, 5, 8);
        ems[0] = new Employee("Li Hua", 8000, dates[0]);
        ems[1] = new Employee("Zhang Jin", 45000, dates[1]);
        ems[2] = new Employee("Victorial", 15000, dates[2]);

        System.out.println("Employee Status" + Employee.getStatus());
        for (Employee e : ems){
            System.out.println("Name:\t" + e.getName()+"\nSalary:\t"+e.getSalary()+"\nHire Day:\t"+e.getDate());
        }
    }
}
