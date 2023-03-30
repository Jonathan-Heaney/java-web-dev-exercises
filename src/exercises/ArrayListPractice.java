package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

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

        Integer sum = 0;
        for(int i = 0; i < someIntegers.size(); i++) {
            if (someIntegers.get(i) % 2 == 0) {
                sum += someIntegers.get(i);
            }
        }

        System.out.println(sum);
    }
}
