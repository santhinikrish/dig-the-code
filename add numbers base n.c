/*iput: 3 11 201
oput: 23
expla: 11 to the base 3 is 4 and 201 to the base 3 is 19.
hence the sum is 4+19 is 23  */

#include<stdio.h>
#include <stdlib.h>
int bas;
int find(int a);
int basee(int a){
    int t,mul,n=0,i=0;
    mul=bas;
    while(a){
        t=a%10;
        if(i==0){
            n=t;
        }else{
            n+=(t*mul);
            mul*=bas;
        }
        i++;
        a/=10;
    }
    return n;
}
int main()
{
    int a,b,n=0,m=0;
    scanf("%d %d %d",&bas,&a,&b);
    n=basee(a);
    m=basee(b);
    printf("%d",n+m);
}
