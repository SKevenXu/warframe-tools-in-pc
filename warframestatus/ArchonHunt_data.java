package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;

import program.ArchonHuntReward.*;
import program.fissures.fissures_translate;;


public class ArchonHunt_data {
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
		 
		JLabel label = new JLabel("猎杀执行官:");
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
            ArchonHuntReward arc=new ArchonHuntReward();
			fissures_translate tr=new fissures_translate();
			
            textarea.setText("");
			textarea.append("\t执行官: "+arc.ArchonHunt_boss()+"\n");
            textarea.append("\t任务地点: "+arc.ArchonHunt_node()[0]); 
			textarea.append("\t任务名称: "+tr.fissure_translate(arc.ArchonHunt_type()[0])+"\n");
			textarea.append("\t任务地点: "+arc.ArchonHunt_node()[1]);
			textarea.append("\t任务名称: "+tr.fissure_translate(arc.ArchonHunt_type()[1])+"\n");
			textarea.append("\t任务地点: "+arc.ArchonHunt_node()[2]);
			textarea.append("\t任务名称: "+tr.fissure_translate(arc.ArchonHunt_type()[2])+"\n");
            textarea.append("\t距离轮换时间: "+arc.ArchonHunt_eta()); 
			textarea.append("\t");
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