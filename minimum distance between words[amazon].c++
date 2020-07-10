/*input:
the brown quick frog quick the
the
quick
output:
1
*/

#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    char s[50][50],a[20],b[20];
    int i=0,min=100,max=0,l=0,i1[50],i2[50];
    while(scanf("%s ",s[i])>0){
        i++;    
    }
    strcpy(a,s[i-2]);
    strcpy(b,s[i-1]);
    i-=2;
    for(int k=0;k<i;k++){
        if(strcmp(a,s[k])==0){
            i1[l++]=k;
        }else if(strcmp(b,s[k])==0){
            i2[max++]=k;
        }
    }
    if(max==0){
        printf("%d",l-2);
    }else{
        for(int j=0;j<l;j++){
            for(int z=0;z<max;z++){
                signed int d=i1[j]-i2[z];
                if(d<0){
                    d=0-d;
                }
                if(d<min){
                    min=d;
                }
            }
        }
        printf("%d",min);
    }
}