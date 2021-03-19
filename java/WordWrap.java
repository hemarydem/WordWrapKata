
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
            //System.out.println("index = " + index);
            //System.out.println("count = " + count);
        }
        if (index != -1 && check ==  true) {
            input = input.substring(0, index) + '\n' + input.substring(index + 1);
        }
        /*for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                input = input.substring(0, i) + '\n' + input.substring(i + 1);
        }*/

       /* int index = 0;
        int count = 0;
        boolean check = false;
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == ' ')
                check = true;
        }
        if (check != true)
            return input;
        for (int i = 0; i < input.length(); i++) {
            count ++;
            if (input.charAt(i) == ' ') {
                index = i;
            }
            if (count > columnNumber) {
                if (index == i && index != 0){
                    input = input.substring(0, i) + '\n' + input.substring(i + 1);
                } else {
                    input = input.substring(0, index) + '\n' + input.substring(index + 1);
                    i = index + 1 ;
                    count = 0;
                }
            }
        }*/
        return input;
    }
}