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
public class BasicExercises {

    // Exercise 1 - Add two numbers
    public void AddTwoNumbers() {
        int numOne = 12;
        int numTwo = 24;

        int sum = numOne + numTwo;

        System.out.println("1. Add Two Numbers");
        System.out.println(sum);
    }

    public void MultiplyDecimals() {
        float numOne = 12.2345f;
        float numTwo = 57.5373f;

        float sum = numOne + numTwo;
        System.out.println(" ");
        System.out.println("2. Multiply Decimals");
        System.out.println(sum);
    }

    public void MultiplyAndDivide() {
        float numOne = 12.2345f;
        float numTwo = 57.5373f;

        float product = (numOne * numTwo) / numOne;

        System.out.println(" ");
        System.out.println("3. Multiply And Divide");
        System.out.println(product);
    }

    public void CountToTen() {
        System.out.println(" ");
        System.out.println("4. Count To Ten");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void CountBackwards() {
        System.out.println(" ");
        System.out.println("5. Count Backwards");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void CountWhile() {
        System.out.println(" ");
        System.out.println("6. Count while");

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void FindLargerNum(int firstNum, int secondNum) {
        System.out.println(" ");
        System.out.println("7. Find Larger Num");
        System.out.println(" ");
        System.out.println("FirstNum = " + String.valueOf(firstNum) + " SecondNum = " + String.valueOf(secondNum));

        // !!!!!!! Remove before showing !!!!!!
        // How to make better? What if they are equal??
        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }

    public void FindSmaller(int firstNum, int secondNum) {
        // This has an issue. How to debug.
        if (firstNum > secondNum) {
            // TODO: Remove - Issue is numbers are wrong
            //PrintFromNumToNum(firstNum, secondNum);
            PrintFromNumToNum(secondNum, firstNum);
        } else if (firstNum < secondNum) {
            PrintFromNumToNum(secondNum, firstNum);
        } else {
            System.out.println(" Numbers are equal! ");
        }
    }

    public void PrintFromNumToNum(int firstNum, int secondNum) {
        System.out.println(" ");
        System.out.println("8. Print from Num to Num");
        System.out.println(" ");
        System.out.println("FirstNum = " + String.valueOf(firstNum) + " SecondNum = " + String.valueOf(secondNum));
        
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.println(i);
        }
    }
    
    public void PrintRemainder(int firstNum, int secondNum) { 
        System.out.println(" ");
        System.out.println("9. Print Remainder");
        System.out.println(" ");
        System.out.println("FirstNum = " + String.valueOf(firstNum) + " SecondNum = " + String.valueOf(secondNum));
        
        int remainder = firstNum % secondNum;
        System.out.println(remainder);
    }
}
