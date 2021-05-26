public class Shirt {


    private ShirtSize size;
    private Colour colour;

    public Shirt(ShirtSize size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }
    public void printShirtDetails()
    {
        System.out.println(" SIZE :" +size);
        System.out.println("Colour " +colour);
    }
}
