/*input: 23 3
output: 7
expla: the binary rep of 23 is 10111
the decimal equivalent of last 3 bits is 7 (111)2.
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,x;
    scanf("%d %d",&n,&x);
    printf("%d",n&((1<<x)-1));
}
