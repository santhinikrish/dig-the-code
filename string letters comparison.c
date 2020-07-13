#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s1[100],s2[100];
    scanf("%s\n%s",s1,s2);
    int l1=strlen(s1),l2=strlen(s2),count=0;
    for(int i=0;i<l1;i++){
        for(int j=i+1;j<l1;j++){
            if(s1[i]==s1[j]){
                s1[j]='\0';
            }
        }
    }
    for(int i=0;i<l2;i++){
        for(int j=i+1;j<l2;j++){
            if(s2[i]==s2[j]){
                s2[j]='\0';
            }
        }
    }
    for(int i=0;i<l1;i++){
        for(int j=0;j<l2;j++){
            if(s1[i]==s2[j]){
                count++;
            }
        }
    }
    if(count==l1||count==l2){
        printf("YES");
    }else{
        printf("NO");
    }
}