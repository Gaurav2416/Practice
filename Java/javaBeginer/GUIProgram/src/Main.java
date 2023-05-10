import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter Name");
		System.out.println("Name = "+ name);
		JOptionPane.showMessageDialog(null,"Hello\t "+ name);
		/* the option pane gives string so convert it to string using wrapper class*/
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your"));
		JOptionPane.showMessageDialog(null, "Age " + age);
	}

}
