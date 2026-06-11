package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
  System.out.println("Welcome to the Brain Games!");
  Cli.getName();
  }
}

class Cli {
  public static void getName() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("May I have your name? ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
    scanner.close();
  }
}