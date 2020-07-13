/*input: 5 3
9:30
9:30 9:38 9:31 9:32 9:31
output: yes
*/

#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    int n,x,c=0;
    cin>>n>>x;
    int hh,mm,h,m;
    scanf("%d:%d",&h,&m);
    while(scanf("%d:%d",&hh,&mm)>0){
        if((hh==h && mm<=m)||hh<h){
            c++;
        }
    }
    if(c<x){
        cout<<"Yes";
    }else{
        cout<<"No";
    }
}