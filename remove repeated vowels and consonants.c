/*input: cheNnAi
output: heni
input: continuous
output: cotinus
*/


#include<stdio.h>
#include <stdlib.h>
int isVowel(char c){
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        return 0;
    }else{
        return 1;
    }
}
int main()
{
    char s[1000];
    scanf("%s",s);
    for(int i=0;i<strlen(s);i++){
        if(i==strlen(s)-1){
            if((isVowel(s[i])==0 && isVowel(s[i-1])==1) || (isVowel(s[i]==1 && isVowel(s[i-1])==0)))
            {
                printf("%c",s[i]);
                break;
            }
        }
        if((isVowel(s[i])==0 && isVowel(s[i+1])==1)||(isVowel(s[i])==1 && isVowel(s[i+1])==0)){
            printf("%c",s[i]);
        }
    }
}