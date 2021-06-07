package MPE8.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex08 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("How many people? ");
        String strpeop = in.nextLine();
        System.out.print("How many pizzas do you have? ");
        String strpiz = in.nextLine();
        System.out.print("How many slices per pizza? ");
        String strsli = in.nextLine();

        //String conversion
        int peop =Integer.parseInt(strpeop);
        int piz =Integer.parseInt(strpiz);
        int sli =Integer.parseInt(strsli);

        //math
        int totsli = piz * sli;
        int persli = totsli / peop;
        int remsli = totsli % peop;

        //output string
        String outputString = (peop+" people with "+piz+" pizzas ("+totsli+" slices)\nEach person gets "+persli+" pieces of pizza.\nThere are "+remsli+" leftover pieces.");

        //output
        System.out.println(outputString);
    }
    //main method end
}
//class end
