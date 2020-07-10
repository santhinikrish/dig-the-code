/*input:14*3=17
output: +

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,c;
    char x,y;
    scanf("%d%c%d%c%d",&a,&x,&b,&y,&c);
    if(a+b==c){
        printf("+");
    }else if(a-b==c){
        printf("-");
    }else if(a*b==c){
        printf("*");
    }else if(a/b==c){
        printf("/");
    }
}
