import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HockeyReactionTimerInstructions extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HockeyReactionTimerInstructions frame = new HockeyReactionTimerInstructions();
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
	public HockeyReactionTimerInstructions() {
		setTitle("Hockey Reaction Timer Instructions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//new screen pop up
				
				JFrameTimer.NewScreen();
				
				
			}
		});
		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("<html>To start the Reaction Timer.<BR>\r\nFirst click the start button: this will start the time.<BR>\r\nA random number will show in the middle of the app.<BR>\r\nClick the button that matches.<BR>\r\nKeep repeating this for your desired time, <BR>\r\n(numbers can repeat themselves so button will need to be clicked again if it doesn't change in the middle)<BR> \r\nAfter you desired time is up click stop.<BR>\r\nThis will give you reaction time by dividing correct buttons clicked and the end time.\r\n</html>");
		lblNewLabel.setForeground(new Color(32, 178, 170));
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 11, 414, 205);
		contentPane.add(lblNewLabel);
	}
}
