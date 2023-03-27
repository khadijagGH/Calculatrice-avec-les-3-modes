package projetJava;

 
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgrammerCalculator implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonA, buttonB, buttonC, buttonD, buttonE, buttonF;
    private JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonAnd, buttonOr, buttonXor, buttonNot, buttonMod, buttonSftL, buttonSftR;
    private JButton buttonBin, buttonOct, buttonDec, buttonHex;
    private JButton buttonClr, buttonEq;
    private String operator = "";
    private String num1 = "";
    private String num2 = "";
    private String result = "";
    private int base = 10;
    
    public ProgrammerCalculator() {
        // create the frame
        frame = new JFrame("Programmer Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create the panel
        panel = new JPanel(new GridLayout(6, 4));
        
        // create the text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        
        // create the buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonA = new JButton("A");
        buttonB = new JButton("B");
        buttonC = new JButton("C");
        buttonD = new JButton("D");
        buttonE = new JButton("E");
        buttonF = new JButton("F");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonAnd = new JButton("&");
        buttonOr = new JButton("|");
        buttonXor = new JButton("^");
        buttonNot = new JButton("~");
        buttonMod = new JButton("%");
        buttonSftL = new JButton("<<");
        buttonSftR = new JButton(">>");
        buttonBin = new JButton("BIN");
        buttonOct = new JButton("OCT");
        buttonDec = new JButton("DEC");
        buttonHex = new JButton("HEX");
        buttonClr = new JButton("CLR");
        buttonEq = new JButton("=");
        
        // add action listeners to the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonAnd.addActionListener(this);
        buttonOr.addActionListener(this);
        buttonXor.addActionListener(this);
        buttonNot.addActionListener(this);
        buttonMod.addActionListener(this);
        buttonSftL.addActionListener(this);
        buttonSftR.addActionListener(this
    );
    buttonBin.addActionListener(this);
    buttonOct.addActionListener(this);
    buttonDec.addActionListener(this);
    buttonHex.addActionListener(this);
    buttonClr.addActionListener(this);
    buttonEq.addActionListener(this);
    
    // add the components to the panel
    panel.add(buttonA);
    panel.add(buttonB);
    panel.add(buttonC);
    panel.add(buttonD);
    panel.add(buttonE);
    panel.add(buttonF);
    panel.add(buttonClr);
    panel.add(buttonMod);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    panel.add(buttonDiv);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(buttonMul);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(buttonSub);
    panel.add(button0);
    panel.add(buttonAnd);
    panel.add(buttonOr);
    panel.add(buttonXor);
    panel.add(buttonAdd);
    panel.add(buttonNot);
    panel.add(buttonSftL);
    panel.add(buttonSftR);
    panel.add(buttonBin);
    panel.add(buttonOct);
    panel.add(buttonDec);
    panel.add(buttonHex);
    panel.add(textField);
    panel.add(buttonEq);
    
    // add the panel to the frame
    frame.add(panel);
    
    // make the frame visible
    frame.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    String action = e.getActionCommand();
    
    switch(action) {
        case "0":
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9":
        case "A":
        case "B":
        case "C":
        case "D":
        case "E":
        case "F":
            if (operator.equals("")) {
                num1 += action;
                textField.setText(num1);
            } else {
                num2 += action;
                textField.setText(num2);
            }
            break;
        case "+":
        case "-":
        case "*":
        case "/":
        case "&":
        case "|":
        case "^":
        case "%":
        case "<<":
        case ">>":
            operator = action;
            break;
        case "~":
            if (operator.equals("")) {
                num1 = Integer.toBinaryString(~Integer.parseInt(num1, base));
                textField.setText(num1);
            } else {
                num2 = Integer.toBinaryString(~Integer.parseInt(num2, base));
                textField.setText(num2);
            }
            break;
        case "=":
            int n1 = Integer.parseInt(num1, base);
            int n2 = Integer.parseInt(num2, base);
            switch(operator) {
                case "+":
                    result = Integer.toString(n1 + n2, base);
                    break;
                case "-":
                    result = Integer.toString(n1 - n2, base);
                    break;
                case "*":
                    result = Integer.toString(n1 * n2, base);
                    break;
                case "/":
                    result = Integer.toString(n1 / n2, base);
                    break;
                case "&":
                    result = Integer.toString(n1 & n2, base);
                    break;
                case "|":
                    result = Integer.toString(n1 | n2, base);
                    break;
                case "^":
                    result = Integer.toString(n1 ^ n2, base);
                    break;
                case "%":
                    result = Integer.toString(n1 % n2, base);
                    break;
                case "<<":
                    result = Integer.toString(n1 << n2, base);
                    break;
                case ">>":
                    result = Integer.toString(n1 >> n2, base);
break;
}
textField.setText(result);
num1 = result;
num2 = "";
operator = "";
break;
case "Clr":
num1 = "";
num2 = "";
operator = "";
result = "";
textField.setText("");
break;
case "Bin":
base = 2;
textField.setText(Integer.toString(Integer.parseInt(num1, base)));
break;
case "Oct":
base = 8;
textField.setText(Integer.toString(Integer.parseInt(num1, base)));
break;
case "Dec":
base = 10;
textField.setText(Integer.toString(Integer.parseInt(num1, base)));
break;
case "Hex":
base = 16;
textField.setText(Integer.toString(Integer.parseInt(num1, base)).toUpperCase());
break;
}
}

public static void main(String[] args) {
    ProgrammerCalculator calc = new ProgrammerCalculator();
}
}