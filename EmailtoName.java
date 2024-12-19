// To Extract Name from Email
import java.util.*;
public class EmailtoName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Email = sc.nextLine();
        String Name="";
        for(int i=0; i<Email.length(); i++){
            if(Email.charAt(i) == '@'){
                break;
            }
            else{
                Name = Name + Email.charAt(i);
            }
        }
        System.out.println("User Name : "+Name);
        sc.close();
}
}
