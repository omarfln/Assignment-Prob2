import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    LocalDate hireDate;

    DeptEmployee(String name, double salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }

}
