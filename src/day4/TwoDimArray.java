package day4;

public class TwoDimArray {

    public static void main(String[] args) {
        //4-row .3-cols
        int[][] twoDimArray = new int[4][3];

        //assign values
        //1st-row
        twoDimArray[0][0] = 10;
        twoDimArray[0][1] = 12;
        twoDimArray[0][2] = 15;
        //2nd-row
        twoDimArray[1][0] = 20;
        twoDimArray[1][1] = 22;
        twoDimArray[1][2] = 25;
        //3rd-row
        twoDimArray[2][0] = 30;
        twoDimArray[2][1] = 33;
        twoDimArray[2][2] = 36;
        //4th row
        twoDimArray[3][0] = 40;
        twoDimArray[3][1] = 43;
        twoDimArray[3][2] = 46;

        System.out.println("No of rows in the array ->"+twoDimArray.length);//4
        System.out.println("No of columns in the array ->"+twoDimArray[0].length);//3

        //outer for loop -> rows
        for (int i =0; i<twoDimArray.length;i++) {
            //inner for loop represents cols
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "  ");
            }
            System.out.println();
        }



    }
}
