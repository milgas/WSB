public class Palindrom {

    public static boolean isPalindrom(String tekst) {
        if (tekst == null || tekst.isEmpty()) {
            return false;
        }

        int i = 0;
        int j = tekst.length() - 1;
        while (i < j) {
            if (tekst.charAt(i) != tekst.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrom = "kobyła ma mały bok";
        String niePalindrom = "Ala ma kota";

        System.out.println("Czy \"" + palindrom + "\" jest palindromem? " + isPalindrom(palindrom));
        System.out.println("Czy \"" + niePalindrom + "\" jest palindromem? " + isPalindrom(niePalindrom));
    }
}