import javax.swing.JOptionPane;

public class GUIprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter Name");
		JOptionPane.showMessageDialog(null,"Hello\t "+ name);
		/* the option pane gives string so convert it to string using wrapper class*/
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age "));
		JOptionPane.showMessageDialog(null, "Age " + age);
		System.out.println("Name = "+ name + " and Age = " + age);
	}

}
