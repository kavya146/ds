package sample;

public class stringToChar {

    public static void charc(String str){

        for(char i=0;i<str.length();i++){
            if(i%2==0)
              System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        stringToChar.charc("kavya");
    }
}
