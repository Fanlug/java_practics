abstract class Dog {

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
    public YorkshireDog(String name) {
        super(name);
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + ", Порода: "
                + kind);
    }
}

class ShepardDog extends Dog {
    private String kind = "Shepard";
    public ShepardDog(String name) {
        super(name);
    }

    public void displayInfo() {

        System.out.println("Имя: " + super.getName() + ", Порода: "
                + kind);
    }
}

class Main{
    public static void main(String[] args) {
        ShepardDog shepard = new ShepardDog("Betty");
        YorkshireDog yorkshire = new YorkshireDog("Aboba");
        shepard.displayInfo();
        yorkshire.displayInfo();
    }
}
