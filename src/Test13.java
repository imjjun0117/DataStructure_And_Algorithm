import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//백준 온라인 저지 버블정렬 2750번
public class Test13 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N - 1; i++){

            for(int j = 0; j < N - i - 1; j++){
                int temp = 0;

                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }//end for

        }//end for

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        br.close();
    }//main
}//class
