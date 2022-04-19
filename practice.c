#include<stdio.h>
void swap(int *x,int *y)
{
    int temp=*x;
    *x=*y;
    *y=temp;
}  

void selection(int ray[],int n)
{
    
    for(int i=0;i<n;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {    
            if(ray[min]>ray[j])
                min=j;
        }
        swap(&ray[i],&ray[min]);
    }
    
    for(int k=0;k<n;k++)
        printf("%d ",ray[k]);

}

void bubble(int ray[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(ray[i]>ray[j])
            swap(&ray[i],&ray[j]);
        }
    }
    for(int k=0;k<n;k++)
        printf("%d ",ray[k]);
}

int main()
{
    int arr[5]={23,21,34,52,1};
    selection(arr,5);
    bubble(arr,5);
    

}