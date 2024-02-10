public class Anagramy {

    public static boolean isAnagram(String s1, String s2) {

        // Sprawdzenie długości
        if (s1.length() != s2.length()) {
            return false;
        }

        // Utworzenie tablicy z licznikami wystąpień znaków
        int[] charCount = new int[256];
        for (char c : s1.toCharArray()) {
            charCount[c]++;
        }

        // Sprawdzenie wystąpień znaków w drugim stringu
        for (char c : s2.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }

        // Wszystkie znaki są zgodne
        return true;
    }

    public static void main(String[] args) {

        // Testowe stringi
        String str1 = "zamek";
        String str2 = "ekzam";

        // Wywołanie funkcji i wyświetlenie wyniku
        boolean isAnagram = isAnagram(str1, str2);
        System.out.println("Czy \"" + str1 + "\" i \"" + str2 + "\" są anagramami? " + isAnagram);
    }
}