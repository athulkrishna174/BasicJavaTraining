import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLaptop {
    
    public static void main(String[] args) {
        
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Dell", 16, 800));
        list.add(new Laptop("Apple", 8, 1200));
        list.add(new Laptop("Acer", 12, 700));
        list.add(new Laptop("Legion", 32, 1400));

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
