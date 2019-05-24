public class Decoder {
    public static String decoder(String coder_text) {
        String[] text = coder_text.split("\n");
        Decoder_methods de_coder = new Decoder_methods();
        return de_coder.string_1_2(-4, text[0]) + "\n"
                + de_coder.string_1_2(8, text[1]) + "\n";
    }
}
