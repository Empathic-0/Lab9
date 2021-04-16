/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("This is construction for the first land tract: ");
    LandTract landTract1 = BuildModel(keyboard);
    System.out.println("This is construction for the second land tract: ");
    LandTract landTract2 = BuildModel(keyboard);    
    System.out.println("This is the grid display for the first land tract: ");
    displayGrid(landTract1); //landTractArray[0]
    System.out.println("This is the grid display for the second land tract: ");
    displayGrid(landTract2);
    if (landTract1.equals(landTract2)){
      System.out.println("The two tracts of land are equal.");
    } else {
      System.out.println("The two tracts of land aren't equal. ");
      System.out.println("The first tract of land has an area of: " + landTract1.getArea());
      System.out.println("The second tract of land has an area of: " + landTract2.getArea());
    }
    keyboard.close();
  }

  public static LandTract BuildModel(Scanner keyboard) {
    int width = 0;
    int length = 0;
    System.out.println("Please enter a number for the width of a land tract: ");
    while (!keyboard.hasNextInt()) {
        String input = keyboard.next();
        System.out.println("Value : " + input + " is not a valid number.");
    }
    width = keyboard.nextInt();
    System.out.println("Please enter a number for the length of a land tract: ");
    while (!keyboard.hasNextInt()) {
        String input = keyboard.next();
        System.out.println("Value : " + input + " is not a valid number.");
    }
    length = keyboard.nextInt();
    return new LandTract(length, width);
  }

  public static void displayGrid(LandTract landTract) {
    int rows = landTract.getWidth();
    int columns = landTract.getLength();
    String[][] array = new String[rows][columns];
    String result = "";
    for (int row = 0; row < rows; row++) {
      for (int cols = 0; cols < columns; cols++) {
        array[row][cols] = "*";
      }
    }
    
    for (int row = 0; row < rows; row++) {
      for (int cols = 0; cols < columns; cols++) {
        result += array[row][cols];
      }
      result += "\n";
    }
    System.out.println(result);
  }
}
