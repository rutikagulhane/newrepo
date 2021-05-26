public class Student {

    public static String className="Java Fullstack";
    public static String abc="abc";
    public String nameOfStudent;

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public static void sayHellofromStatic()
    {
        System.out.println("Hello from static");
    }
    public void sayHellofromObject()
    {
        System.out.println("Hello from instance");
    }
}
