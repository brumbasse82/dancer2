import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dancer> dancers = new ArrayList<>();

        dancers.add(new Dancer("Lucas", "Hip-hop"));
        dancers.add(new ElectricBoogieDancer("Kevin"));
        dancers.add(new Breakdancer("Ludvig"));
        dancers.add(new TikTokDancer("Andreas"));

        for (Dancer dancer : dancers) {
            dancer.introduce();
            dancer.showInfo();
            dancer.dance();
            if (dancer instanceof ElectricBoogieDancer) {
                ((ElectricBoogieDancer) dancer).popAndLock();
            }
            System.out.println();
        }
    }

}