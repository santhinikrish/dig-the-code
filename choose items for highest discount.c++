/*input: 3
harddisk 4000 20
monitor 15000 10
laptop 30000 5
output: harddisk
*/

#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int n,d,p,min=10000;
    char s[100],fin[100];
    while(scanf("%s %d %d",s,&p,&d)>0){
        int dis=(p*d)/100;
        if(dis<min){
            min=dis;
            strcpy(fin,s);
        }
    }
    printf("%s",fin);
}
