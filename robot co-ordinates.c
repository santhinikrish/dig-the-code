/*input1: x2 y1 N3 E2 S1
output: x4 y3
input2: x-2 y3 N1 W3
output: x-5 y4*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s;
    int a=0,b=0,n;
    while(scanf("%c%d ",&s,&n)>0){
        if(s=='x'||s=='E'){
            a+=n;
        }else if(s=='N'||s=='y'){
            b+=n;        
        }else if(s=='W'){
            a-=n;
        }else if(s=='S'){
            b-=n;
        }
    }
    printf("x%d y%d",a,b);
}