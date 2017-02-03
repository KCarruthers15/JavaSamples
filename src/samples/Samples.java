/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author kylecarruthers
 */
public class Samples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicExercises basicExercises = new BasicExercises();
        
        basicExercises.AddTwoNumbers();
        basicExercises.MultiplyDecimals();
        basicExercises.MultiplyAndDivide();
        basicExercises.CountToTen();
        basicExercises.CountBackwards();
        basicExercises.FindLargerNum(35, 89);
        basicExercises.FindSmaller(6, -2);        
        basicExercises.PrintRemainder(5, 2);
    }        
}
