#include<stdio.h>

// int insertion(int temp[] ,int n)
// {
//     for(int j=5;j>=n;--j)
//         arr[j+1]=arr[j];
//     for(int i=0;i<5;i++)
//         printf("%d ",arr[i]);
//}

int main()
{
    int arr[]={1,2,3,4,5};
    int j=3;
    while(j<3)
    {
        arr[j]=arr[j-1];
        j++;
    }
    for(int i=0;i<4;i++)
        printf("%d ",arr[i]);
}