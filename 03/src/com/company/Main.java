package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("What's that one quote");
        Scanner input = new Scanner (System.in);
        String quote = input.nextLine();
        System.out.print("Who said that one quote");
        Scanner otherinput = new Scanner (System.in);
        String author = otherinput.nextLine();
        System.out.println(author + " says \"" +quote+ "\"" );
    }
}