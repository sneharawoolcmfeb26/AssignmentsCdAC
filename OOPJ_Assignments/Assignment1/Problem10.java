package Assignment1;

import javax.lang.model.util.ElementScanner6;

public class Problem10 {
    public static void main(String[] args) {
        char ch = 'a';

        if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("VOWEL");
        }
        else{
            System.out.println("CONSTANT");
        }
    }
}
