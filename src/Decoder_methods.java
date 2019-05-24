public class Decoder_methods {
    private String a = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String string_1_2(int s, String str){
        String[] symbols = str.split("");
        StringBuilder de_str = new StringBuilder();
        for (String symbol : symbols) {
            if (a.contains(symbol)) {
                int p = s + a.indexOf(symbol);
                if (p > 32) p = p - 33;
                if (p < 0) p = p + 33;
                de_str.append(a.charAt(p));
            }
            else de_str.append(symbol);
        }
        return de_str.toString();
    }
}
