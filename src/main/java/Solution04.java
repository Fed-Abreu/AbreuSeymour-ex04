import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution04 {
    /*
    print "Enter a noun: "
        Add Scanner String noun = input
    print "Enter a verb: "
        Scan String verb = input
     print "Enter an adjective: "
        Scan String adjective = input
    print "Enter an adverb: "
        Scan String adverb = input
    printf "Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb ;
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
            String noun = input.nextLine();
        System.out.print("Enter a verb: ");
            String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
            String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
            String adverb = input.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);


    }
}
