import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilkRateCalculator extends JFrame {
    
    // Declare components
    private JTextField nameField, fatField, snfField, allocatedField;
    private JTextArea displayArea;
    private JButton calculateButton;
    private JLabel nameLabel, fatLabel, snfLabel, allocatedLabel, resultLabel;

    public MilkRateCalculator() {
        // Set the title and layout for JFrame
        setTitle("Milk Rate Calculator");
        setLayout(new FlowLayout());

        // Initialize components
        nameLabel = new JLabel("Customer Name:");
        fatLabel = new JLabel("Fat Percentage:");
        snfLabel = new JLabel("SNF Percentage:");
        allocatedLabel = new JLabel("Allocated Number:");

        nameField = new JTextField(20);
        fatField = new JTextField(5);
        snfField = new JTextField(5);
        allocatedField = new JTextField(5);

        calculateButton = new JButton("Calculate Milk Rate");

        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        resultLabel = new JLabel("Milk Rate:");

        // Add components to JFrame
        add(nameLabel);
        add(nameField);
        add(fatLabel);
        add(fatField);
        add(snfLabel);
        add(snfField);
        add(allocatedLabel);
        add(allocatedField);
        add(calculateButton);
        add(resultLabel);
        add(scrollPane);

        // Set the JFrame size and default behavior
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Button click event handling
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplay();
            }
        });
    }

    // Function to calculate milk rate based on fat and SNF
    private void calculateAndDisplay() {
        try {
            // Get input values
            String name = nameField.getText();
            double fat = Double.parseDouble(fatField.getText());
            double snf = Double.parseDouble(snfField.getText());
            int allocatedNumber = Integer.parseInt(allocatedField.getText());

            // Calculate the milk rate (Simple formula as an example)
            double milkRate = (fat * 5.60) + (snf * 0); // This is a basic calculation
            String result = String.format("%.2f", milkRate);

            // Display customer name and allocated number in the text area
            displayArea.append("Customer: " + name + "\n");
            displayArea.append("Allocated Number: " + allocatedNumber + "\n");
            displayArea.append("Milk Rate: " + result + "\n\n");

            // Clear input fields after calculation
            nameField.setText("");
            fatField.setText("");
            snfField.setText("");
            allocatedField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new MilkRateCalculator();
    }
}
