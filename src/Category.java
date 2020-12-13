import java.awt.*;
import javax.swing.*;

public class Category {
	
	JFrame frame;
	JPanel panel;
	JLabel app_title;
	JLabel lbl_name;
	JLabel lbl_pass;
	JTextField name_txt;
	JTextField pwd_txt;
//	JButton btn_sbmt;
	JButton btn_ok;
	JButton btn_nums;
	JButton btn_cancel;
	
	public Category() {
		Category();
	}
	
	public void Category() {
		
		frame = new JFrame();
		panel = new JPanel();
		
		frame.setTitle("Product Scanner");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
//		frame.setResizable(false);
		frame.add(panel);
		
		panel.setLayout(null); //It is very important to add this to it. 
		                      //It makes components align or display correctly.
		
		//Here we add the app title
		app_title = new JLabel("Product Location");
		app_title.setSize(120, 35);
		app_title.setBounds(170, 10, 120, 35);
		panel.add(app_title);
		
		//Here we add the ok buttons
		btn_ok = new JButton("OK");
		btn_ok.setSize(55, 35);
		btn_ok.setBounds(100, 45, 60, 35);
		panel.add(btn_ok);
		
		//Here we add a new button to it for number, nums
		btn_nums = new JButton("Num");
		btn_nums.setSize(55, 35);
		btn_nums.setBounds(170, 45, 60, 35);
		panel.add(btn_nums);
		
		//Here we add the cancel button
		btn_cancel = new JButton("ESC");
		btn_cancel.setSize(55, 35);
		btn_cancel.setBounds(240, 45, 60, 35);
		panel.add(btn_cancel);
		
		//Here we add the username and username textfield to it
		lbl_name = new JLabel("Bar Code");
		lbl_name.setSize(130, 40);
		lbl_name.setBounds(30, 90, 90, 40);
		panel.add(lbl_name);
		
		//Here we add then name textfiled
		name_txt = new JTextField();
//		name_txt.setBorder(null);
		name_txt.setSize(180, 40);
		name_txt.setBounds(100, 90, 200, 40);
		name_txt.setBackground(Color.orange);
		panel.add(name_txt);
		
		
		//The label for the password
		lbl_pass = new JLabel("Shelf Area");
		lbl_pass.setSize(130, 40);
		lbl_pass.setBounds(30, 140, 90, 40);
		panel.add(lbl_pass);
		
		//Here we add the passwprd text
		pwd_txt = new JTextField(100);
		pwd_txt.setBounds(100, 140, 200, 40);
		panel.add(pwd_txt);
		
		//Here we are going to repeat the OK and ESC buttons
		btn_ok = new JButton("OK");
		btn_ok.setSize(55, 35);
		btn_ok.setBounds(100, 190, 60, 35);
		panel.add(btn_ok);
		
		//Here we add a new button to it for number, nums
		btn_nums = new JButton("Num");
		btn_nums.setSize(55, 35);
		btn_nums.setBounds(170, 190, 60, 35);
		panel.add(btn_nums);
		
		//Here we add the cancel button
		btn_cancel = new JButton("ESC");
		btn_cancel.setSize(55, 35);
		btn_cancel.setBounds(240, 190, 60, 35);
		panel.add(btn_cancel);

	}
	
	public static void main(String[] args) {
		new Category();
	}
	

}
