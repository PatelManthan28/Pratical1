public class p5
{
     p5(String a, String b)
   {
       int cnt = 0;
       String a1 = "xacazz";
       String a2 ="xxbazz";

       for (int i=0;i<(a.length())-1;i++)
       {
           if(i<(a.length())-2)
           {
               a1 = a.substring(i,i+2);
               a2 = a.substring(i,i+2);
           }
           else
           {
               a1 = a1.substring(i);
               a2 = a2.substring(i);
           }
           if(a1.equals(a2))
           {
               cnt++;
           }
       }
       System.out.println("String match(\""+a1+"\",\""+a2+"\")"+cnt);


   }
}
