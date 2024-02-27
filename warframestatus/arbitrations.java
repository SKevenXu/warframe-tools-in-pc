package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;
import program.Arbitration.arbitration;


public class arbitrations {
	private static JPanel panel = null;
	private static JFrame frame = null;
	
	public static JPanel secondView() {
		
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 1103, 718);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("仲裁任务:");
		label.setBounds(20, 20, 100, 30);
		/* JLabel label1 = new JLabel("钢铁裂隙任务:");
		label1.setBounds(245, 20, 100, 30);
		JLabel label2 = new JLabel("九重天裂隙任务:");
		label2.setBounds(470, 20, 100, 30); */
		

		Font font=new Font(null, 0, 12);
        JTextArea textarea=new JTextArea("loading.....");
        textarea.setBounds(20, 45, 650, 400);
		textarea.setFont(font);
		textarea.setOpaque(false);
		textarea.setEditable(false);
		

        new Thread(()->{
            arbitration ar=new arbitration();
            textarea.setText("");
			try {
				textarea.append("任务名称:"+ar.arbittype()+"\n"+"任务地点:"+ar.arbitnode()+"\n"+"任务派系:"+ar.arbitenemy()+"\n"+"任务剩余时间:"+ar.arbittime()+"分钟");
			} catch (Exception e) {
				// TODO: handle exception
				textarea.append("\tde又抽风不给数据啦!");
				textarea.append("\t");
			}
			
    
        }).start();

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