import java.util.ArrayList;

public class StringPermutation {


    public static ArrayList<String> stringPermutations(String input) {

        ArrayList<String> output = new ArrayList<>();

        String permutation;

        for (int i = 0; i < input.length(); i++){
            for (int j = i + 1; j < input.length(); j++) {
                Character charToSwap = input.charAt(i);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String input = "robert";

        ArrayList<String> myPermutations = stringPermutations(input);


        for (String word : myPermutations){
            System.out.println(word);
        }
    }

}
