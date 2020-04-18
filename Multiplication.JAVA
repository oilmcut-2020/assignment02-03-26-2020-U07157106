import java.util.Scanner; // program uses class Scanner



public class Multiplication

{

   public static void main(String[] args)

   {

      Scanner input = new Scanner(System.in);



      int number1; 

      int number2; 

      int mul; 



      System.out.print("Enter first integer: "); 

      number1 = input.nextInt(); 



      System.out.print("Enter second integer: "); 

      number2 = input.nextInt(); 



      mul = number1 * number2; 



      System.out.printf("Mul is %d%n", mul); 



   } 

} 