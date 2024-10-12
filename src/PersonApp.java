public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Roihan", "Jasinga");
//        person1.name = "Roihan Sori";
//        person1.address = "Bogor";
        person1.sayHello("Jaffar");
        Person person2 = new Person("Hadi");
//        person2.name = "Roihan";
//        person2.address = "Jasinga";

        Person person3;
        person3 = new Person();

        person3.sayHello("Golang");
        System.out.println(person1);
        System.out.println(person2.name);
        System.out.println(person3);
    }
}
