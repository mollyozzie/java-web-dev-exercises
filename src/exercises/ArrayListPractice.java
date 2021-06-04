package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String [] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,8,13,21,32,37,41,46));
        Integer sum = sumOfEvens(numbers);
        System.out.println(sum);
    }
    public static Integer sumOfEvens(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            if ((number % 2) == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
