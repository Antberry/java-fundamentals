import java.time.LocalDateTime;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


    flipNHeads(1);
    flipNHeads(3);


    clock(); 

  }

  public static String pluralize(String inputWord, int number){
    if(number == 0 || number > 1){
      return inputWord + "s";
    } else {
      return inputWord;
    }
  }
  
  public static void flipNHeads(int number){
 
    int heads = 0;
    int flips = 0;

    while(heads < number){
      double rand = Math.random();
      if(rand <= .49){
        flips++;
        System.out.println("tails");
        heads = 0;
      } else if(rand >= .50){
        flips++;
        heads++;
        System.out.println("heads") ;
      }
    }
   System.out.println("It took " + flips + " flips to flip " + heads + " heads in a row.");

  }

  public static void clock (){
    int prevSec = 0;
    while(true){
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
  
    if(second != prevSec ){
      System.out.println(hour + ":" + minute + ":" + second);
      prevSec = second;
    }
  }
  

    
  }

}