public class p3
{
    public int p,q;
    p3()
    {
    }
    p3(int x,int y)
    {
        p=x;
        q=y;
        p= p%10;
        q=q%10;
    }
    void result()
    {
        if(p==q)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
