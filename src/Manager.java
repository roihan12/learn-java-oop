class Manager {
    String name;
    String company;

    // Default constructor
    Manager() {

    }

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }


    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is manager" + this.name);
    }
}
