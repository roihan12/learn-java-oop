class Manager extends Employee {

    String company;

    // Default constructor
//    Manager() {
//
//    }

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }


    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is manager" + this.name);
    }
}
