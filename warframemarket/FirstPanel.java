package warframemarket;
import javax.swing.*;

import Main.Main;
import program.rivenSearch.rivrenSearch;
import program.rivenSearch.weaponname;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.*;


public class FirstPanel {

    private static JPanel panel = null;
    private static JFrame frame = null;

    public static JPanel firstView(){
		//TODO
		//导入frame
		frame = Main.returnJFrame();
		
		panel = new JPanel();
		
		//添加新的panel
		frame.add(panel);
		
		panel.setBounds(-1, 31, 700, 500);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("中文名称:");
        JLabel label1 = new JLabel("输入查询价格:");
		//label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(400, 20, 100, 30);
        label1.setBounds(400, 60, 100, 30);

        JTextArea textarea=new JTextArea("123");
        textarea.setBounds(20, 20, 326, 297);
        
        
        JTextField textfield=new JTextField();
        textfield.setBounds(500,20,100,30);
        JTextField textfield1=new JTextField();
        textfield1.setBounds(500,60,100,30);

        JButton button=new JButton("applet");
        button.setBounds(510, 100, 80, 25);

        class rivensearch implements ActionListener{
            public void actionPerformed(ActionEvent e)
	        {
            new Thread(()->{
            rivrenSearch ri=new rivrenSearch();
            program.rivenSearch.weaponname wea=new weaponname();
            
            String[][] temp=ri.riven_search(wea.ReadGsonTest(textfield.getText(),"localfile\\weapon.json")).clone();
           
            textarea.setText("");
                for(int i=0;i<temp.length;i++){
                    if(temp[i][4].hashCode() != -1548612125
                    && Integer.valueOf(temp[i][1]) < Integer.valueOf(textfield1.getText())) {
                        textarea.append("\n游戏内名称:"+temp[i][0]);
                        textarea.append("\n价格:"+temp[i][1]);
                        textarea.append("\n英文名称:"+temp[i][2]);
                        textarea.append("\n项目名称:"+temp[i][3]);
                        textarea.append("\n是否在线:"+temp[i][4]);
                        textarea.append("\n想要买:"+temp[i][5]);
                        textarea.paintImmediately(textarea.getBounds());
                    }                  

                }

            }).start();
           } 
        }
        button.addActionListener(new rivensearch());

        JScrollPane sc = new JScrollPane();
        sc.setViewportView(textarea);
        sc.setBounds(20, 20, 326, 297);
/* 
        panel.setBackground(Color.red); */

        panel.add(textfield);
        panel.add(textfield1);
		panel.add(sc);
        panel.add(label);
        panel.add(label1);
		panel.add(button);
		return panel;
	}

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
