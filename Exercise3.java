/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 3
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the quote? ");
    String quote = scanner.nextLine();

    System.out.println("Who said it? ");
    String author = scanner.nextLine();

    System.out.println(author + " says, " + "\""+ quote +"\"" );
  }
}