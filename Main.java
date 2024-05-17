import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {

        
        Worker worker1 = new Worker("Employee1", 1347.01, 101);
        Worker worker2 = new Worker("Employee2", 2355.01, 102);
        Worker worker3 = new Worker("Employee3", 6457.01, 103);
        Worker worker4 = new Worker("Employee4", 3252.01, 104);

                Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println("Salary" + worker.getName() + ": " + worker.getSalary());
            worker.work();
        }

        System.out.println("Salary" + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}
