

import java.util.Random;
 import java.util.Scanner;


public class Craps {



public static int point=0;//To hold the pont of the game.
public static Random dice1= new Random();//To hold random number of first dice.
public static Random dice2=new Random();//To hold random number of second dice.
public static int total;
public static boolean keepRolling;


///////////////////////////////////////////////////

//Create a method for rolling.
public static int rollDice()
{   int dice1Value,dice2Vlue;
    dice1Value = dice1.nextInt(6)+1;
    dice2Vlue = dice2.nextInt(6)+1;
    total = dice1Value+dice2Vlue;
    //total=7; this is for test of random number generation and test of function.

return total;// Add return command, because this method is not void.
}

///////////////////////////////////////////////////

//create a method(function) for first round of the game.
public static void FirstRoll()
{


do{
    total=rollDice();
//Switch used to define loser or winner.
switch(total){
    case 2:
    case 3:
    case 12:
   
   
    break;

    case 7:
    case 11:

   
    break;

    default:
    point=total;
    break;

}
}
while(point==0);
}

////////////////////////////////////////////////////
//Create seperate function for second roll and keep rollin.
public static void Play()

{
    
    boolean keepRolling=true;
    do{

         
        
            do{
                total=rollDice();
                if (total==7){
                    System.out.println(total+"\t" +"\tLost with 7");

                   
                    return;//finish of rolling
                }
                
                else if(total==point){
                    System.out.println(total+"\t" +"\tMade point, Won"); 
                    
                  
                    return;
                }
                else{
                    System.out.println(total+"\t" +"\tNo Help");
                }
            }while(point!=total);
            
            }while(keepRolling==true);
      
}


    public static void main(String[] args) {
       char Choice;//Declare Choice to hold the answer of player to continue game.
       Scanner console =new Scanner(System.in);
       do{
      
        
        
        System.out.println("\nGAME OF CRAPS!\n");
        System.out.println("Point: "+point+"\n");
        System.out.println("New Roll\t Outcome");
        System.out.println("------------------------");
        FirstRoll();
        Play();
        System.out.println
                    ("\nDo you want to continue again?Enter Y to play again,N to end:\n");
                    Choice= console.next().charAt(0);            
    System.out.println("\nGame of Craps!");
       System.out.println("\nImmediate win with: "+total);
       } while((Choice=='y')||(Choice=='Y')||(Choice!='n')&&(Choice!='N'));
   
       System.out.println("End of the craps Game!");
    }
}
