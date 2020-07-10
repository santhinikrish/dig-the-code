/*input: 
5 10 15
6
output:
30
input:
1 4 7
5
output:
13
*/

#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    int x,y,z,m;
    cin>>x>>y>>z>>m;
    int d=y-x,i=3,ans=0;
    while(i<m){
        ans+=d;
        i++;
    }
    cout<<ans+z;
}