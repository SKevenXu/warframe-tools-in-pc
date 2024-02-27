package warframestatus;



import java.awt.Font;
import javax.swing.*;

import Main.Main;
import program.Syndicate.CetusSyndicate;

public class syndicate {
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
		 
		JLabel label = new JLabel("地球赏金任务:");
		label.setBounds(20, 20, 100, 30);
		JLabel label1 = new JLabel("金星赏金任务:");
		label1.setBounds(245, 20, 100, 30);
		JLabel label2 = new JLabel("火卫二赏金任务:");
		label2.setBounds(470, 20, 100, 30);
		JLabel label3 = new JLabel("距离赏金结束还有:");
		label3.setBounds(260, 300, 120, 30);

		Font font=new Font(null, 0, 12);
        JTextArea textarea=new JTextArea();
        textarea.setBounds(20, 45, 200, 200);
		textarea.setFont(font);
		textarea.setOpaque(false);
		JTextArea textarea1=new JTextArea();
        textarea1.setBounds(245, 45, 200, 200);
		textarea1.setFont(font);
		textarea1.setOpaque(false);
		JTextArea textarea2=new JTextArea();
        textarea2.setBounds(470, 45, 200, 200);
		textarea2.setFont(font);
		textarea2.setOpaque(false);
		JTextArea textarea3=new JTextArea();
        textarea3.setBounds(400, 305, 100, 30);
		textarea3.setFont(font);
		textarea3.setOpaque(false);

		textarea.setEditable(false);
		textarea1.setEditable(false);
		textarea2.setEditable(false);
		textarea3.setEditable(false);

        new Thread(()->{
            CetusSyndicate ce=new CetusSyndicate();
			
            String[] temp=ce.CetusSyndicatesList();
			String[] temp1=ce.cambionSyndicatesList();
			String[] temp2=ce.vallisSyndicatesList();
			String temp3=String.valueOf(ce.expiryTime(0));

            for(int i=0;i<temp.length;i++){
                textarea.append("赏金"+(i+1)+":"+temp[i]+"\n");
				textarea1.append("赏金"+(i+1)+":"+temp1[i]+"\n");
				textarea2.append("赏金"+(i+1)+":"+temp2[i]+"\n");
				textarea3.append(temp3);
            }
            
        }).start();

		panel.add(label);
        panel.add(textarea);
		panel.add(label1);
        panel.add(textarea1);
		panel.add(label2);
        panel.add(textarea2);
		panel.add(label3);
        panel.add(textarea3);
		
		return panel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
