import java.util.HashMap;
import java.util.Map;

public class Java{

    public String Subset(long a1[], long a2[], int n, int m){
        if(m>n){
            return "No";
        }

        Map<Long, Integer> map = new HashMap<>();

        for(long num : a1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(long num : a2){
            if(!map.containsKey(num) || map.get(num) == 0){
                return "No";
            }
            map.put(num, map.get(num) - 1);
        }
        return "Yes";
    }

    public static void main(String[] args){
        long a1[] = {11, 1, 13, 21, 3, 7};
        long a2[] = {11, 3, 7, 1};
        int n = a1.length;
        int m = a2.length;
        System.out.println(new Java().Subset(a1, a2, n, m)); // for non-static method
        // System.out.println(Subset(a1, a2, n, m)); // for static method
    }
}