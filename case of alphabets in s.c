/*input: hello
output: LOWERCASE STRING
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[50];
    scanf("%s",s);
    int l=strlen(s),c=0,c1=0;
    for(int i=0;i<l;i++){
        if(islower(s[i])){
            c++;
        }else if(isupper(s[i])){
            c1++;
        }
    }
    if(c==l){
        printf("LOWERCASE STRING");
    }else if(c1==l){
        printf("UPPERCASE STRING");
    }else{
        printf("ALPHABETS STRING");
    }
}
