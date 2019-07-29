package _07_binary_converter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {

	JFrame frame = new JFrame();

	JPanel panel = new JPanel();

	JButton button = new JButton("convert");

	JTextField field = new JTextField(20);
	
	JLabel label = new JLabel();

	void GUI() {

		frame.add(panel);
		
		panel.add(label);

		frame.setVisible(true);

		panel.add(button);

		panel.add(field);

		button.addMouseListener(this);

		frame.pack();

	}
	
	
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		String text = field.getText();
		
		String text2 = convert(text);
		System.out.println(text2);
		label.setText(text2);
		
		frame.pack();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
