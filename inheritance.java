class twoDbox
{
    int l,b;
    int area(int l,int b)
    {
        return(l*b);
    }
}

class threeDbox extends twoDbox
{
    int h;
    int volume(int l,int b,int h)
    {
        int v=l*b*h;
        return v;
    }
}

public class inheritance
{
    public static void main(String args[])
    {
        threeDbox t=new threeDbox();
        int vlume=t.volume(3,4,5);
        System.out.println(vlume);
        int e=t.area(5,6);
        System.out.println(e);
    }
    
}

