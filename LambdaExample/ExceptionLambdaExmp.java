import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionLambdaExmp {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int key = 2;

        process(list, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(List<Integer> list, int key, BiConsumer<Integer, Integer> consumer) {
        for(int l : list) consumer.accept(l, key);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return ((v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (Exception e) {
                System.out.println("Exception Caught");
            }
        });
    }
}
