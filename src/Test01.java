import java.util.Scanner;


public class Test01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += input.toCharArray()[i] -48;
        }


        System.out.println(sum);

    }

}
