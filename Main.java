import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker
        Worker worker1 = new Worker("Employee1", 1347.01, 101);
        Worker worker2 = new Worker("Employee2", 2355.01, 102);
        Worker worker3 = new Worker("Employee3", 6457.01, 103);
        Worker worker4 = new Worker("Employee4", 3252.01, 102); // Ten sam ID co worker2
        Worker worker5 = new Worker("Employee5", 4257.01, 105); // Nowy Worker z innym ID
        Worker worker6 = new Worker("Employee6", 5257.01, 106); // Nowy Worker z innym ID

        // Tworzenie instancji klasy Manager
        Manager manager1 = new Manager("manager1", 2640.0, 201);
        Manager manager2 = new Manager("manager2", 3000.0, 202); // Nowy Manager z innym ID

        // Lista przechowująca wszystkich pracowników
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        // Zliczanie całkowitej sumy pensji wszystkich pracowników
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary of all employees: " + totalSalary);

        // Zliczanie całkowitej sumy pensji wszystkich managerów
        double totalManagerSalary = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary of all managers: " + totalManagerSalary);

        // Zliczanie całkowitej sumy pensji wszystkich pracowników (bez managerów)
        double totalWorkerSalary = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        // Wyszukiwanie wszystkich instancji obiektu, które mają swój odpowiednik w kolekcji
        for (Employee employee : employees) {
            long count = employees.stream()
                    .filter(e -> e.getId() == employee.getId())
                    .count();
            if (count > 1) {
                System.out.println(employee.getName() + " has a duplicate in the collection.");
            }
        }
    }
}
