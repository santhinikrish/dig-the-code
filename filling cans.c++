/*input: 5 2 3
output: 2
explanation: here x=5, y=2
step 1: pour 5 liters of liquid into 5 liter can
step 2: pour 2 liters from 5 liter can into 2 liter can.
now the 5 liter can will have 3 liters which is z. hence 2 steps are required
*/


#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int a,b,c,s=0;
    cin>>a>>b>>c;
    if((c>a && c>b)||(c%2!=0 && a%2==0)||(abs(a-b)<c)){
        cout<<"-1";
    }else{
        while(abs(a-b)>=c){
            s=s+1;
            a=abs(a-b);
            if(a==c){
                break;
            }
        }
        cout<<s*2;
    }
}
