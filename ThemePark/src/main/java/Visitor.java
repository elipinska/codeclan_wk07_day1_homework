public class Visitor {

    private int age;
    private double height;
    private double wallet;

    public Visitor(int age, double height, double wallet) {
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWallet() {
        return wallet;
    }
}
