/*input: 4 3
x e a
i f l 
h z b
z j e
output:
a
i
e
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m;
    scanf("%d %d",&n,&m);
    char a[n][m],s[2];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            scanf("%s",s);
            a[i][j]=s[0];
        }
    }
    for(int i=0;i<n;i++){
        for(int j=m-1;j>=0;j--){
            if(a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='i'||a[i][j]=='o'||a[i][j]=='u'){
                printf("%c\n",a[i][j]);
                break;
            }
        }
    }
}