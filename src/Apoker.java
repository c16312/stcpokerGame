/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author c16312
 */
public class Apoker {
    static Deck cards;      //トランプ
    static Table table;     //テーブル
    static PokerRule pokerRule;
    static Player humanPlayer;   //プレーヤー
    static Player computerPlayer;
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        humanPlayer = new HumanPlayer("プレーヤー",100);
        computerPlayer = new ComputerPlayer("コンピューター",100);
        pokerRule = new PokerRule();
        int[] suitNumber = new int[5];
        int[] cardNumber = new int[5];
        
        while(true){
            cards = Cards.newCards();   //新しいトランプの準備
            cards.shuffle();            //トランプをシャッフル
            dealCards();                //プレーヤーにカードを配る
            
            humanPlayer.displayHand();      //手札の表示
            //conputerPlayer.displayHand();
            
            System.out.print("手札を交換しますか?(y/n)>>"); String yn = stdIn.next();
            if(yn.equals("y")){
                int choice;
                
                for(int i=0; i<5; i++){
                    System.out.print((i + 1) + "番のカードを捨てますか？(y...1 /n... 0)>>"); choice = stdIn.nextInt();
                    
                    if(choice==1){
                        humanPlayer.hand.add(i, cards.pop());
                        humanPlayer.hand.remove(i+1);
                    }
                }             
            }
            
            pokerRule.getNumber();
            
            humanPlayer.displayHand();
            
            for(int i=0; i<5; i++){
                    suitNumber[i]= humanPlayer.judgeSuit(i);
                    cardNumber[i]= humanPlayer.judgeNumber(i);
            }
                /* 役があるかどうか判定 */
            pokerRule.judge(suitNumber, cardNumber);
            
            
            System.out.print("continue? (y/n)>>"); yn = stdIn.next();
            if(yn.equals("y")) humanPlayer.hand.clear();
            if(yn.equals("n")) break;
        }
    }
    
    /*
    カードを配る
    */
    
    static void dealCards(){
        for(int i=0; i<5; i++){
            humanPlayer.drawIn(cards.pop());
            computerPlayer.drawIn(cards.pop());
        }
    }
}
