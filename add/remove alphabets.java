/*
The program must accept N alphabets as the input.
For each alphabet CH among the N alphabets, the program must perform the following operations and form a stack of alphabets.
  - If CH is in upper case, the program must add CH to the top of the stack.
  - If CH is in lower case, the program must remove the alphabet from the top of the stack (if present).
Finally, the program must print all the alphabets in the stack in LIFO (Last In First Out) order.
If the stack is empty, the program must print -1 as the output.

Input Format:
The first line contains N.
The second line contains N alphabets separated by a space.

Output Format:
The first line contains the alphabet(s) separated by a space or -1.

Example Input/Output 1:
Input: 9
S K i L L r A C k
Output:
A L S

Example Input/Output 2:
Input: 4
j U n k
Output: -1
*/

import java.util.*;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Stack<Character> st = new Stack<>();
    for (int ctr = 1; ctr <= N; ctr++)
    {
      Character ch = sc.next().charAt(0);
      if (Character.isUpperCase(ch))
      {
        st.push(ch);
      }
      else
      {
        if (!st.isEmpty())
        {
          st.pop();
        }
      }
    }
    if (st.isEmpty())
    {
      System.out.print("-1");
    }
    else
    {
      while (!st.isEmpty())
      {
        System.out.print(st.pop() + " ");
      }
    }
  }
}
