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
        System.out.println("Heloo " + employee.name);
    }
}
