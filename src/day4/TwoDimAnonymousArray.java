package day4;

public class TwoDimAnonymousArray {

    public static void main(String[] args) {

        objectTwoDimArr(new Integer[][]{{12,12},{10,11},{22,22}});

        objectTwoDimArr(new String[][]{{"Selenium","Java"}, {"Selenium","Python"}, {"Selenium","C#"}});


    }

    public static void objectTwoDimArr(Object[][] objArr){
        for (int i =0;i< objArr.length;i++){
            for(int j =0; j<objArr[i].length;j++){
                System.out.print(objArr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
