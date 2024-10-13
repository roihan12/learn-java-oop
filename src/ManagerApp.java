public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Roihan");
        manager.name = "Roihan";
        manager.sayHello("Ahmmad");

        var vp = new VicePresident("Jaffar");
        vp.name = "Test";
        vp.sayHello("Test 1");

        System.out.println(manager.toString());
    }
}
