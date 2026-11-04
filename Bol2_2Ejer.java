public class Bol2_2Ejer {

    public static void main(String[] args) {

        // BUCLE FOR
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println();

        // BUCLE WHILE
        int j = 1;

        while (j <= 20) {
            System.out.println(j);
            j++;
        }

        System.out.println();

        // BUCLE DO-WHILE
        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 20);

        System.out.println();

        // APTDO B
        for (int x = 1; x <= 50; x++) {

            if (x % 2 == 0) {
                System.out.printf("%5d%n" , x);
            }
        }

    }
}
