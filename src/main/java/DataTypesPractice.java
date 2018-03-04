import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class DataTypesPractice {

    public static void main(String[] args) {
//        String input = "Hello World";
//
//        System.out.println(reverseCase(input));



    }

    public static String reverseCase(String input) {
        String output = "";
        ArrayList<String> caps = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z"));

        ArrayList<String> lows = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z"));

        for (String letter : input.split("")) {
            if (caps.contains(letter)) {
                output += lows.get(caps.indexOf(letter));
            } else if (lows.contains(letter)) {
                output += caps.get(lows.indexOf(letter));
            } else {
                output += letter;
            }
        }

        return output;
    }


}
