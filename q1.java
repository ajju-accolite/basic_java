import java.util.*;
public class q1 {
    public static void main(String[] args) {
        
        List<Integer> num_list = Arrays.asList(3,8,1,7,3,9,2,6,1);
        Set<Integer> sort_list = new TreeSet<>(num_list);
        System.out.println("Sorted Integers are : ");
        for (int i : sort_list) {
            System.out.println(i);
        }
    }
}