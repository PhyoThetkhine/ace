package Ch11;

public class ErrorHandling {
    public static void main (String[]args){
        try{
            int a = 100/0;
        }catch(ArithmeticException ex){
            System.out.println("Invalid Operation.Divided by zero.");


        }
    }
}
