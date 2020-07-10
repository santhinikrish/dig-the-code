/*input: 5
g w w t e
h d e o p
z d h e w
x i h e a
h o o d e
output:
h o o d e
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    char a[n][n];
    int max=0,maxin=0;
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++){
            scanf("%c ",&a[i][j]);
            switch(tolower(a[i][j])){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    c++;
            }
        }
        if(c>=max){
            max=c;
            maxin=i;
        }
    }
    for(int j=0;j<n;j++){
        printf("%c ",a[maxin][j]);
    }
}
