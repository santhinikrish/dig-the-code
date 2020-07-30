/*
The program must accept a string S that contains only alphabets and print all the substring values and the count of the vowels in them.

Boundary Condition(s):
1 <= Length of S <= 100

Input Format:
The first line contains S.

Output Format:
The L*(L+1) lines contain the substring values and the count of vowels in each substring (L is the length of the string).

Example Input/Output 1:
Input: eagle
Output:
e 1
ea 2
eag 2
eagl 2
eagle 3
a 1
ag 1
agl 1
agle 2
g 0
gl 0
gle 1
l 0
le 1
e 1

Example Input/Output 2:
Input: TEA
Output:
T 0
TE 1
TEA 2
E 1
EA 2
A 1
*/

import java.util.*;
public class Hello {
    public static boolean isVowel(char s){
        s=Character.toLowerCase(s);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length;
        int vow[]=new int[l];
        int v=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                int c=0;
                String d="";
                for(int k=i;k<=j;k++){
                    d+=s[k];
                    if(isVowel(s[k])){
                        c++;
                    }
                }
                if(d.length()>0)
                System.out.println(d+" "+c);
            }
        }
	}
}


import java.util.*;
public class Hello {
    public static boolean isVowel(char s){
        s=Character.toLowerCase(s);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length;
        int vow[]=new int[l];
        int v=0;
        for(int i=0;i<l;i++){
            if(isVowel(s[i])){
                v++;
            }
            vow[i]=v;
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                int f;
                if(i==0)
                f=0;
                else
                f=vow[i-1];
                String d="";
                int c=vow[j]-f;
                for(int k=i;k<=j;k++){
                    d+=s[k];
                    System.out.print(s[k]);
                }
                if(d.length()>0)
                System.out.println(" "+c);
            }
        }
	}
}
