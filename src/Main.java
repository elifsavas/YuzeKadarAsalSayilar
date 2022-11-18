public class Main {
    public static void main(String[] args) {
        int i, j;
        int sayac = 0 ;

        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.println(i);
            }
            sayac = 0;


        }


    }
}



