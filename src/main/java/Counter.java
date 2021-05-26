public class Counter {


    private int instanceCounter=2;
    private static int staticCounter=3;

    public void increamentcount()
    {
        instanceCounter++;
        staticCounter++;
    }
    public void printcounter()
    {
        System.out.println(instanceCounter);
        System.out.println(staticCounter);
    }
}
