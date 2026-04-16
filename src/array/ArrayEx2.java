package array;

public class ArrayEx2 {
    public void arrayExDemo1(int[][] x){
        //x[0][0]=100;
    }
    public void print(int [][]m){
        for (int i = 0; i <m.length ; i++) {//행
            for (int j = 0; j < m[i].length; j++) {//열
                System.out.printf("%5d",m[i][j]);//열
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayEx2 a=new ArrayEx2();
        int [][]m={
                {10,20,30,0},
                {40,50,60,0},
                {70,80,90,0},
                {0,0,0,0}
        };
        a.print(m);
        a.arrayExDemo1(m);
        a.print(m);



    }
}
