
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }
    
    public boolean less(Money compared) {
        // money = euros + cents
        return this.euros + this.cents/100.0 < compared.euros + compared.cents/100.0;
    }
    
    public Money minus(Money decremented) {
        
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;
        
        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }
        
        if (newEuros < 0) {
            return new Money(0, 0);
        }
        
        return new Money(newEuros, newCents);
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
