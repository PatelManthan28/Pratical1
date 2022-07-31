import java.util.Scanner;

public class p6main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s =new String[6];
    String a1;
        System.out.println("Enter the array of string:");
        for(int i=0;i<6;i++)
        {
            s[i]=sc.next();
        }
        System.out.println("Enter the target string:");
        a1=sc.next();
        p6 b = new p6(s,a1);
        System.out.println("Program done by 21CE098 MANTHAN PATEL");
    }
}
