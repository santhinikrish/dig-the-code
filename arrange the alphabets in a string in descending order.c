#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[100];
    scanf("%s",s);
    int n[26]={0};
    for(int i=0;i<strlen(s);i++){
        n[s[i]-97]=1;
    }
    for(int i=25;i>=0;i--){
        if(n[i]==1){
            printf("%c",i+97);
        }
    }
}
