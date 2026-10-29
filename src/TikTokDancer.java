public class TikTokDancer extends Dancer {

    // Konstruktør
    public TikTokDancer(String name) {
        super(name, "TikTok Dans");
    }

    @Override
    public void dance() {
        System.out.println(name + " danser TikTok Dans");
    }
}
