/*input: sracklearnkcars
output:YES
input: srackkcars
output: NO
input: krcsarraecksad
output: YES
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[100];
    scanf("%s",s);
    int alp[128]={0};
    for(int i=0;i<strlen(s);i++){
        alp[s[i]]++;
    }
    int p=0;
    if(strlen(s)<=10){
        printf("NO");
    }else{
        for(int i=0;i<strlen(s);i++){
            if(s[i]=='s'||s[i]=='r'||s[i]=='a'||s[i]=='c'||s[i]=='k'){
                if(alp[s[i]]>=2){
                    p=1;
                }else{
                    printf("NO");
                    return 0;
                }
            }
        }
        printf("YES");
    }
}