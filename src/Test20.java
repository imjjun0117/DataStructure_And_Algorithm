import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test20 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        String findStr = br.readLine();

        int s = 0;
        int e = s+2;

        StringBuilder sb = new StringBuilder();

        while(e < input.length){

            String chkStr = "";

            for(int i = s; i <= e; i++){
                chkStr += input[i];
            }//end for


            if(findStr.equals(chkStr)){
               sb.append(s).append(" ");
            }
            s++;
            e++;
        }//end whili


        System.out.println(sb.toString());




    }//main

}//class
