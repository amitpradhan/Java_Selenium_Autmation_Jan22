package day3;

public class StringArray {

    public static void main(String[] args) throws Exception {

        String[] stringArray= new String[4];

        for (int i =0; i<stringArray.length;i++){
            stringArray[i] = "Pune"+i;
            System.out.println(stringArray[i]);
        }
//
//        try{
//            assert false;
//            System.out.println("t");
//        }catch (Error e){
//            System.out.println("c");
//            throw new Exception();
//        }finally {
//            System.out.println("f");
//        }
    }
}
