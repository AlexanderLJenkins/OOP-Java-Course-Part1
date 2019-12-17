/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Jenkins
 */
public class Counter {
    
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        
        if (check && startingValue < 0) {
            this.value = 0;
            this.check = check;
        } else {
            this.check = check;
            this.value = startingValue;
        }
    }
    
    public Counter(int startingValue) {
        // check is off is not given
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        // starts at 0
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int increaseAmount) {
        // increase the amount by parameter, unless parameter < 0
        
        if (increaseAmount < 0) {
            return;
        }
        this.value += increaseAmount;
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        
        if (decreaseAmount < 0) {
            return;
        }
        
        if (!this.check) {
            // check if off, can have values < 0
            this.value -= decreaseAmount;
        } else {
            // check is on, can't have values < 0
            this.value -= decreaseAmount;
            if (this.value < 0) {
                this.value = 0;
            }
        }
        
    }
    
    
    
}
