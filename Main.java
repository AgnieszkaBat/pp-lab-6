public interface Employable {
    void performWork(); // More descriptive method name
}

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public abstract void performWork(); // Consistent implementation requirement

    @Override
    public int hashCode() {
        return id;
    }
}

public class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id, null, "Manager"); // Provide default "Manager" position
    }

    @Override
    public void performWork() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}

public final class Worker extends Employee {
    public Worker(String name, double salary, int id) {
        super(name, salary, id, null, "Worker"); // Provide default "Worker" position
    }

    @Override
    public void performWork() {
        System.out.println("Worker " + getName() + " is working...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Worker instances
        Worker worker1 = new Worker("Employee1", 1347.01, 101);
        Worker worker2 = new Worker("Employee2", 2355.01, 102);
        Worker worker3 = new Worker("Employee3", 6457.01, 103);
        Worker worker4 = new Worker("Employee4", 3252.01, 104);

        // Manager instance
        Manager manager = new Manager("Manager", 2640.0, 201);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.performWork(); // Use the corrected method name

        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.performWork();

        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.performWork();

        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.performWork();

        System.out.println("Salary of manager: " + manager.getSalary());
        manager.performWork();
    }
}
