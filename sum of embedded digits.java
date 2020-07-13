input:drtyh54fg2hj32
ouput:94

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp="0";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                temp+=c;
            }else{
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.print(sum+Integer.parseInt(temp));
	}
}