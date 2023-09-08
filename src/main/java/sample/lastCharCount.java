package sample;

public class lastCharCount {

    public static void countChar(String str){
        int len=str.length();
        char last=str.charAt(len-1);
        int count=1;
        for(char i=0;i<len-1;i++){
            if(str.charAt(i)==last)
                count++;
        }
        System.out.print(count);
    }


    public static void main(String[] args) {
        lastCharCount.countChar("kavaaya");
    }
}
