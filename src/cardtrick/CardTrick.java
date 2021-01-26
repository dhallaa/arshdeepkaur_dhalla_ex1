/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

import java.util.Scanner;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2021
 * @author Arshdeep kaur dhalla jan 26 2021
 **/
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here Card[] hand = new Card[7];
       Card[] hand = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //generate random number between 0 to13
            int randomValue=(int)((Math.random()*13)+1);
            // random number between 0-3 here])
             int randomSuit=(int)((Math.random()*3)+1);
             card.setValue(i);
             card.setSuit(Card.SUITS[randomSuit]);
             
             hand[i]=card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // If the guess is successful, invoke the printInfo() method below
        int cardValue;
        int cardSuit;
        
        Scanner input=new Scanner(System.in);
        do{
            
            System.out.println("Enter any number from 1to 13=");
            cardValue=input.nextInt();
          }
        while(cardValue>13 || cardValue<1);
        
        do{
            
           System.out.println("Enter any number from  0to 3="
                   +"0=Hearts\n"
                   +"1=Diamonds\n"
                   +"2=spades\n"
                   +"3=clubs\n"); 
           cardSuit=input.nextInt();
          }
        while(cardSuit<0 || cardSuit>3);
    }

     // Create the card for camparison.
         Card usercard= new Card();


         usercard.setValue(cardValue);
         usercard.setSuit(Card.SUITS[cardSuit]);
         
         for(int i=0; i<hand.length;i++);
         {
         if(usercard.getSuit()==hand[i].getSuit()&&usercard.getValue() == hand[i].getvalue()){
         printInfo();
         }
         }
    
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Arsh");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- learn more everyday");
        System.out.println("-- Have a good understanding of every concept");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing badminton");
       
        System.out.println("-- Cooking");
        System.out.println("-- Listening to music");
        System.out.println();
        
        System.out.println("Music I like:");
        System.out.println("-- Pink Floyd / David Gilmore");
        System.out.println("-- Green Day");
        System.out.println("-- Many other styles and genres as well...");    
    }


    }
   
