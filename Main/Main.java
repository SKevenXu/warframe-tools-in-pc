package Main;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;


import warframemarket.FirstPanel;
import warframemarket.SecondPanel;
import warframemarket.warframeMarketSearch;
import warframestatus.invasionsdetails;
import warframestatus.missionSearch;
import warframestatus.sortie_data;
import warframestatus.steelPath_Data;
import warframestatus.arbitrations;
import warframestatus.construction_data;
import warframestatus.fissurespage;
import warframestatus.ArchonHunt_data;
import warframestatus.syndicate;
import warframestatus.voidTrader_data;
import warframestatus.warframepage;

public class Main {
//TODO
	//创造全局变量，并且私有
	private static JFrame frame = new JFrame();
	
	private static JPanel panel = null;
	
	public   Main() {
		
		frame = new JFrame("Warframe Tools -v0.2");
		frame.setBounds(100, 100, 700, 500);
		frame.getContentPane().setLayout(null);
		
		//使窗体不能放大
		frame.setResizable(false);
		
		//使窗体在屏幕中间出现
		frame.setResizable(false);
		
		// 菜单栏
		// 新建一个菜单条
		JMenuBar jb = new JMenuBar();
		jb.setBounds(0, 0, 1116, 30);
		frame.getContentPane().add(jb);

		
		// 新建一个菜单选项
        JMenu home = new JMenu("home");
		jb.add(home);
		JMenu jmenu1 = new JMenu("warframe market");
		jb.add(jmenu1);
        JMenu jmenu2 = new JMenu("warframe  status");
		jb.add(jmenu2);
        JMenu jmenu2_1=new JMenu("Cycle");
        jmenu2.add(jmenu2_1);
		JMenu jmenu3=new JMenu("fissures");
        jmenu2.add(jmenu3);
		
        
				
		// 新建一个菜单项
		JMenuItem jm1 = new JMenuItem("riven search");

		jmenu1.add(jm1);	
		JMenuItem jm2 = new JMenuItem("weapon search");
		jmenu1.add(jm2);
		JMenuItem jm1_1 = new JMenuItem("warframe market search");
		jmenu1.add(jm1_1);


		JMenuItem jm3 = new JMenuItem("time");
		jmenu2_1.add(jm3);
        JMenuItem jm4 = new JMenuItem("Syndicate");
		jmenu2_1.add(jm4);
		JMenuItem jm3_1 = new JMenuItem("common-fissures");
		jmenu3.add(jm3_1);
		JMenuItem jm3_2 = new JMenuItem("hard-fissures");
		jmenu3.add(jm3_2);
		JMenuItem jm3_3 = new JMenuItem("storm-fissures");
		jmenu3.add(jm3_3);
		JMenuItem jmenu4=new JMenuItem("arbitrations");
        jmenu2.add(jmenu4);
		JMenuItem jmenu5=new JMenuItem("invasions");
        jmenu2.add(jmenu5);
		JMenuItem jmenu6=new JMenuItem("ArchonHuntReward");
        jmenu2.add(jmenu6);
		JMenuItem jmenu7=new JMenuItem("sortie");
        jmenu2.add(jmenu7);
		JMenuItem jmenu8=new JMenuItem("steelPath");
        jmenu2.add(jmenu8);
		JMenuItem jmenu9=new JMenuItem("voidTrader");
        jmenu2.add(jmenu9);
		JMenuItem jmenu10=new JMenuItem("construction");
        jmenu2.add(jmenu10);
		JMenuItem jmenu11=new JMenuItem("mission search");
        jmenu2.add(jmenu11);
		

		//初始  panel
		panel = new JPanel();
		
		frame.add(panel);
		
		panel.setBounds(-1, 31, 700, 500);
		panel.setLayout(null);
		 
		JLabel label = new JLabel("广告位招租");
		label.setFont(new Font("宋体", Font.PLAIN, 49));
		label.setBounds(230, 78, 326, 297);
		panel.add(label);
		
		
		
		//关键地方来了，下面就是窗体的切换过程了。
		
		//打开界面一
		jm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(panel);
				panel = FirstPanel.firstView();
				
				//在这里，我们为什么要先frame.remove(panel)，这是因为，如果我们不是remove，
				//而是add()话，会出现，有一些组件重合，那么就会导致我们一些功能，无法使用，所以我们要先remve掉frame当前的panel。
				
				//为什么要？panel = FirstPanel.firstView();
				//这是因为，frame添加的panel已经改变了，如果我们不重新赋值panel的话，那我们，想要再次切换时，将会remove以前的panel
				//对frame现在添加的panel，没有任何影响，所以要重新赋值panel
			}
		});
		
		//打开界面二
		jm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = SecondPanel.secondView();
				//原因同上。
			}
		});
		jm1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = warframeMarketSearch.secondView();
				//原因同上。
			}
		});
        jm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = warframepage.secondView();
				//原因同上。
			}
		});
		jm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = syndicate.secondView();
				//原因同上。
			}
		});
		jm3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = fissurespage.secondView();
				//原因同上。
			}
		});
		jm3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = fissurespage.thirdView();
				//原因同上。
			}
		});
		jm3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = fissurespage.fourthView();
				//原因同上。
			}
		});
		jmenu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = arbitrations.secondView();
				//原因同上。
			}
		});
		jmenu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = invasionsdetails.secondView();
				//原因同上。
			}
		});
		jmenu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = ArchonHunt_data.secondView();
				//原因同上。
			}
		});
		jmenu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = sortie_data.secondView();
				//原因同上。
			}
		});
		jmenu8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = steelPath_Data.secondView();
				//原因同上。
			}
		});
		jmenu9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = voidTrader_data.secondView();
				//原因同上。
			}
		});
		jmenu10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = construction_data.secondView();
				//原因同上。
			}
		});
		jmenu11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = missionSearch.secondView();
				//原因同上。
			}
		});

        /* home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.remove(panel);
				panel = ;
				//原因同上。
			}
		}); */
		
		
		//使窗体可见
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static JFrame returnJFrame() {
		
		return frame;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Main();
	}

}
