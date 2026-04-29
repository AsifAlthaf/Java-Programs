import java.util.*;
public class Day4_Actiity2 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        int idx = sc.nextInt();
        System.out.println("Element at idx: "+s.toArray()[idx]);
        sc.close();
    }
}
