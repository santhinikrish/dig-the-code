/*input: consider a integer
output: cr aa ir
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    while(scanf("%s ",s)>0){
        for(int i=0;i<strlen(s);i++){
            if(strlen(s)==1){
                printf("%c%c",s[i],s[i]);
            }else{
            	if(i==0 || i==strlen(s)-1){
                	printf("%c",s[i]);
            	}
	    }
        }
        printf(" ");
    }
}
