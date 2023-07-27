// import java.util.*;

public class Sb {
    public static void main(String args[]) {
        // StringBuilder sb = new StringBuilder("Tony"); //* 
        // System.out.println(sb);

        // char at 0
        // System.out.println(sb.charAt(0));

        // set char at index
        // sb.setCharAt(0,'S');
        // System.out.println(sb);

        // insert
        // sb.insert(0, 'S');
        // sb.insert(2, 'n');  //*
        // System.out.println(sb);

        // delete
        // sb.delete(2, 4);  //*
        // System.out.println(sb);

        // append
        // StringBuilder sb = new StringBuilder("h");
        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb);
    
        // reverse String
        StringBuilder reverse = new StringBuilder("Test");
        for (int i = 0; i <= reverse.length()/2; i++){
            int front = i;
            int back = reverse.length() - 1 - i;

            char frontChar = reverse.charAt(front);
            char backChar = reverse.charAt(back);

            reverse.setCharAt(front, backChar);
            reverse.setCharAt(back, frontChar);

        }
        System.out.println(reverse);
    }
}
