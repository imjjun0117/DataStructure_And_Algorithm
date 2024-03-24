import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 온라인 저지 12891번
public class Test08 {
    static int checkArr[];
    static int myArr[];
    static int checkNum;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(stk.nextToken());
        int P = Integer.parseInt(stk.nextToken());

        String input_dna = br.readLine();

        char dnaStr[] = input_dna.toCharArray();
        checkArr = new int[4]; //부분문자열에 포함돼야 할 최소갯수
        myArr = new int[4];// 실제로 체크할 문자열갯수
        int result = 0;
        checkNum = 0;

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < checkArr.length; i++){
            //포함돼야할 문자열 정보를 넣는다
            checkArr[i] = Integer.parseInt(stk.nextToken());
            if(checkArr[i] == 0){
                //만약 0이면 문자열이 포함될 필요가 없으므로 checkNum은 1을 증가시켜준다
                checkNum++;
            }//end if
        }//end for

        if(checkNum == 4){
            //일치하는지 체크
            result++;
        }

        for(int i = 0; i < P; i++){
           add(dnaStr[i]);
        }//end for

        for(int i = P; i < S; i++){
            //첫번째 세팅후 슬라이딩 윈도우 시작
            add(dnaStr[i]);
            remove(dnaStr[i-P]);
            if(checkNum == 4){
                result++;
            }
        }

        System.out.println(result);

    }//main

    static void add(char a){
        //데이터 추가
        switch (a){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkNum++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkNum++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkNum++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkNum++;
                break;
        }
    }

    static void remove(char a){
        //데이터 삭제
        switch (a){
            case 'A':
                if(myArr[0] == checkArr[0]) checkNum--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkNum--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkNum--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkNum--;
                myArr[3]--;
                break;
        }
    }
}
