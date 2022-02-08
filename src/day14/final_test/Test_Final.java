package day14.final_test;

public final class Test_Final {
    /**
     * 1- final classes cannot be inherited
     * 2- final methods cannot be overridden
     * 3- final variables cannot be altered
     */
    void m(){
        System.out.println("In Test_Final -M()");
    }
}

class Child{



    final void m(){
        System.out.println("In Test_Final -M()");
    }

    final int i = 10;

}

class Child2 extends Child{
//    void m(){
//        System.out.println("In Test_Final -M()");
//    }

   void m1(){
    //   i =20;
   }
}
