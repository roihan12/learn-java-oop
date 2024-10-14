public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Roihan");

        employee.sayHello("Harry");

        employee = new Manager("Muller");
        employee.sayHello("Serena");

        employee = new VicePresident("Kane");
        employee.sayHello("Sane");

        sayHello(new Employee("Roihan"));
        sayHello(new Manager("Gnabry"));
        sayHello(new VicePresident("Olise"));

    }

    static  void  sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Heloo VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Heloo Manager " + manager.name);
        } else  {
            System.out.println("Heloo " + employee.name);
        }
    }
}
