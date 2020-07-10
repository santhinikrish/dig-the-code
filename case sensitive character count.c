/*input: Apple
output: A1 e1 l1 p2
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[100];
    scanf("%s",s);
    int l=strlen(s);
    int c[128]={0};
    for(int i=0;i<l;i++){
        c[s[i]]++;
    }
    for(int i=0;i<128;i++){
        if(c[i]>0){
            printf("%c%d ",i,c[i]);
        }
    }
}
