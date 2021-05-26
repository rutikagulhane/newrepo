public class Calculator {


    public static void main(String[] args) {

        Calculator c=new Calculator();
        System.out.println(c.addition(3,6,5));
        System.out.println(c.addition(4,6.9));


    }




    public  int addition(int a,int b)
    {
        return a+b;
    }
    public int addition(int a,int b,int c)
    {
        return addition(a,b)+c;
    }

    public int addition(int ... a)
    {
        int sum=0;
        for(int i : a)
        {
            sum=sum+i;
        }
        return sum;
    }
    public double addition(double a,double b)
    {
        return a+b;
    }



}
