public class Program {


    private String PrgramName;
    private String ProgramDesc;
    private ProgramType type;
    private int Cost;

    public Program(String prgramName) {
     if(prgramName.length()<6) {

            throw new RuntimeException("name should be atleast 6 chars");

        }

        this.PrgramName = prgramName;

        this.type=ProgramType.FULLTIME;
    }

    public Program(String prgramName, String programDesc) {
        this(prgramName);
        ProgramDesc = programDesc;
    }

    public Program(String prgramName, String programDesc, ProgramType type) {
        this(prgramName,programDesc);

        this.type = type;
    }
    public Program(String prgramName, String programDesc, ProgramType type, int cost) {
       this(prgramName, programDesc, type);
        Cost = cost;
    }




    public Program()
    {

    }



//    public void printDetails()
//
//    {
//
//        System.out.println(" Program Name: "+PrgramName);
//        System.out.println("Program Description "+ProgramDesc);
//        System.out.println("Program type "+ type);
//        System.out.println("Cost "+Cost);
//
//
//
//    }

    @Override
    public String toString() {
        return "Program{" +
                "PrgramName='" + PrgramName + '\'' +
                ", ProgramDesc='" + ProgramDesc + '\'' +
                ", type=" + type +
                ", Cost= $" + Cost +
                '}';
    }

    public static void main(String[] args) {
        Program p=new Program("JAVAQA","java learing",ProgramType.PARTTIME);
        System.out.println(p);
        Program p1=new Program("Devops","Devops",ProgramType.PARTTIME);
        System.out.println(p1);





    }
}
