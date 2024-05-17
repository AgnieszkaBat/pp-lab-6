public interface Employable {
    void work();
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
    public abstract void work();

    @Override
    public int hashCode() {
        return id;
    }
}

public class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id, null, null);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}

public final class Worker extends Employee {
    public Worker(String name, double salary, int id) {
        super(name, salary, id, null, null);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker
        Worker worker1 = new Worker("Employee1", 1347.01, 101);
        Worker worker2 = new Worker("Employee2", 2355.01, 102);
        Worker worker3 = new Worker("Employee3", 6457.01, 103);
        Worker worker4 = new Worker("Employee4", 3252.01, 104);

        Manager manager = new Manager("manager", 2640.0, 201);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}
