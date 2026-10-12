import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lotto2 {
    public static void Losowanie() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> strzaly = new ArrayList<>();
        Random liczba = new Random();
        Scanner wczytaj = new Scanner(System.in);
        for (int i =1; i < 8; i++){
            System.out.print("Podaj " + i + "Liczbe");
            int strzal = wczytaj.nextInt();
            strzaly.add(strzal);
        }
    }
}