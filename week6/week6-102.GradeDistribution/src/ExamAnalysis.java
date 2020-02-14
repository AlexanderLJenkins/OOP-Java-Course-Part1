
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Jenkins
 */
public class ExamAnalysis {
    
    private ArrayList<Integer> examScores;
    private int[] gradeDistribution = {0, 0, 0, 0, 0, 0};

    public ExamAnalysis() {
        examScores = new ArrayList<Integer>();
    }
    
    public void addScore(int score) {
        examScores.add(score);
        
        if (score <= 29) {
            gradeDistribution[0] += 1;
        } else if (score <= 34) {
            gradeDistribution[1] += 1;
        } else if (score <= 39) {
            gradeDistribution[2] += 1;
        } else if (score <= 44) {
            gradeDistribution[3] += 1;
        } else if (score <= 49) {
            gradeDistribution[4] += 1;
        } else if (score <= 60) {
            gradeDistribution[5] += 1;
        }
    }
    
    public double acceptancePercentage() {
        // Calculate the percentage of entries that passed
        
        int accepted = examScores.size() - gradeDistribution[0];
        return 100.0 * accepted/examScores.size();
    }
    
    public void printGradeDistribution() {
        // Display the grade distribution
        
        System.out.println("Grade distribution: ");
        
        for (int grade = 5; grade >= 0; grade--) {
            // Print the grade formatted
            
            String gradeString = "" + grade + ": ";
            
            for (int star = 0; star < gradeDistribution[grade]; star++) {
                gradeString += "*";
            }
            
            System.out.println(gradeString);
            
        }
        String formattedAcceptancePercentage = String.format("%.1f", acceptancePercentage());
        System.out.println("Acceptance percentage: " + formattedAcceptancePercentage);
    }
    
}
