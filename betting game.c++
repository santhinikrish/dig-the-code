/*input:
1 4 3
10
30
output:
-10
*/


#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int i=0,a[1000];
    while(scanf("%d ",&a[i])>0){
        i++;
    }
    int x=i-2,y=i-1,e=0,o=0;
    for(int j=0;j<=i-3;j++){
        if(a[j]%2==0){
            e++;
        }else if(a[j]%2!=0){
            o++;
        }
    }
    int s=(o*a[x])-(e*a[y]);
    printf("%d",s);
}
