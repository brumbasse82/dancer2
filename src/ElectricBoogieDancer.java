public class ElectricBoogieDancer extends Dancer {

    // Konstruktør
    public ElectricBoogieDancer(String name) {
        super(name, "Electric Boogie");
    }

    @Override
    public void dance() {
        System.out.println(name + " danser med robot-agtige bevægelser");
    }

    public void popAndLock() {
        System.out.println(name + " popper og locker");
    }
}