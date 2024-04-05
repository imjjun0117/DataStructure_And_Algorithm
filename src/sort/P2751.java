package sort;

import java.io.*;

//단어정력  백준 온라인 저지 2751번
public class P2751 {
    public static int[] arr;
    public static int[] tmp_arr;
    public static void main(String[] args) throws IOException {
        //제한시간 2초 입력값 N <= 1,000,000 / 머지소트 사용해야할듯?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        tmp_arr = new int[N+1];


        for(int i = 1; i <= N; i++){

            arr[i] = Integer.parseInt(br.readLine());

        }//end for

        merge_sort(1, N);

        for(int i = 1; i <= N; i++){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void merge_sort(int s, int e){

        if( ( e-s ) < 1 ){
            return;
        }

        int m = s + (e - s) / 2;
        merge_sort(s, m);
        merge_sort(m+1, e);


        //투 포인터 사용
        int start = s;
        int index1 = s;
        int index2 = m + 1;

        for(int i =0; i < arr.length; i++){
            tmp_arr[i] = arr[i];
        }


        while(index1 <= m && index2 <= e){

            if(tmp_arr[index1] > tmp_arr[index2]){
                arr[start] = tmp_arr[index2];
                start++;
                index2++;
            }else{
                arr[start] = tmp_arr[index1];
                start++;
                index1++;
            }//end else

        }//end while


        while(index1 <= m){
            arr[start] = tmp_arr[index1];
            start++;
            index1++;
        }//end while


        while(index2 <= e){
            arr[start] = tmp_arr[index2];
            start++;
            index2++;
        }//end while

    }//main

}//class
