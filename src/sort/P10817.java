package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//세수 (세개의 숫자 중 두번째로 큰 정수 구하기) 백준 알고르즘 저지 10817
//시간제한: 1초 / 세수는 1보다 크거나 같고 100보다 작거나 같다
public class P10817 {
    public static void main(String[] args) throws IOException {

        //어떤 정렬도 상관없을듯?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){

            arr[i] = Integer.parseInt(stk.nextToken());

        }//end for


        //버블소트 ㄱㄱ
        for(int i = 0; i < arr.length; i++){

            for(int j = 1; j < arr.length - i; j++){

                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }//end if

            }//end for

        }//end for

        System.out.println(arr[1]);

    }//main

}//class
