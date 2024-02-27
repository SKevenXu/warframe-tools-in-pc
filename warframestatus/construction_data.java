package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;
import program.ConstructionProgress.construction;





public class construction_data {
	private static JPanel panel = null;
	private static JFrame frame = null;
	
	public static JPanel secondView() {
		//TODO
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 1103, 718);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("舰队建造进度:");
		label.setBounds(20, 20, 100, 30);
		/* JLabel label1 = new JLabel("钢铁裂隙任务:");
		label1.setBounds(245, 20, 100, 30);
		JLabel label2 = new JLabel("九重天裂隙任务:");
		label2.setBounds(470, 20, 100, 30); */
		

		Font font=new Font(null, 0, 12);
        JTextArea textarea=new JTextArea("loading.....");
        textarea.setBounds(20, 45, 650, 30);
		textarea.setFont(font);
		textarea.setOpaque(true);
        textarea.setEditable(false);

        JProgressBar progressbar=new JProgressBar(0,100);
        JProgressBar progressbar1=new JProgressBar(0,100);
        progressbar.setBounds(20, 80, 200, 30);
        progressbar1.setBounds(270, 80, 200, 30);
		

        new Thread(()->{
            construction con=new construction(); 
            textarea.setText("");
            textarea.append("豺狼舰队建造进度:\t\t巨人舰队建造进度:");    
            progressbar.setValue((int)con.getFomorian());
            progressbar.setString(progressbar.getString());
            progressbar.setStringPainted(true);
            progressbar1.setValue((int)con.getRazorback());
            progressbar1.setString(progressbar1.getString());
            progressbar1.setStringPainted(true);
                             //获取豺狼舰队建造进度               //该函数返回数据为float类型;
                       
            
        }).start();
        panel.add(progressbar); 
        panel.add(progressbar1);
		panel.add(label);
        panel.add(textarea);
		/* panel.add(label1);
        panel.add(textarea1);
		panel.add(label2);
        panel.add(textarea2); */
		
        
		
		return panel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}