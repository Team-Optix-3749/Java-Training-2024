// Abstract means that you can't create a object of this class, only it's children
public abstract class Shirt {
    public String color;
    
    public Shirt(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    
    abstract void getDescription();

    public static void main(String[] args) {
        Shirt[] myShirt = {new T_Shirt("Blue", "XL:", 29.99), new Jacket("Black", "Adidas", 49.99)};
        for (int i = 0; i < myShirt.length; i++) {
            myShirt[i].getDescription();
        }
    }
}

class T_Shirt extends Shirt {
    private String size;
    private double price;

    public T_Shirt(String color, String size, double price) {
        super(color);
        this.size = size;
        this.price = price;
    }
    
    @Override
    public void getDescription() {
        System.out.println("\n\nT-Shirt:\nColor: " + color + "\nSize: " + size + "\nPrice: $" + price);
    }
}

class Jacket extends Shirt {
    private double price;
    private String brand;

    public Jacket(String color, String brand, double price) {
        super(color);
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void getDescription() {
        System.out.println("\n\nJacket:\nColor: " + color + "\nBraand: " + brand + "\nPrice: $" + price);
    }
}