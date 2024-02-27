package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;

import program.fissures.fissures;
import program.fissures.fissures_translate;

public class fissurespage {
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
		 
		JLabel label = new JLabel("普通裂隙任务:");
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
		/* JTextArea textarea1=new JTextArea();
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
		textarea3.setOpaque(false); */

        new Thread(()->{
            fissures fi=new fissures();
            fissures_translate fi_t=new fissures_translate();
            textarea.setText("");
            for(int j=1;j<=5;j++){
                for(int i=0;i<fi.fissure_Commonmission(j).length;i++){
                    textarea.append(fi.fissure_Commontier(j)[i]+"\t"+fi_t.fissure_translate(fi.fissure_Commonmission(j)[i])+"\t"+fi.fissure_Commonnode(j)[i]+"\t"+fi.fissure_Commoneta(j)[i]+"\t"+fi.fissure_Commonenemy(j)[i]+"\n");
                }
                
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
	
    public static JPanel thirdView() {
		
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 1103, 718);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("钢铁裂隙任务:");
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
		/* JTextArea textarea1=new JTextArea();
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
		textarea3.setOpaque(false); */

        new Thread(()->{
            fissures fi=new fissures();
            fissures_translate fi_t=new fissures_translate();
            textarea.setText("");
            for(int j=1;j<=5;j++){
                for(int i=0;i<fi.fissure_Hardmission(j).length;i++){
                     textarea.append(fi.fissure_Hardtier(j)[i]+"\t"+fi_t.fissure_translate(fi.fissure_Hardmission(j)[i])+"\t"+fi.fissure_Hardnode(j)[i]+"\t"+fi.fissure_Hardeta(j)[i]+"\t"+fi.fissure_Hardenemy(j)[i]+"\n");
                 }
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
	
    public static JPanel fourthView() {
		
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 1103, 718);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("九重天裂隙任务:");
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
		/* JTextArea textarea1=new JTextArea();
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
		textarea3.setOpaque(false); */

        new Thread(()->{
            fissures fi=new fissures();
            fissures_translate fi_t=new fissures_translate();
            textarea.setText("");
            for(int j=1;j<=5;j++){
                for(int i=0;i<fi.fissure_Stormmission(j).length;i++){
                     textarea.append(fi.fissure_Stormtier(j)[i]+"\t"+fi_t.fissure_translate(fi.fissure_Stormmission(j)[i])+"\t"+fi.fissure_Stormnode(j)[i]+"\t"+fi.fissure_Stormeta(j)[i]+"\t"+fi.fissure_Stormenemy(j)[i]+"\n");
                 }
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
