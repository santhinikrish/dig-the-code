#include <stdlib.h>

int main()
{
    int n,j;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("%d ",a[0]);
    for(int i=1;i<n;i++){
        int min=a[i];
        j=i-1;
        while(j>=0){
            if(a[j]<min){
                min=a[j];
            }
            j--;
        }
        a[i]=min;
        printf("%d ",a[i]);
    }
}