public class Bol2_12Ejer {

    public static void main(String[] args) {
        
        for (int i = 50; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 100; i >= 50; i--) {
            System.out.println(i);
        }

        System.out.println();
        
        for (int i = 20; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 90; i <= 130; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 70; i >= 25; i--){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

    }
    
}
