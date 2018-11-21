import java.awt.EventQueue;

public class JFrame {

	private static String EXIT_ON_CLOSE;  //added later
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame window = new JFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Create the application.
	 */
	public JFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//down functions are added later
	
	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

		}
	
	protected void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		final String EXIT_ON_CLOSE = null;
		JFrame frame;
		}

}
