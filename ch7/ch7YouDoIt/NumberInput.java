//Alexis Bowen
// p 252
package ch7YouDoIt;
import javax.swing.JOptionPane;

public class NumberInput {
    public static void main(String[] args) {
        String inputString;
        int inputNumber;
        int result;
        final int factor = 10;

        inputString = JOptionPane.showInputDialog(
                null,
                "Enter a number"
        );

        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * factor;

        JOptionPane.showMessageDialog(
                null,
                inputNumber + " * " + factor + " = " + result
        );
    }
}

