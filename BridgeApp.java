package bridge_mnogo_naslednikov;

public class BridgeApp {

    public static void main(String[] args) {
        Car c = new Sedan(new Kia());
        c.showDetails();
    }
}
