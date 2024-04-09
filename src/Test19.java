
//대소문자 리버스
public class Test19 {

    public static void main(String[] args){

        String input = "Hello World";

        char[] input_char = input.toCharArray();

        for(int i = 0; i < input_char.length; i++){

            if(input_char[i] > 64 && input_char[i] < 91){
                input_char[i] += 32;
            }else if(input_char[i] > 97 && input_char[i] < 123){
                input_char[i] -= 32;
            }

        }//end for


        System.out.println(String.valueOf(input_char));

    }//main

}//class
