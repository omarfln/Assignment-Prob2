import java.time.LocalDate;

public class Professor extends DeptEmployee{
    int numberOfPublications;

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    Professor(String name, double salary, LocalDate hireDate){
        super(name, salary, hireDate);
    }

}
