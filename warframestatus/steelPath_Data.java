package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;


import program.steelPath.steelPath;;


public class steelPath_Data {
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
		 
		JLabel label = new JLabel("钢铁之路奖励:");
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
            steelPath st=new steelPath();
            textarea.setText("");
			textarea.append("钢铁之路奖励:\t"+st.curr_name()+"\n");                         //返回钢铁之路轮换奖励的名称         //该函数返回数据为String类型;
			textarea.append("所需要的钢铁精华:\t"+String.valueOf(st.curr_cost())+"\n");                         //返回钢铁之路轮换奖励所需要的钢铁精华 //该函数返回数据为int类型;
			textarea.append("距离下次轮换的时间:\t"+st.steel_remaining()+"\n");                   //返回距离钢铁之路奖励轮换的时间       //该函数返回数据为String类型;
          
            
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