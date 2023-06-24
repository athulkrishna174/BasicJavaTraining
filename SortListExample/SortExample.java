import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorImplement implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        
        // sort with first digit of numbers

        if(o1 % 10 > o2 % 10)
            return 1;
        
        return -1;
    }
    
}

public class SortExample {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(455);
        list.add(488);
        list.add(856);
        list.add(359);
        list.add(118);
        list.add(176);
        list.add(514);
        list.add(633);
        list.add(724);
        list.add(547);
        list.add(782);
        list.add(419);
        list.add(620);

        Comparator<Integer> comparator = new ComparatorImplement();

        Collections.sort(list, comparator);

        list.forEach(System.out::println);
    }
}
