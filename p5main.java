import java.util.Scanner;

public class p5main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String a1= sc.nextLine();
        System.out.println("Enter 2nd String:");
        String a2 = sc.nextLine();
        p5 s = new p5(a1,a2);
        sc.close();


    }
}
