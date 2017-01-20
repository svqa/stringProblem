package com.apple.ReplaceString;
public class ReplaceString{

 public static String removeChar(String s, char c) 
     {
         if (s == null)
            return null;
         String newstring = "";
       for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != c) {   
             newstring += s.charAt(i);
                                          }
                 }
           return newstring;
      }

 public static String removeCharMethod(String st, char ch) {
             if (st == null)
            return null;
           return st.replaceAll(String.valueOf(ch),""); 
   }

}
}