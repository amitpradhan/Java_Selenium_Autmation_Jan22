package day14.mutliple_inheritance;

public interface I1 {
     void m();
}

interface I2{
    int m(int i,int j);
    int m(int i);
}

interface I3 extends I1, I2{

}
