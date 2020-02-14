public class Reformatory {
    
    private int totalWeightsMeasured;
    
    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        // increase weight of person by 1
        person.setWeight(person.getWeight()+1);
        
    }
    
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
        
    }

}
