package com.google.challenges; 



public class Answer {   

    public static String answer(String s) { 



        // Your code goes here.

        //ArrayList <Char> a = new ArrayList <Char> ();

        //String a = "zyxwvutsrqponmlkjihgfedcba";

        //String b = "abcdefghijklmnopqrstuvwxyz";

        //String ans = "";

        

        //char[] c1 = a.toCharArray();

        //char[] c2 = b.toCharArray();

        char[] d = s.toCharArray();

        

        

        

        //for (int i=0; i<d.getLength(); i++) {

        //    char now = d[i];

        //    for (int j=0; j<26; j++){

        //        if (now == c1[j]){

        //            ans.append(c2[j]);

        //        }

        //    }

        //}

        

        StringBuilder sb = new StringBuilder();

        for (char c: d) {

            if (c>='a' && c<='z'){

                c= (char)((int)('z'-c+'a'));

            }

            sb.append(c);

        }

        

        return sb.toString();

        



    } 

}
