import java.util.Scanner;

public class Test02 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        int max = 0;

        for(int i = 0; i < N; i++){
            int tmp = sc.nextInt();

            if(max < tmp){
                max = tmp;
            }
            sum += tmp;

        }

        System.out.println(sum * 100.0 / max / N);

    }

}
