package bridge_mnogo_naslednikov;

public abstract class Car {

    Make make;

    abstract void showDetails();

    public Car(Make m) {
        this.make = m;
    }
}

class Sedan extends Car {

    public Sedan(Make m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        make.setMake();
    }
}

class HatchBack extends Car {

    public HatchBack(Make m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("HatchBack");
        make.setMake();
    }
}
