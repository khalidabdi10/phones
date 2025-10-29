
class Phone {
    protected String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public final void ring() {
        System.out.println("Phone is ringing....");
    }
}

class SmartPhone extends Phone {
    public SmartPhone(String brand) {
        super(brand);
    }

    public void showInfo() {
        super.displayBrand();
        System.out.println("This is a smartphone.");
    }
}

public class Phones {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Apple");
        sp.showInfo();
        sp.ring();
    }
}