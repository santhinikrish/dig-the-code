/*input: have a good day 4
output: have good
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1001][1001];
    int n,i=0,p=0;
    while(scanf("%s ",s[i])>0){
        i++;
    }
    int len=i;
    int a=atoi(s[len-1]);
    for(int j=0;j<len-1;j++){
        if(strlen(s[j])==a){
            printf("%s ",s[j]);
            p=1;
        }
    }
    if(p==0){
        printf("-1");
    }
}