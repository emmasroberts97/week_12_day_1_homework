package Staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if (increase > 0){
            this.salary += increase;
        } else {
            this.salary += 0;
        }

    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
