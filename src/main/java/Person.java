public class Person {


    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this(name,age);

        //this.age = age;
        this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
       this(name);
        this.age = age;
    }
    public Person()
    {

    }

    public void printDetails(boolean full) {
        if (full) {
            this.printDetails();
            System.out.println("Age = " + age);
            System.out.println("Address = " + address);

        } else {
            this.printDetails();
        }
    }
        public void printDetails(){
        System.out.println("Name of Person " + name);

    }

    public static void main(String[] args) {
        Person p=new Person("Rutika");
        p.printDetails(false);
        Person p1=new Person("Arjun",3);
        p1.printDetails(true);
    }

}
