
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        int index = -1;
        int count = 0;
        boolean check = true;
        for (int i = 0; i < input.length(); i++) {
            if (count >= columnNumber + 1) {
                if (index != -1) {
                    input = input.substring(0, index) + '\n' + input.substring(index + 1);
                    count = 0;
                    i = index + 1;
                    index = -1;
                    check = false;
                }
            }
            if (input.charAt(i) == ' ')
                index = i;
            count++;
        }
        if (index != -1 && check ==  true) {
            input = input.substring(0, index) + '\n' + input.substring(index + 1);
        }
        return input;
    }
}