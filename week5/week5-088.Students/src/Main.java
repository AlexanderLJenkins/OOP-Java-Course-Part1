
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        // Ask for student information from the user
        while(true) {

            System.out.print("name: ");
            String name = reader.nextLine();
            
            if (name.isEmpty()) {
                // Finished adding
                break;
            }
            
            // Add student information to the list
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        
         
        // Print student information
        System.out.println("");
        for (Student stu : list) {
            System.out.println(stu);
        }
        
        // Search student names for a search term
        System.out.println("");
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        
        for (Student stu : list) {
            System.out.println("Result: ");
            if (stu.getName().contains(searchTerm)) {
                System.out.println(stu);
            } 
        }
        
    }
}
