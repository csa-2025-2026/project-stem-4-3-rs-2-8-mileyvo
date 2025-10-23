import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1
    for (int count = 1; count <= 25; count += 2)
    {
      System.out.println(count);
    }

    // Problem 2
    int counter = 1;
    for (int count = 17; count <= 73; count++)
    {
      System.out.print(count + " ");

      if (count == 10)
      {
        System.out.println();
        counter = 0;
      }
      counter++;
    }

    // Problem 3
    int userInput = 23;
    for (int i = userInput; i <= 50; i++)
    {
      System.out.print(i + " ");
      if (counter == 5)
      {
        System.out.println();
        counter = 0;
      }
      counter++;
    }

    // Problem 4


  }
}
