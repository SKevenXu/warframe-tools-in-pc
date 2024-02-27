package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;


import program.invasions.invasions;;


public class invasionsdetails {
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
		 
		JLabel label = new JLabel("入侵任务:");
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
            
			invasions inv=new invasions();
			for(int i=0;i<inv.getnode().length;i++){
				if(inv.getnode()[i]!=null&&Float.valueOf( inv.getcompletion()[i]).floatValue()>0&&Float.valueOf( inv.getcompletion()[i]).floatValue()<100){
					textarea.append("进攻方派系:\t"+inv.getattackingFaction()[i]+"\n");
					textarea.append("防守方派系:\t"+inv.getdefendingFaction()[i]+"\n");
					textarea.append("进攻方胜利奖励:\t"+inv.getattackerreward()[i]+"\n");
					textarea.append("防守方胜利奖励:\t"+inv.getdefenderreward()[i]+"\n");
					textarea.append("任务所在的地图:\t"+inv.getnode()[i]+"\n");
					textarea.append("进度:\t"+inv.getcompletion()[i]+"\n");
					textarea.paintImmediately(textarea.getBounds());
				}
			}
			
           
    
        }).start();

		JScrollPane sc = new JScrollPane();
        sc.setViewportView(textarea);
        sc.setBounds(textarea.getBounds());
		//sc.setOpaque(false);

		panel.add(label);
        panel.add(sc);
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