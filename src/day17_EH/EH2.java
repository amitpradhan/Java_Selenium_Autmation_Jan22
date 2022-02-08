package day17_EH;

public class EH2 {
    public static void main(String[] args) {
        System.out.println("Main starts..");

        try {
            System.out.println(divide(10,2));
            System.out.println(stringToInt("1234"));
            System.out.println(stringLength("null"));

            Object[] objects = {"Hi", "1234", true, "2.3d", 1234};
            myObjectArray(objects);

        }catch (ArithmeticException arithmeticException){
            System.out.println("In arithmeticException-catch..");
        }catch (NumberFormatException numberFormatException){
            System.out.println("In numberFormatException-catch..");
        }catch (NullPointerException nullPointerException){
            System.out.println("In nullPointerException catch");
//        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
//            System.out.println("arrayIndexOutOfBoundsException-catch");
        }catch (RuntimeException exception){
            exception.printStackTrace();
            System.out.println("In RuntimeException catch block..");
        }
        catch (Exception exception){
            exception.printStackTrace();
            System.out.println("In Exception catch block..");
        }
        finally {
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
