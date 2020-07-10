/*input: management
output: 3
input: triangle
output: 1
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    int l=strlen(s);
    int m=0,fin=1;
    for(int i=0;i<l;i++){
        for(int j=i+1;j<l;j++){
            int count=0;
            if(s[i]==s[j]){
                for(int k=i,l=j;k<=j,l>=i;k++,l--){
                    if(s[k]==s[l]){
                        count++;
                    }
                }
                if(count==(j-i)+1){
                    fin=count;
                }
            }
        }
        if(fin>m){
            m=fin;
        }
    }
    printf("%d",m);
}
