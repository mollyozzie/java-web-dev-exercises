package exercises;

public class ArrayPractice {
    public static void main(String [] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int i: integerArray) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
