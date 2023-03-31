import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int num = 0;
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < sum; i++){
            num = sc.nextInt();
            list.add(num);
        }
        int min = Collections.min(list);
        for(int i = 0; i < sum; i++){
            for(int j = 0; j < sum; j++){
                if(0 < list.get(j) && list.get(j) <= min){
                    list.set(j,0);
                    min += 1;
                }
            }
            if(0 == Collections.max(list)){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
