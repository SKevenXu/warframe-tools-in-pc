package warframemarket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

import Main.Main;
import program.WeaponDisposition.weapondisposition;





public class SecondPanel {
	private static JPanel panel = null;
	private static JFrame frame = null;
	
	public static JPanel secondView(){
		//TODO
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 700, 500);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("中文名称:");
        
		//label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(400, 20, 100, 30);
        

        JTextArea textarea=new JTextArea("123");
        textarea.setBounds(20, 20, 326, 297);
        textarea.setFont(new Font("宋体", Font.PLAIN, 20));
        
        JTextField textfield=new JTextField();
        textfield.setBounds(500,20,100,30);
        

        JButton button=new JButton("applet");
        button.setBounds(510, 100, 80, 25);

        class rivensearch implements ActionListener{
            public void actionPerformed(ActionEvent e)
	        {
            new Thread(()->{
           weapondisposition we=new weapondisposition();
		   we.weapondisposition_detail("localfile\\123.json");
           
            textarea.setText("");
			
			
			for(int i=0;i<380;i++){
				if(we.getName(i).hashCode()==textfield.getText().hashCode()){
					textarea.append((we.getName(i)+"\n"));
				textarea.append(String.valueOf(we.getdisposition(i)+"\n"));
				textarea.append((we.getdescription(i)+"\n"));
				}
				
				
			}  

            }).start();
           } 
        }
        button.addActionListener(new rivensearch());

        JScrollPane sc = new JScrollPane();
        sc.setViewportView(textarea);
        sc.setBounds(20, 20, 326, 297);

        panel.add(textfield);
        
		panel.add(sc);
        panel.add(label);
        
		panel.add(button);
		return panel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
