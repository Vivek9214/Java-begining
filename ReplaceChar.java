//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
import java.util.*;
public class ReplaceChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inpute = sc.next();
        String result = "";
        for(int i= 0; i< inpute.length(); i++){
            if(inpute.charAt(i) == 'e'){
                result+="i";
            }
            else{
                result+=inpute.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
