import java.util.Scanner;

public class p9main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sudoku Solution:");
        int a1[][]=new int[9][9];
        int a2[][]=new int[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                a1[i][j]= sc.nextInt();
                a2[i][j]=a1[i][j];
            }
        }
        p9 xy = new p9();
        xy.Sudoku(a1,a2);
        System.out.println("Program done by 21CE098 MANTHAN PATEL");
    }

}
