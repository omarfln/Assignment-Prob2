import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    double overtimeHours;

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    Secretary(String name, double salary, LocalDate hireDate){
        super(name, salary, hireDate);
    }

    @Override
    public double computeSalary(){
        double secSalary = super.computeSalary();
        return secSalary + 12 * overtimeHours;
    }
}
