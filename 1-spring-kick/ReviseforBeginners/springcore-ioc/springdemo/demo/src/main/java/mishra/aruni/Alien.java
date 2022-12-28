package mishra.aruni;

public class Alien {

    private int age;
    // private Laptop laptop;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
        System.out.println("inside default Alien constructor");
    }

    // public Alien(int age) {
    // this.age = age;
    // }

    // public Laptop getLaptop() {
    //     return laptop;
    // }

    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("age assigned");
    }

    public void code() {
        System.out.println("coding...");
        computer.compile();
    }

}
