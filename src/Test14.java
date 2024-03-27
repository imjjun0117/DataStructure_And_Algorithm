import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 온라인 저지 버블 소트 프로그램1 1377번
public class Test14 {

    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
       int arr[] = new int[n];
       int sortArr[] = new int[n];

       for(int i = 0; i < n; i++){

           arr[i] = Integer.parseInt(br.readLine());
           sortArr[i] = Integer.parseInt(br.readLine());

       }//end for

       Arrays.sort(sortArr);



    }//main
}//class
