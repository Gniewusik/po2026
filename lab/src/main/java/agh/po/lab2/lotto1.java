import java.util.ArrayList;
import java.util.Random;

public class lotto1 {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        Random random = new Random();

        while (liczby.size() < 6) {
            int losowa = random.nextInt(49) + 1; //

            if (!liczby.contains(losowa)) {
                liczby.add(losowa);
            }
        }

        System.out.println("Wylosowane liczby Lotto: " + liczby);
    }
}