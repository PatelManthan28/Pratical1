import java.util.Scanner;

public class p3main
{
    public static void main(String[] args) {
        p3 a = new p3();
        int s,d;
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        s=sc.nextInt();
        d=sc.nextInt();
        System.out.printf("Last Digit(%d,%d)",s,d);
        a.result();
        System.out.println("Program done by 21CE098 MANTHAN PATEl");
    }
}
