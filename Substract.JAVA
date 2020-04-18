import java.util.Scanner; // program uses class Scanner



public class Substract 

{

   public static void main(String[] args)

   {

      Scanner input = new Scanner(System.in);



      int number1; 

      int number2; 

      int sub; 



      System.out.print("Enter first integer: "); 

      number1 = input.nextInt(); 



      System.out.print("Enter second integer: "); 

      number2 = input.nextInt(); 



      sub = number1 - number2; 



      System.out.printf("Sub is %d%n", sub); 



   } 

} 