public class ReverseString {

    public String iterateHalfway(String input){
        String[] inputArray = input.split("");
        for(int i = 0; i < inputArray.length / 2; i++){
            String swap = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = swap;
        }
        return null;
        //return String.join(inputArray);
    }

}
