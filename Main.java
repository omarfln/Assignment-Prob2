import java.net.SecureCacheResponse;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Professor firstProf = new Professor("Reena", 280000, LocalDate.parse("1994-02-01"));
        Professor secProf = new Professor("Robert", 195000, LocalDate.parse("1984-01-02"));
        Professor thirdProf = new Professor("Mansour", 190000, LocalDate.parse("1974-04-01"));

        Secretary firstSec = new Secretary("John", 89000, LocalDate.parse("1994-02-01"));
        Secretary secSec = new Secretary("Alex", 89000, LocalDate.parse("1994-02-01"));
        secSec.setOvertimeHours(20);
        firstSec.setOvertimeHours(50);

        DeptEmployee []department = new DeptEmployee[5];

        department[0] = firstProf;
        department[1] = secProf;
        department[2] = thirdProf;
        department[3] = firstSec;
        department[4] = secSec;

        System.out.println("Would you like to sum all professors and secretaries salaries?, please answer [y] or [n]");
        Scanner dc = new Scanner(System.in);
        String answer = dc.nextLine();
        if (answer.equalsIgnoreCase("y")){
            double sum = 0.0;
            for(DeptEmployee e : department){
                sum += e.computeSalary();
            }
            System.out.println("Sum of salaries is: " + sum);
        }
    }
}