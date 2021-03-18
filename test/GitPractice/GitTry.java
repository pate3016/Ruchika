/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GitPractice;

import java.util.Scanner;

/**
 *
 * @author Damini
 */
public class GitTry {
    Seasons season;
    private boolean abc=true;
    public enum Seasons{
        FALL,
        WINTER,
        SPRING,
        SUMMER
    }
    //a constructor
    public GitTry(Seasons season)
    {
        this.season = season;
    }
    
    public boolean isSeason(){
        String myStr = null;
               if(Seasons.valueOf(myStr).equals(Seasons.values())){
                        return true;
               }else{
                   return false;
               }
        }
   
    public void seasonDescription()
    {
       switch (season){
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
     }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // try to get the input (myStr) from the user
        Scanner input = new Scanner(System.in);
        String myStr = input.nextLine();
        GitTry test1= new GitTry(Seasons.valueOf(myStr));
        test1.seasonDescription();
        test1.isSeason();
        //a for loop that iterated thru the Seasons Enum using values() method
        for (Seasons mySeason: Seasons.values())
        {
            
            System.out.println(mySeason);
        }
       
        }
}
