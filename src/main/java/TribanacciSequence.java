import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TribanacciSequence {

    public static double[] generateTribanacciSequence(double[] signature, int precision){
        ArrayList<Double> outputArrayList = new ArrayList<>();
        outputArrayList.add(signature[0]);
        outputArrayList.add(signature[1]);
        outputArrayList.add(signature[2]);

        double first = signature[0];
        double second = signature[1];
        double third = signature[2];
        double fib;
        double[] output;

        if (precision < 3){
            output = new double[precision];
            for(int i = 0; i < precision; i++){
                output[i] = signature[i];
            }
            return output;
        }

        for(int i = 1; i <= precision - 3; i++){
            fib = first + second + third;
            first = second;
            second = third;
            third = fib;
            outputArrayList.add(fib);
        }

        output = new double[outputArrayList.size()];

        for (int i = 0; i < output.length; i++){
            output[i] = outputArrayList.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        double[] signature = {0, 0, 1};
        int precision = 13;

        double[] output = TribanacciSequence.generateTribanacciSequence(signature, precision);

        for (double number : output){
            System.out.println(number);
        }
    }

}
