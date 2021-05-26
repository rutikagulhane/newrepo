public class Main {
    public static void main(String[] args) {
        Student.sayHellofromStatic();
        System.out.println(Student.abc);

        Student s=new Student("Rutika");
        s.sayHellofromObject();
        System.out.println(Constants.Company_Name);


        System.out.println("========================");


        Counter obj1=new Counter();
        Counter obj2=new Counter();

        obj1.increamentcount(); //2 to 3
        obj1.printcounter(); // 3 to 4

        obj2.increamentcount(); //2 to 3
        obj2.printcounter();   //4 to5
        System.out.println("+++++++++++++++");

        Shirt s1=new Shirt(ShirtSize.valueOf("S"),Colour.valueOf("Red"));
        s1.printShirtDetails();
        System.out.println();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();



        Employee e=new Employee("Rutika",1236,50000,"IT");
        System.out.println(e.getName());
        System.out.println(e.getEmp_id());
        System.out.println(e.getSalary());
        System.out.println(e.getDept());



        e.setSalary(80000);
        e.getSalary();

    }
}
