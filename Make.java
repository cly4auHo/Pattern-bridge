package bridge_mnogo_naslednikov;

public interface Make {

    void setMake();

}

class Kia implements Make {

    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}

class Shkoda implements Make {

    @Override
    public void setMake() {
        System.out.println("Shkoda");
    }
}
