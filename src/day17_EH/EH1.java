package day17_EH;

public class EH1 {

    public static void main(String[] args) {
        System.out.println("Main Starts...");
        try{
            String s1 = "1234";
            Integer i = Integer.parseInt(s1);
            System.out.println(i);
        }catch (NumberFormatException numberFormatException){
            System.out.println("Invalid input.Please provide only integers");
            System.out.println(numberFormatException.getMessage());
        }finally {
            System.out.println("In finally..");
        }
        try{
            int a = 100;
            int b =0;
            System.out.println("Division of "+a +" and "+b +" ="+divide(a,b));
        }catch (ArithmeticException arithmeticException){
            System.out.println("In arithmeticException-catch block..");
        }
        System.out.println("Main ends..");
    }
    public static double divide(int a,int b){
        return a/b;
    }
}
