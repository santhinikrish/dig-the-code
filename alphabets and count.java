/*
The program must accept a string S containing only lower case alphabets as the input.
The program must sort and print the alphabets in S along with their frequency as the output.
Please fill in the blanks with code so that the program runs successfully.

Boundary Condition(s):
1 <= Length of S <= 100

Input Format:
The first line contains S.

Output Format:
The lines, each containing an alphabet and an integer separated by a space.

Example Input/Output 1:
Input:
sneezing
Output:
e 2
g 1
i 1
n 2
s 1
z 1

Example Input/Output 2:
Input:
communism
Output:
c 1
i 1
m 3
n 1
o 1
s 1
u 1
*/

import java.util.*;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Map<Character, Integer> alphaFrequencyMap = null;
    alphaFrequencyMap = new TreeMap<>();
    for (Character ch : str.toCharArray())
    {
      int count = alphaFrequencyMap.getOrDefault(ch, 0);
      alphaFrequencyMap.put(ch, count + 1);
    }
    for (Map.Entry entry : alphaFrequencyMap.entrySet())
    {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
