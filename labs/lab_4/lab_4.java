interface Priceable {
    double getPrice();
}

abstract class Dog implements Priceable {

    private String name;

    public String getName() {
        return name;
    }


    public Dog(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}

class YorkshireDog extends Dog {
    private String kind = "Yorkshire";
    private double price = 100000.0;
    public YorkshireDog(String name) {
        super(name);
    }

    public void displayInfo() {
        System.out.println("Имя: " + super.getName() + ", Порода: "
                + kind);
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class ShepardDog extends Dog {
    private String kind = "Shepard";
    private double price = 1000000.0;
    public ShepardDog(String name) {
        super(name);
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + ", Порода: "
                + kind);
    }
    @Override
    public double getPrice() {
        return price;
    }
}

class Main{
    public static void main(String[] args) {
        ShepardDog shepard = new ShepardDog("Betty");
        YorkshireDog yorkshire = new YorkshireDog("Aboba");
        shepard.displayInfo();
        System.out.println("Цена: "+shepard.getPrice());
        yorkshire.displayInfo();
        System.out.print("Цена: "+yorkshire.getPrice());
    }
}
