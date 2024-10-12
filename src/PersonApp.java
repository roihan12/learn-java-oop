public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Roihan Sori";
        person1.address = "Bogor";
        Person person2 = new Person();
        person2.name = "Roihan";
        person2.address = "Jasinga";

        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2.name);
        System.out.println(person3);
    }
}
