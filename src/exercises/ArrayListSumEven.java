package exercises;

import java.util.ArrayList;
public class ArrayListSumEven {

    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>();
        someIntegers.add(5);
        someIntegers.add(4);
        someIntegers.add(6);
        someIntegers.add(3);
        someIntegers.add(2);
        someIntegers.add(67);
        someIntegers.add(40);
        someIntegers.add(50);
        someIntegers.add(100);
        someIntegers.add(25);
        someIntegers.add(33);

        System.out.println(sumEven(someIntegers));
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
