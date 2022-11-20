package WithoutRepetition;



public class WithoutRepetition {

//    public static void main(String[] args) {
//        int[] vector = fillVector();
//       // System.out.println("Original Vector");
//       // printVector(vector);
//        //System.out.println("sin repetición");
//       // vector = removeRepeticion(vector);
//        //printVector(vector);
//       // System.out.println("Ordenado");
//       // vector = orderMinToMax(vector);
//      //  printVector(vector);
//        System.out.println("union of vectors");
//        int[] vectorA = fillVector();
//        int[] vectorB = fillVector();
//        System.out.println("Original vectors");
//        printVector(vectorA);
//        printVector(vectorB);
//        vector = union(vectorA, vectorB);
//        System.out.println("resultant vector");
//        printVector(vector);
//        System.out.println("intersection of vectors");
//       // vectorA = new int[]{1, 2};
//        //vectorB = new int[]{4,5};
//        vectorA = fillVector();
//        vectorB = fillVector();
//        System.out.println("Original vectors");
//        printVector(vectorA);
//        printVector(vectorB);
//        try {
//            vector = intersection(vectorA, vectorB);
//            printVector(vector);
//        } catch (Exception e) {
//            System.out.println("!!" + e.getMessage() + "¡¡");
//        }
//
//        System.out.println("subtraction of vectors");
//        vectorA = fillVector();
//        vectorB = fillVector();
//        System.out.println("Original vectors");
//        printVector(vectorA);
//        printVector(vectorB);
//        try {
//            vector = vectorsubtraction(vectorA, vectorB);
//            printVector(vector);
//        } catch (Exception e) {
//            System.out.println("!!" + e.getMessage() + "¡¡");
//        }
//
//
//    }

    public static int[] fillVector(){
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
        return vector;
    }

    public static  void printVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+", ");
        }
        System.out.println("");
    }

    public static int[] removeRepeticion(int[] vector){
        boolean repeticion = true;
        for (int i = 0; i < vector.length; i++) {
            int firstNumber = vector[i];
            for (int j = i+1; j < vector.length; j++) {
                int secondNumber = vector[j];
                if(firstNumber == secondNumber){
                    vector[j] = -1;
                }
            }

        }
        vector = reFillVector(vector);
        return vector;
    }

    public static int[] reFillVector(int[] vector){
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == -1){
                count++;
            }
        }
        int[] newVector = new int[vector.length-count];
        int j = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] != -1){
                newVector[j] = vector[i];
                j++;
            }
        }
        return newVector;
    }

    private static int[] orderMinToMax(int[] vector){

        for (int i = 0; i < vector.length; i++) {
            if(i!=vector.length){
                for (int j = i+1; j < vector.length; j++) {
                if(vector[i] > vector[j]){
                    int temporal = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temporal;
                }
                }
            }

        }

        return vector;
    }

    public static int[] union(int[] vector1, int[] vector2){
    int[] finalVector = new int[vector1.length + vector2.length];
        int j = 0;
        for (int i = 0; i < vector1.length; i++) {
            finalVector[i] = vector1[i];
            j = i+1;
        }
        for (int i = 0; i < vector2.length; i++) {
            finalVector[j] = vector2[i];
            j++;
        }
        finalVector = removeRepeticion(finalVector);
    return finalVector;
    }

    protected static int[] intersection(int[] vector1, int[] vector2)  throws Exception {
        int repeticioncount = 0;
        vector1 = removeRepeticion(vector1);
        vector2 = removeRepeticion(vector2);
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    repeticioncount++;
                }
            }
        }
        int[] finalVector;
        if (repeticioncount != 0) {
            finalVector = new int[repeticioncount];

        } else {
            throw new Exception("the resultant vector is null");
        }
        int z = 0;
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    finalVector[z] = vector2[j];
                    z++;
                }
            }
        }

        return finalVector;

    }

    protected static int[] vectorsubtraction (int[] vector1, int[] vector2) throws Exception {

        if(vector1.length == 0 || vector2.length == 0){
            throw new Exception("One of the vector is empty");
        }
        vector1 = removeRepeticion(vector1);
        vector2 = removeRepeticion(vector2);

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if(vector1[i] == vector2[j]){
                    vector1[i] = -1;
                }
            }
        }
        int[] finalvector = reFillVector(vector1);
        return finalvector;
    }






}