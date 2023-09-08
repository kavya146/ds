package sample;

public class strLen {

    public static int strLength(String str){
        String[] strings=str.split("/");
        int str1Len=0;
        int str2Len=0;
        for(char i=0;i<strings[0].length();i++){
            str1Len++;
        }

        for(char j=0;j<strings[1].length();j++){
            str2Len++;
        }

        if(str1Len==str2Len)
            return str1Len+str2Len;

        else if(str1Len>str2Len)
            return str1Len;

        else
            return str2Len;
    }


    public static void main(String[] args) {
        System.out.print(strLength("kavya/srika"));

    }
}
