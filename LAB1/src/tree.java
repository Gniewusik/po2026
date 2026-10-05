import java.util.Scanner;

public class tree {
    public static void tree() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wysokosc");

        int wysokosc = myObj.nextInt();

        for (int i=0; i < wysokosc; i++){
            for(int j = 0; j<=i;j++){
                System.out.print('*');
            }
                System.out.println();
        }


    }
}
