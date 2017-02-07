/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */
import java.util.ArrayList;

public class Player {
    
    public ArrayList<Card> hand = new ArrayList();
    
    void drawIn(Card card){
        hand.add(card);
    }
    
    void drawIn( int cardNo, Card card){
        hand.add(cardNo, card);
    }
    
    void displayHand(){
        for(int i=0; i<hand.size(); i++){
            System.out.print((i+1) + ":"); System.out.println(hand.get(i));
        }
    }
    
    int judgeNumber(int no){
        return hand.get(no).getNumber();
    }
    
    int judgeSuit(int no){
        return hand.get(no).getSuit();
    }
    
    
}
