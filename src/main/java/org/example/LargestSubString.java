package org.example;

public class LargestSubString {
    public String getLargestSubString(String s){
        int finalCount=0;
        String finalString ="";
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length;i++) {
           String k = s.substring(i,i+1);
            if(s.substring(i+1).contains(k)){
                char[] tempString = s.substring(i+1).toCharArray();
                int count = 0;
                String  resultString = "";
                for (int j = 0; j < tempString.length; j++) {

                    if(tempString[j]!=tempString[tempString.length-j-1]){
                        count=0;
                        resultString="";
                        continue;
                    }
                    else {
                        count++;
                        resultString = resultString+ tempString[i];
                    }
                }
                if(count>finalCount){
                    finalString = resultString;
                }
               return finalString;
            }


        }
        return finalString;
    }
}
