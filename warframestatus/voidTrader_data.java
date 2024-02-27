package warframestatus;

import java.awt.Font;
import javax.swing.*;

import Main.Main;
import program.voidTrader.voidTrader;

public class voidTrader_data {
	private static JPanel panel = null;
	private static JFrame frame = null;

	public static JPanel secondView() {
//TODO
		// 导入frame
		frame = Main.returnJFrame();

		panel = new JPanel();

		// 添加新的panel
		frame.add(panel);

		panel.setBounds(-1, 31, 1103, 718);
		panel.setLayout(null);

		JLabel label = new JLabel("奸商:");
		label.setBounds(20, 20, 100, 30);
		/*
		 * JLabel label1 = new JLabel("钢铁裂隙任务:");
		 * label1.setBounds(245, 20, 100, 30);
		 * JLabel label2 = new JLabel("九重天裂隙任务:");
		 * label2.setBounds(470, 20, 100, 30);
		 */

		Font font = new Font(null, 0, 12);
		JTextArea textarea = new JTextArea("loading.....");
		textarea.setBounds(20, 45, 650, 400);
		textarea.setFont(font);
		textarea.setOpaque(false);
		textarea.setEditable(false);

		new Thread(() -> {
			voidTrader vo = new voidTrader();
			textarea.setText("");
			if (vo.item().length != 0) {
				textarea.append("奸商在" + vo.voidLocation() + "\t" + "奸商准备在\t" + vo.voidEndString() + "离开\n\n");
				textarea.append("奸商物品:\t\t所需的杜卡德金币:\t\t所需的现金:\n\n");
				for (int i = 0; i < vo.item().length; i++) {
					textarea.append(vo.item()[i] + "\t" + String.valueOf(vo.item_ducats()[i]) + "\t"
							+ String.valueOf(vo.item_credits()[i]) + "\n");
				}
			} else {

				textarea.append("奸商还没来呢,还有" + vo.voidEndString() + "会到" + vo.voidLocation());
			}
			// 返回奸商携带的物品 //该函数返回数据为String[]类型;
			// 返回物品所需要的杜卡德金币 //该函数返回数据为int[]类型;
			// 返回物品所需要的现金 //该函数返回数据为int[]类型;

		}).start();

		panel.add(label);
		panel.add(textarea);
		/*
		 * panel.add(label1);
		 * panel.add(textarea1);
		 * panel.add(label2);
		 * panel.add(textarea2);
		 */

		return panel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}