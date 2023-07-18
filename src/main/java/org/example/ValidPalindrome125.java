package org.example;

public class ValidPalindrome125 {

    public static void main(String[] args){
        String s ="0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

      //  String str2= String.copyValueOf(s.toCharArray());
        if(s.length()==1) return  true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s= s.replaceAll(" ","").toLowerCase();
       char[] str=  s.toCharArray();
       if(str.length==1) return  false;
       for (int i = 0, j = str.length-1; i <= j; i++, j--) {
            if(str[i]!=str[j]){
                return false;
            }
        }
        return true;



//        String str2= String.copyValueOf(s.toCharArray());
//        if(s.length()==1) return  true;
//        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        s= s.replaceAll(" ","").toLowerCase();
//       char[] str=  s.toCharArray();
//       if(str.length==1 && str2.length()==str.length) return  false;
//       for (int i = 0, j = str.length-1; i <= j; i++, j--) {
//            if(str[i]!=str[j]){
//                return false;
//            }
//        }
//        return true;


//        String str2= String.copyValueOf(s.toCharArray());
//        if(s.length()==1) return  true;
//        s= s.replaceAll("([^a-zA-Z]|\\s)+", " ");
//        s= s.replaceAll(" ","").toLowerCase();
//      char[] str=  s.toCharArray();
//      if(str.length==1 && str2.length()==str.length) return  false;
//        for (int i = 0, j = str.length-1; i <= j; i++, j--) {
//            if(str[i]!=str[j]){
//                return false;
//            }
//        }
//        return true;
    }
}
