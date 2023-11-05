public class RgbToHex {
    public static String rgb(int r, int g, int b){
        String[] numbers = new String[] {Integer.toString(r),Integer.toString(g),Integer.toString(b)};
        for (int i = 0; i < 3; i++)
        {
            int[] hex = new int[2];
            numbers[i] = Integer.toString(Math.max(0, Math.min(255, Integer.parseInt(numbers[i]))));
            hex[1] = (Integer.parseInt(numbers[i]) % 16);
            hex[0] = (Integer.parseInt(String.join("", numbers[i]))-hex[1])/16;
            String[] hexs = new String[2];
            for (int j = 0; j< hexs.length; j++){
                switch (hex[j]){
                    case(10): hexs[j] = "A"; break;
                    case(11): hexs[j] = "B"; break;
                    case(12): hexs[j] = "C"; break;
                    case(13): hexs[j] = "D"; break;
                    case(14): hexs[j] = "E"; break;
                    case(15): hexs[j] = "F"; break;
                    default:
                        hexs[j] = Integer.toString(hex[j]);
                }
            }
            numbers[i] = String.join("", hexs);
        }
        return String.join("",numbers);
    }
}
