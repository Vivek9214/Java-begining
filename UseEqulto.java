//To compare String using equalto() Method
public class UseEqulto {
    public static void main(String[] args){
        String str = "Hello";
        String str2 = new String("Hello");
        if(str2 == str){
            System.out.println("Noo");
        }
        else if(str2.equals(str)){
            System.out.println("Yess");
        }
        else if(str2 == str){
            System.out.println("Yahh!");
        }
    }
}
