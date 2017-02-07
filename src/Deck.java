/**
 *
 * @author c16312
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Deck  extends Stack<Card>{
    
    Deck(){
        
    }
    /*
    シャッフル
    */
    
    void shuffle(){
        Collections.shuffle(this);
    }
    
}
