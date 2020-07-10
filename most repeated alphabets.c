/*input: trekkent breeeeeeeeeeeze
output: trekkent
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s1[100],s2[100];
    scanf("%s\n%s",s1,s2);
    char c1[128]={0},c2[128]={0};
    int l1=strlen(s1),l2=strlen(s2);
    int r1=0,r2=0;
    for(int i=0;i<l1;i++){
        c1[s1[i]]++;
        if(c1[s1[i]]==2){
            r1++;
        }
    }
    for(int i=0;i<l2;i++){
        c2[s2[i]]++;
        if(c2[s2[i]]==2){
            r2++;
        }
    }
    if(r1>r2){
        printf("%s",s1);
    }else if(r2>r1){
        printf("%s",s2);
    }else{
        printf("%s %s",s1,s2);
    }
}
