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
    for (int count = 17; count <= 73; count++)
    {
      System.out.print(count + " ");
      if (count % 11 == 0)
      {
        System.out.println();
      }
    }
  }
}
