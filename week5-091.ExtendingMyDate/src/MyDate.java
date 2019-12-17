
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.day = 1;
            this.month++;
        }
        
        if (this.month > 12) {
            this.month = 1;
            this.year++;
        }
    }
    
    public void advance(int numberOfDays) {
        
        while(numberOfDays>0) {
            advance();
            numberOfDays--;
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        // Clone the current date, and return a new date
        
        MyDate clonedDate = new MyDate(this.day, this.month, this.year);
        clonedDate.advance(days);
        return clonedDate;
    }

}
