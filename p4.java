import java.util.Scanner;

public class p4 {
    Scanner sc = new Scanner(System.in);
    p4(){}
    p4(int q)
    {
        int a[] = new int[q];
        System.out.println("Enter your array:");
        for(int i=0;i<q;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=0;
        for(int i=0;i<q-2;i++)
        {
            if(a[i] == 1 && a[i+1] == 2 && a[i+2]==3)
            {
                b++;
            }
        }
        System.out.println("Your Array:");
        for (int i=0;i<q;i++)
        {
            System.out.println(a[i]);
            System.out.print("");
        }
        System.out.println("Sequence of no.1,2,3 appearsin the array is:");
        if(b==0)
        {
            System.out.println("false");
        }
        else
            System.out.println(true);
    }

}
