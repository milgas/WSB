public class PierwszeLitery {

    public static String zmienPierwszeLitery(String tekst) {
        StringBuilder sb = new StringBuilder();
        boolean pierwszaLitera = true;
        for (char c : tekst.toCharArray()) {
            if (Character.isWhitespace(c)) {
                pierwszaLitera = true;
                sb.append(c);
            } else {
                if (pierwszaLitera) {
                    sb.append(Character.toUpperCase(c));
                    pierwszaLitera = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String tekst = "Ala ma kota.";
        String zmienionyTekst = zmienPierwszeLitery(tekst);
        System.out.println("Tekst przed zmianą: " + tekst);
        System.out.println("Tekst po zmianie: " + zmienionyTekst);
    }
}