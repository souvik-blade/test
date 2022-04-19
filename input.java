import java.util.*;
public class input 
{
    static int[] swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        return 
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]={2,5,1,7};
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;}
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
    }
}
