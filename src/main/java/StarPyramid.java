public class StarPyramid {

    public static String generatePyramid(int size){
        StringBuilder pyramid = new StringBuilder();
        int width = size / 2;
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                pyramid.append(" * ");
            }
            pyramid.append("\n");
        }
        return pyramid.toString();
    }

    public static void main(String[] args) {
        //System.out.println(generatePyramid(5));

        System.out.println('A' + 32);
        char c = 'A' + 32;
        System.out.println(c);


    }

}
