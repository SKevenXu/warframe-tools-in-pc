package warframestatus;



import Main.Main;
import program.Cycle_details.cambionCycle_details;
import program.Cycle_details.cetusCycle_details;
import program.Cycle_details.vallisCycle_details;


import javax.swing.*;

public class warframepage {
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
		 
		JLabel label = new JLabel("地球平原时间:");
		//label.setFont(new Font("宋体", Font.PLAIN, 99));
		label.setBounds(20, 20, 100, 30);
        JLabel label1 = new JLabel("距离下一轮换还有:");
        label1.setBounds(250, 20, 120, 30);

        JLabel label2 = new JLabel("金星平原时间:");
		//label.setFont(new Font("宋体", Font.PLAIN, 99));
		label2.setBounds(20, 60, 100, 30);
        JLabel label3 = new JLabel("距离下一轮换还有:");
        label3.setBounds(250, 60, 120, 30);

        JLabel label4 = new JLabel("火卫二平原时间:");
		//label.setFont(new Font("宋体", Font.PLAIN, 99));
		label4.setBounds(20, 100, 100, 30);
        JLabel label5 = new JLabel("距离下一轮换还有:");
        label5.setBounds(250, 100, 120, 30);

        JTextArea textarea=new JTextArea();
        textarea.setBounds(120, 25, 100,30);
        textarea.setOpaque(false);
        JTextArea textarea1=new JTextArea();
        textarea1.setBounds(400, 25, 120, 30);
        textarea1.setOpaque(false);

        JTextArea textarea2=new JTextArea();
        textarea2.setBounds(120, 65, 100,30);
        textarea2.setOpaque(false);
        JTextArea textarea3=new JTextArea();
        textarea3.setBounds(400, 65, 120, 30);
        textarea3.setOpaque(false);

        JTextArea textarea4=new JTextArea();
        textarea4.setBounds(120, 105, 100,30);
        textarea4.setOpaque(false);
        JTextArea textarea5=new JTextArea();
        textarea5.setBounds(400, 105, 120, 30);
        textarea5.setOpaque(false);

        textarea.setEditable(false);
        textarea1.setEditable(false);
        textarea2.setEditable(false);
        textarea3.setEditable(false);
        textarea4.setEditable(false);
        textarea5.setEditable(false);

        new Thread(()->{
            cetusCycle_details ce=new cetusCycle_details();
            cambionCycle_details cam=new cambionCycle_details();
            vallisCycle_details va=new vallisCycle_details();
            ce.cetusCycle_detail();
            cam.cambionCycle_detail();
            va.vallisCycle_detail();
            if(ce.cetusCycle_detail_isday()==true){
                textarea.setText("白天");
            }
            else{
                 textarea.setText("黑天");
            }
            textarea1.setText(ce.cetusCycle_detail_timeLeft());

            textarea2.setText(cam.cambionCycle_detail_state());
            textarea3.setText(cam.cambionCycle_detail_timeLeft());

            if(va.vallisCycle_detail_isWarm()==true){
                textarea4.setText("温暖");
            }
            else{
                textarea4.setText("寒冷");
            }
            textarea5.setText(va.vallisCycle_detail_timeLeft());

        }).start();


		panel.add(label);
        panel.add(label1);
		panel.add(textarea1);
        panel.add(textarea);
        panel.add(label2);
        panel.add(label3);
		panel.add(textarea2);
        panel.add(textarea3);
        panel.add(label4);
        panel.add(label5);
		panel.add(textarea4);
        panel.add(textarea5);
		return panel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
