import java.util.Arrays;
import java.util.List;

public class StreamExmp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Each element multiplied by 2 and the sum of elements

        System.out.println("Sum = " + list.stream().map(i -> i*2).reduce(0, Integer::sum));


        List<Integer> list2 = Arrays.asList(12,20,35,46,55,68,75);

        // Sum of elements divisible by 5
        
        System.out.println("Sum (divisible by 5) = " + list2.stream().filter(i -> i % 5 == 0).reduce(0, Integer::sum));


    }
}
