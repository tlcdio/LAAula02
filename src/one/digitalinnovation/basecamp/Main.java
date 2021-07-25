package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Loops e Arrays.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("BREAK");

        //Sem label
        while (true) {
            System.out.println("Não vai se infinito...");
            break;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i " + i);
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (k == 2) {
                    break;
                }
                System.out.println("i " + i + " k " + k);
            }
        }

        int i = 0;
        do {
            if (i == 3) {
                break;
            }
            System.out.println("i " + i);
            i++;
        } while (i < 5);

        //Com label
        out:
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                if (j == 1) {
                    break out;
                }
                System.out.println("k " + k + " j " + j);
            }
        }
        System.out.println("Veio para cá...");

        System.out.println("CONTINUE");

        //Sem label
        int k = 0;
        while (k < 5) {

            k++;
            if (k == 2 || k == 5) {
                continue;
            }
            System.out.println("k " + k);
        }

        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println("j " + j);
        }

        for (int j = 0; j < 3; j++) {
            for (int l = 0; l < 3; l++) {
                if (l == 1) {
                    continue;
                }
                System.out.println("j " + j + " l " + l);
            }
        }

        int a = 0;
        do {

            a++;
            if (a == 2 || a == 5) {
                continue;
            }
            System.out.println("a " + a);
        } while (a < 5);

        //Com label
        out:
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 5; n++) {
                if (n == 2) {
                    continue out;
                }
                System.out.println("m " + m + " n " + n);
            }
        }

        System.out.println("1 até 14 FOR");
        for (int h = 1; h <= 14; h++) {
            if (h % 2 != 0) {
                continue;
            }
            System.out.println("h " + h);
            if (h == 12) {
                break;
            }
        }

        System.out.println("1 até 14 WHILE");
        int h = 1;
        while (h <= 14) {

            if (h == 12) {
                break;
            }

            if (h % 2 == 0) {
                System.out.println("h " + h);
                h++;
            } else {
                h++;
                continue;
            }
        }

        //RETURN
        for (int x = 0; x <= 2; x++) {
            return;
        }
        System.out.println("Não vai aparecer este texto.");
    }
}