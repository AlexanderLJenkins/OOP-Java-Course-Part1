
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double economicalPrice = 2.50;
        
        if (cashGiven >= economicalPrice) {
            // Sold the lunch, add cash to register, add lunch sold, return change
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
            
        } else {
            // Not enough money given, display cash due
            return cashGiven;
            
        }
        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetPrice = 4.00;
        
        if (cashGiven >= gourmetPrice) {
            // Sold the lunch, add cash to register, add lunch sold, return change
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
            
        } else {
            // Not enough money given, display cash due
            return cashGiven;
            
        }
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double economicalPrice = 2.50;
        boolean successfulTransfer = card.pay(economicalPrice);
        
        if (successfulTransfer) {
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        double gourmetPrice = 4.00;
        boolean successfulTransfer = card.pay(gourmetPrice);
        
        if (successfulTransfer) {
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        // take cash from user and upload money to their card
        
        if (sum < 0) {
            // cannot load negative money to card
            return;
        } 
        
        // Put user's money in the cash register and add amount to their card
        this.cashInRegister += sum;
        card.loadMoney(sum);
        
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
