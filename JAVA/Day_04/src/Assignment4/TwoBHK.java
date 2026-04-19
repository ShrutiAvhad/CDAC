package Assignment4;

public class TwoBHK extends OneBHK {

    private double room2Area;

    // Default constructor
    public TwoBHK() {}

    // Parameterized constructor
    public TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    // Override show()
    @Override
    public void show() {
        System.out.println("TwoBHK -> Room1: " + roomArea +
                           " Room2: " + room2Area +
                           " Hall: " + hallArea +
                           " Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}