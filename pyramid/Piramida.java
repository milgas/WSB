public class Piramida {

    public static void drukujPiramide(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Liczba N musi być dodatnia");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        drukujPiramide(6);
    }
}