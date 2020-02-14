import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create new objects
        Scanner reader = new Scanner(System.in);
        ExamAnalysis examScores = new ExamAnalysis();
        
        inputExamScores(reader, examScores);
        examScores.printGradeDistribution();
      
    }
    
    public static void inputExamScores(Scanner userInput, ExamAnalysis exam) {
        
        System.out.println("Type exam scores, -1 completes: ");
        
        while(true) {
        
            // Get the score from the user
            int score = Integer.parseInt(userInput.nextLine());

            // Finished adding
            if (score == -1) {
                break;
            }

            // Score is unphysical
            if (score > 60 || score < 0) {
                continue;
            }

            exam.addScore(score);
        }
    }
}
