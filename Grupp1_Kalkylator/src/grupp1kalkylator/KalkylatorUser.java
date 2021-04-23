package grupp1kalkylator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class KalkylatorUser implements ActionListener{
	
	private static JFrame frame;
	private static JTextField userText1, userText2, userText3, userText4;
	private static JButton[] functionButtons = new JButton[4];
	private static JButton addButton, subButton, mulButton, divButton;
	private static JButton proButton;
	private static JLabel resultLabelCalc, resultLabelSale;
	private static JLabel priceLabel, procentLabel;
	private static JLabel imageLabel;
	
	public static double firstNumber, secondNumber, result;
	public static double price, procent, resultNewPrice, resultDiscount;
	public static char operator;
	
	KalkylatorUser()
	
	{
		// Frame storlek, namn, exit när man avslutar rutan
		
		frame = new JFrame("Calculator");
		frame.setSize(265, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		// Lägger till bild till frame
		
		ImageIcon icon = new ImageIcon("Image/calc_logom.png");
		
		imageLabel = new JLabel();
		imageLabel.setBounds(30, 20, 200, 200);
		imageLabel.setIcon(icon);
		
		// Panel för listan av funktionsknappar
		
		JPanel panel = new JPanel();
		
		frame.add(panel);
		panel.setBounds(50, 280, 165, 25);			
		panel.setLayout(new GridLayout(1, 4, 5, 5));
		
		// Fält för användaren att skriva in nummer
		
		userText1 = new JTextField();
		userText1.setBounds(50, 200, 165, 30);
		
		userText2 = new JTextField();
		userText2.setBounds(50, 230, 165, 30);
		
		userText3 = new JTextField();
		userText3.setBounds(50, 370, 165, 30);
		
		userText4 = new JTextField();
		userText4.setBounds(50, 430, 165, 30);
		
		// Label för prisuträknare Pris / Procent
		
		priceLabel = new JLabel("Price");
		priceLabel.setBounds(55, 350, 80, 30);
		
		procentLabel = new JLabel("Discount(%)");
		procentLabel.setBounds(55, 410, 80, 30);
		
		// Label för resultat Enkel Kalkylator / Prisuträknare
		
		resultLabelCalc = new JLabel();
		resultLabelCalc.setBounds(50, 310, 400, 30);
		
		resultLabelSale = new JLabel();
		resultLabelSale.setBounds(50, 510, 400, 50);
		
		// Knappar för Addition / Subtraktion / Multiplikation / Division 
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("x");
		divButton = new JButton("/");
		
		// Lägger till knapparna i array för funktionsknappar
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		
		for(int i = 0; i< 4; i++)
		{
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFocusable(false);
		}
		
		// Knapp för prisomvandlare Procent
		
		proButton = new JButton("New Price");
		proButton.setBounds(50, 480, 165, 25);
		proButton.addActionListener(this);
		proButton.setFocusable(false);
		
		// Lägger till knapparna i en panel 
		
		panel.add(functionButtons[0]);
		panel.add(functionButtons[1]);
		panel.add(functionButtons[2]);
		panel.add(functionButtons[3]);
		
		// Knapp för prisomvandlare i frame
		
		frame.add(proButton);
		
		// Lägger till i frame Textfält / Prisuträknare / Resultat / Bild
		
		frame.add(userText1);
		frame.add(userText2);
		frame.add(userText3);
		frame.add(userText4);
		
		frame.add(priceLabel);
		frame.add(procentLabel);
		
		frame.add(resultLabelCalc);
		frame.add(resultLabelSale);
		
		frame.add(imageLabel);
		
		// Gör att allt visas i rutan
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new KalkylatorUser();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<4;i++) 
		{
			if(e.getSource()== functionButtons[i]) 
			{
				System.out.println("Button clicked");
			}
		}
		
		if(e.getSource()== proButton) 
		{
			System.out.println("Button clicked");
		}
		
		
		
		if(e.getSource()== addButton) 
		{
			firstNumber = Double.parseDouble(userText1.getText());
			secondNumber = Double.parseDouble(userText2.getText());
			operator = '+';
			
			userText1.setText("");
			userText2.setText("");
			
			result = Kalkylator.Add(firstNumber, secondNumber);
			System.out.println(result);
		}
		
		if(e.getSource()== subButton) 
		{
			firstNumber = Double.parseDouble(userText1.getText());
			secondNumber = Double.parseDouble(userText2.getText());
			operator = '-';
			
			userText1.setText("");
			userText2.setText("");
			
			result = Kalkylator.Sub(firstNumber, secondNumber);
			System.out.println(result);
		}
		
		if(e.getSource()== mulButton) 
		{
			firstNumber = Double.parseDouble(userText1.getText());
			secondNumber = Double.parseDouble(userText2.getText());
			operator = '*';
			
			userText1.setText("");
			userText2.setText("");
			
			result = Kalkylator.Multi(firstNumber, secondNumber);
			System.out.println(result);
		}
		
		if(e.getSource()== divButton) 
		{
			firstNumber = Double.parseDouble(userText1.getText());
			secondNumber = Double.parseDouble(userText2.getText());
			operator = '/';
			
			userText1.setText("");
			userText2.setText("");
			
			result = Kalkylator.Div(firstNumber, secondNumber);
			System.out.println(result);
		}
		
		resultLabelCalc.setText(firstNumber + " " + String.valueOf(operator) 
		+ " " + secondNumber + " = " + String.valueOf(result));
		
		
		if(e.getSource()== proButton) 
		{
			price = Double.parseDouble(userText3.getText());
			procent = Double.parseDouble(userText4.getText());
			
			userText3.setText("");
			userText4.setText("");
			
			resultNewPrice = Kalkylator.Discount(price, procent);
			resultDiscount = Kalkylator.Procent(price, procent);
		}
		
		resultLabelSale.setText("New Price: " + String.valueOf(resultNewPrice)
		+ " Your Discount: " + String.valueOf(resultDiscount));
	
	}
	
	

}
