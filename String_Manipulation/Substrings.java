//String manipulation to get for the substring

import java.util.*;

public class Substrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=========Slicing the String==========");
        System.out.println("Enter the String");
        String S = in.next();
        System.out.println("Enter the starting slicing point");
        int start = in.nextInt();
        System.out.println("Enter the starting slicing point");
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

