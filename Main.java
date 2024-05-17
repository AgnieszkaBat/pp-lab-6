public final class Worker extends Employee {
    public Worker(String name, double salary, int id) {
        super(name, salary, id, null, null);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.getId() == other.getId();
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker
        Worker worker1 = new Worker("Employee1", 1347.01, 101);
        Worker worker2 = new Worker("Employee2", 2355.01, 102);
        Worker worker3 = new Worker("Employee3", 6457.01, 103);
        Worker worker4 = new Worker("Employee4", 3252.01, 102); // Ten sam ID co worker2

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

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker1.getName() + " equals worker2: " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals worker3: " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " equals worker4: " + worker1.equals(worker4));
        System.out.println(worker1.getName() + " equals manager: " + worker1.equals(manager));
    }
}
