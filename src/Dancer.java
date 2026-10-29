public class Dancer {

    String name;
    String style;

// Konstruktør
    public Dancer(String name, String style) {
        this.name = name;
        this.style = style;
    }

    public void dance() {
        System.out.println("Dancer is grooving!");
    }

    public void showInfo() {
        System.out.println("Navn: " + name);
        System.out.println("Stil: " + style);
    }

    public final void introduce() {
        System.out.println("Hej, mit navn er " + name
                + " og jeg danser " + style + ".");
    }
}