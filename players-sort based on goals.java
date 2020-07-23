/*
Example Input/Output 1:
Input: 3
Pele 9
Messi 5
Maradona 9
Output:
Messi 5
Maradona 9
Pele 9

Example Input/Output 2:
Input: 6
Romario 5
Puskas 3
Ronaldo 4
Eusebio 3
Bican 3
Ibrahimovic 4
Output:
Bican 3
Eusebio 3
Puskas 3
Ibrahimovic 4
Ronaldo 4
Romario 5
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Player implements Comparable<Player>{
    private String name;
    private int g;
    public int compareTo(Player other){
        if(this.g==other.getGoals()){
            return this.name.compareTo(other.getName());
        }
        return this.g-other.getGoals();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getGoals(){
        return g;
    }
    public void setGoals(int g){
        this.g=g;
    }
}
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Player> playerList = new ArrayList<>();
    for (int ctr = 1; ctr <= N; ctr++)
    {
      String[] inpVal = sc.nextLine().split(" ");
      Player p = new Player(); p.setName(inpVal[0]);
      p.setGoals(Integer.parseInt(inpVal[1]));
      playerList.add(p);
    }
    Collections.sort(playerList);
    for (Player p : playerList)
    {
      System.out.println(p.getName() + " " + p.getGoals());
    }
  }
}
