package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;


import program.sortie.sortie;;


public class sortie_data {
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
		 
		JLabel label = new JLabel("突击任务:");
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
            sortie sor=new sortie();
            textarea.setText("");
            for(int i=0;i<3;i++){
                textarea.append("任务"+(i+1)+":\n");
                textarea.append("任务名称:\t"+sor.getmissions()[i]+"\n");
                textarea.append("任务地点数据:\t"+sor.getnodes()[i]+"\n");
                textarea.append("任务限制:\t"+sor.getmodifiers()[i]);
				textarea.append("\n");
                textarea.append("任务限制描述:\t"+sor.getmodifierDescriptions()[i]+"\n\n");

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