import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;


public class JFrameTimer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	private JPanel contentPane;
	// variables - a timer and counter for seconds
	
	Timer tm;
	int seconds = 0;
	int clickCounter = 0;
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTimer frame = new JFrameTimer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameTimer() {
		setTitle("Hockey Reaction Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgress = new JLabel("");
		lblProgress.setFont(new Font("Calibri", Font.BOLD, 14));
		lblProgress.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgress.setBounds(183, 11, 61, 23);
		contentPane.add(lblProgress);
		
		// add a 1000 millisecond (second) interval and evernt handler to the timer
		
		tm = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		// show the value of a second in the label and increment
				
				lblProgress.setText(Integer.toString(seconds));
				seconds++;
			}
		});

	//show the amount of clicks
		
		JLabel lblReaction = new JLabel("");
		lblReaction.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaction.setBounds(101, 215, 33, 19);
		contentPane.add(lblReaction);
		
				
		lblReaction.setText(Integer.toString(clickCounter));
		clickCounter++;
		
		//Reaction time label 
		
		JLabel lblRNTitle = new JLabel("Reaction Responce Time");
		lblRNTitle.setBounds(21, 257, 146, 19);
		contentPane.add(lblRNTitle);
		
		JLabel lblReactionTime = new JLabel("");
		lblReactionTime.setForeground(new Color(139, 0, 139));
		lblReactionTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReactionTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblReactionTime.setBounds(209, 253, 96, 23);
		contentPane.add(lblReactionTime);
		
		
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(new Color(34, 139, 34));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//start the timer
				tm.start();
			}
		});
		btnStart.setBounds(21, 11, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setForeground(new Color(128, 0, 0));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//stop the timer
				tm.stop();
				
				//Show the reaction responce time
				
				double one=Integer.parseInt(lblProgress.getText());
				double two=Integer.parseInt(lblReaction.getText());
				
				String answer=String.valueOf(one/two);
				lblReactionTime.setText(answer);
			}
		});
		btnStop.setBounds(312, 11, 89, 23);
		contentPane.add(btnStop);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Close the system
				
				System.exit(0);	
			}
		});
		btnExit.setBounds(341, 277, 89, 23);
		contentPane.add(btnExit);
		
	
		
		JLabel lblRandomNumber = new JLabel("");
		lblRandomNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblRandomNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRandomNumber.setBounds(177, 112, 61, 42);
		contentPane.add(lblRandomNumber);
		
		//Random number Generator
		
				Random rand = new Random();
				int upperbound = 7;
				int int_random = rand.nextInt(upperbound);
				
				String z = Integer.toString(int_random);
				lblRandomNumber.setText(z);
				
				JButton btnZero = new JButton("0");
				btnZero.setForeground(new Color(0, 0, 0));
				btnZero.setBackground(new Color(240, 240, 240));
				btnZero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 0) {
							
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
					//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnZero.setBounds(183, 63, 55, 23);
				contentPane.add(btnZero);
				
				JButton btnOne = new JButton("1");
				btnOne.setForeground(new Color(0, 0, 0));
				btnOne.setBackground(new Color(240, 240, 240));
				btnOne.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 1) {
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnOne.setBounds(91, 63, 55, 23);
				contentPane.add(btnOne);
				
				JButton btnTwo = new JButton("2");
				btnTwo.setForeground(new Color(0, 0, 0));
				btnTwo.setBackground(new Color(240, 240, 240));
				btnTwo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 2) {
							
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnTwo.setBounds(91, 122, 55, 23);
				contentPane.add(btnTwo);
				
				JButton btnThree = new JButton("3");
				btnThree.setForeground(new Color(0, 0, 0));
				btnThree.setBackground(new Color(240, 240, 240));
				btnThree.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 3) {
							
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnThree.setBounds(91, 181, 55, 23);
				contentPane.add(btnThree);
				
				JButton btnFour = new JButton("4");
				btnFour.setForeground(new Color(0, 0, 0));
				btnFour.setBackground(new Color(240, 240, 240));
				btnFour.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 4) {
							
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnFour.setBounds(281, 63, 55, 23);
				contentPane.add(btnFour);
				
				JButton btnFive = new JButton("5");
				btnFive.setForeground(new Color(0, 0, 0));
				btnFive.setBackground(new Color(240, 240, 240));
				btnFive.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 5) {
							
				//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnFive.setBounds(281, 122, 55, 23);
				contentPane.add(btnFive);
				
				JButton btnSix = new JButton("6");
				btnSix.setForeground(new Color(0, 0, 0));
				btnSix.setBackground(new Color(240, 240, 240));
				btnSix.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				//code for button to get number from  the label 'Random Number'
						
						String num = lblRandomNumber.getText();
						int num1 = Integer.parseInt(num);
						if(num1 == 6) {
							
							//add one to click counter 
							
							clickCounter ++;
							lblReaction.setText(Integer.toString(clickCounter));
				//Reset random number generator
							
							Random rand = new Random();
							int upperbound = 7;
							int int_random = rand.nextInt(upperbound);
							
							String z = Integer.toString(int_random);
							lblRandomNumber.setText(z);
						}
					}
				});
				btnSix.setBounds(281, 181, 55, 23);
				contentPane.add(btnSix);
				
				JLabel lblClick = new JLabel("Click Count");
				lblClick.setBounds(21, 215, 89, 19);
				contentPane.add(lblClick);
		
				JLabel lblResponceText = new JLabel("Responce Time is Click Count Divided by Timer");
				lblResponceText.setForeground(Color.BLUE);
				lblResponceText.setFont(new Font("Tahoma", Font.ITALIC, 11));
				lblResponceText.setBounds(21, 288, 254, 14);
				contentPane.add(lblResponceText);
				
					}
}
