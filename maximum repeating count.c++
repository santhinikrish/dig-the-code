/*input: 1 2 3 5 9 2 9 6 9
output: 9
*/

#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int n[100],i=0;
    while(scanf("%d ",&n[i])>0){
        i++;
    }
    int c,max=0,p=0,fin;
    for(int j=0;j<i;j++){
        c=0;
        for(int k=j+1;k<i;k++){
            if(n[j]==n[k]){
                c++;
            }
        }
        if(c>max){
            max=c;
            fin=n[j];
            p=1;
        }
    }if(p==0){
        cout<<n[0];
    }else{
        cout<<fin;
    }
}
