package day18_exception_continue;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println("Main starts..");
        try {
            System.out.println(divide(10,2));
            System.exit(1);
        }catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException-catch block..");
        }finally {
            System.out.println("In finally block..");
        }
        System.out.println("Main ends..");
    }


    public static double divide(int a,int b){
        return a/b;
    }
    public static Integer stringToInt(String str){
        return Integer.parseInt(str);
    }
    public static int stringLength(String s){
        return s.length();
    }

    public static Object[] myObjectArray(Object[] objects1){
        System.out.println("In My Object Array method..");
        Object[] object2 = new Object[4];
        for (int i=0;i< objects1.length;i++){
            object2[i] = objects1[i] +"-Hello";
            System.out.println(objects1[i]);
        }
        return objects1;
    }
}
