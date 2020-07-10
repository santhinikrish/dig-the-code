#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,sum=0,t,d;
    scanf("%d\n",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d\n",&a[i]);
        if(a[i]>400 && a[i]<=500){
            t=a[i]*20/100;
            d=a[i]-t;
            sum+=d;
        }else if(a[i]>500 && a[i]<1000){
            t=a[i]*25/100;
            d=a[i]-t;
            sum+=d;
        }else if(a[i]>=1000){
            t=a[i]*50/100;
            d=a[i]-t;
            sum+=d;
        }else{
            sum+=a[i];
        }
    }
    if(sum>2000){
        printf("%.2f",(float)sum-100.0);
    }else{
        printf("%.2f",(float)sum);
    }
}
