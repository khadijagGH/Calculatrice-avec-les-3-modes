package projetJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {
    private JButton basicButton, advancedButton, programmerButton;
    private JPanel buttonPanel;
    
    public SwingCalculator() {
        super("Calculator");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        basicButton = new JButton("Basic");
        advancedButton = new JButton("Advanced");
        programmerButton = new JButton("Programmer");
        
        buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(basicButton);
        buttonPanel.add(advancedButton);
        buttonPanel.add(programmerButton);
        
        basicButton.addActionListener(this);
        advancedButton.addActionListener(this);
        programmerButton.addActionListener(this);
        
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == basicButton) {
             Calculator calc = new  Calculator();
        } else if (e.getSource() == advancedButton) {
            AdvancedCalculator calc = new AdvancedCalculator();
        } else if (e.getSource() == programmerButton) {
            ProgrammerCalculator calc = new ProgrammerCalculator();
        }
    }
    
    public static void main(String[] args) {
    	   SwingCalculator calculator = new SwingCalculator();
    }
}