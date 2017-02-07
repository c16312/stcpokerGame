
public class PokerRule{
    
   
    void judge(int[] suit, int[] number){
        int numberJudge=0; /* 役の判定用変数 */
                
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(number[i] == number[j]) numberJudge++;
            }
        }
        
        if(numberJudge == 1) System.out.println("ワンペア");
        if(numberJudge == 2) System.out.println("ツーペア");
        if(numberJudge == 3) System.out.println("スリーカード");
        if(numberJudge == 4) System.out.println("フルハウス");
        if(numberJudge == 6) System.out.println("フォーカード");
        if(suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3] && suit[0] == suit[4]){
            System.out.println("ストレートフラッシュ");
        }
    }
    
    
}
