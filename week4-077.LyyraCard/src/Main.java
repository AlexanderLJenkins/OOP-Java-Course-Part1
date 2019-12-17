
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard pekkaCard = new LyyraCard(20.0);
        LyyraCard brianCard = new LyyraCard(30.0);
        
        pekkaCard.payGourmet();
        brianCard.payEconomical();
        
        System.out.print("Pekka: ");
        System.out.println(pekkaCard);
        System.out.print("Brian: ");
        System.out.println(brianCard);
        
        pekkaCard.loadMoney(20.0);
        brianCard.payGourmet();
        
        System.out.print("Pekka: ");
        System.out.println(pekkaCard);
        System.out.print("Brian: ");
        System.out.println(brianCard);
        
        pekkaCard.payEconomical();
        pekkaCard.payEconomical();
        
        brianCard.loadMoney(50);
        
        System.out.print("Pekka: ");
        System.out.println(pekkaCard);
        System.out.print("Brian: ");
        System.out.println(brianCard);
        
        
        
        
    }
}
