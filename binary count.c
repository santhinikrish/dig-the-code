// input: 2 3   output: 25   expla: binary count


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int ze,on;
    scanf("%d %d",&ze,&on);
    int a[100],i,res=0,p=0,c1=0,c2=0,n,j;
    for(n=1;;n++){
        for(i=0;n!=0;i++){
            a[i]=n%2;
            n/=2;
        }
        for(j=i-1;j>=0;j--){
            if(a[j]==0){
                c1++;
            }else if(a[j]==1){
                c2++;
            }
        }
        if(c1==ze && c2==on){
            res++;
            //p=1;

        }
        if(res==1){
            printf("%d",n);
            return 0;
        }}
    if(on==0){
        printf("-1");
    }
}
