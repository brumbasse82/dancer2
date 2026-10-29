public class Breakdancer extends Dancer {

    // Konstruktør
    public Breakdancer(String name) {
        super(name, "Breakdance");
    }
    @Override
    public void dance() {
        System.out.printf(name + " laver spins og headspins");
    }
}
