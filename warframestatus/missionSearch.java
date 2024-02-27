package warframestatus;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Main.Main;
import program.Arbitration.arbitration;
import program.fissures.fissures;
import program.fissures.fissures_translate;

public class missionSearch {
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

        JLabel label = new JLabel("指定的条件:");
        label.setBounds(20, 20, 100, 30);
        JLabel label1 = new JLabel("注意:1为古纪,2为前纪,3为中纪,4为后纪");
        label1.setBounds(20, 400, 500, 30);
        /*
         * JLabel label1 = new JLabel("钢铁裂隙任务:");
         * label1.setBounds(245, 20, 100, 30);
         * JLabel label2 = new JLabel("九重天裂隙任务:");
         * label2.setBounds(470, 20, 100, 30);
         */

        Font font = new Font(null, 0, 12);
        JTextArea textarea = new JTextArea("loading.....");
        textarea.setBounds(20, 45, 650, 100);
        textarea.setFont(font);
        textarea.setOpaque(false);
        textarea.setEditable(false);

        JButton button = new JButton("applet");
        button.setBounds(550, 160, 100, 30);
        JButton button1 = new JButton("start");
        button1.setBounds(550, 200, 100, 30);

        JCheckBox missiontype = new JCheckBox("仲裁");
        JCheckBox missiontype1 = new JCheckBox("普通裂隙");
        JCheckBox missiontype2 = new JCheckBox("九重天裂隙");
        JCheckBox missiontype3 = new JCheckBox("钢铁裂隙");
        missiontype.setBounds(20, 160, 50, 30);
        missiontype1.setBounds(20, 200, 80, 30);
        missiontype2.setBounds(20, 240, 100, 30);
        missiontype3.setBounds(20, 280, 80, 30);

        JCheckBox missionnode = new JCheckBox("防御");
        JCheckBox missionnode1 = new JCheckBox("生存");
        JCheckBox missionnode2 = new JCheckBox("歼灭");
        JCheckBox missionnode3 = new JCheckBox("拦截");
        JCheckBox missionnode4 = new JCheckBox("古纪");
        JCheckBox missionnode5 = new JCheckBox("前纪");
        JCheckBox missionnode6 = new JCheckBox("中纪");
        JCheckBox missionnode7 = new JCheckBox("后纪");
        missionnode.setBounds(200, 160, 50, 30);
        missionnode1.setBounds(200, 200, 80, 30);
        missionnode2.setBounds(200, 240, 100, 30);
        missionnode3.setBounds(200, 280, 80, 30);

        missionnode4.setBounds(380, 160, 50, 30);
        missionnode5.setBounds(380, 200, 50, 30);
        missionnode6.setBounds(380, 240, 50, 30);
        missionnode7.setBounds(380, 280, 50, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textarea.setText("");
                if (missiontype.isSelected() == true) {
                    textarea.append(missiontype.getText() + "\t");
                }
                if (missiontype1.isSelected() == true) {
                    textarea.append(missiontype1.getText() + "\t");
                }
                if (missiontype2.isSelected() == true) {
                    textarea.append(missiontype2.getText() + "\t");
                }
                if (missiontype3.isSelected() == true) {
                    textarea.append(missiontype3.getText() + "\t");
                }
                if (missionnode.isSelected() == true) {
                    textarea.append(missionnode.getText() + "\t");
                }
                if (missionnode1.isSelected() == true) {
                    textarea.append(missionnode1.getText() + "\t");
                }
                if (missionnode2.isSelected() == true) {
                    textarea.append(missionnode2.getText() + "\t");
                }
                if (missionnode3.isSelected() == true) {
                    textarea.append(missionnode3.getText() + "\t");
                }
                if (missionnode4.isSelected() == true) {
                    textarea.append(missionnode4.getText() + "\t");
                }
                if (missionnode5.isSelected() == true) {
                    textarea.append(missionnode5.getText() + "\t");
                }
                if (missionnode6.isSelected() == true) {
                    textarea.append(missionnode6.getText() + "\t");
                }

            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textarea.append("\nstarting.....\n");
                new Thread(() -> {
                    fissures fi = new fissures();
                    arbitration ar = new arbitration();
                    fissures_translate ft = new fissures_translate();

                    for (int j = 0; j < 100; j++) {
                        if (missiontype.isSelected() == true) {
                            if (missionnode.isSelected() == true) {
                                if (ft.fissure_translate(ar.arbittype()).hashCode() == missionnode.getText()
                                        .hashCode()) {
                                    JOptionPane.showMessageDialog(null,
                                            "仲裁\t" + ar.arbittype() + "出来了！\n" + "还有\t" + ar.arbittime());
                                    return;
                                }
                            }
                            if (missionnode1.isSelected() == true) {
                                if (ft.fissure_translate(ar.arbittype()).hashCode() == missionnode1.getText()
                                        .hashCode()) {
                                    JOptionPane.showMessageDialog(null,
                                            "仲裁\t" + ar.arbittype() + "出来了！\n" + "还有\t" + ar.arbittime());
                                    return;
                                }
                            }
                            if (missionnode2.isSelected() == true) {
                                if (ft.fissure_translate(ar.arbittype()).hashCode() == missionnode2.getText()
                                        .hashCode()) {
                                    JOptionPane.showMessageDialog(null,
                                            "仲裁\t" + ar.arbittype() + "出来了！\n" + "还有\t" + ar.arbittime());
                                    return;
                                }
                            }
                            if (missionnode3.isSelected() == true) {
                                if (ft.fissure_translate(ar.arbittype()).hashCode() == missionnode3.getText()
                                        .hashCode()) {
                                    JOptionPane.showMessageDialog(null,
                                            "仲裁\t" + ar.arbittype() + "出来了！\n" + "还有\t" + ar.arbittime());
                                    return;
                                }
                            }

                        }
                        if (missiontype1.isSelected() == true) {
                            for (int i = 0; i < fi.fissure_alltype().length; i++) {
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 1
                                        && missionnode4.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 2
                                        && missionnode5.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 3
                                        && missionnode6.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 4
                                        && missionnode7.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "普通裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                            }

                        }
                        if (missiontype2.isSelected() == true) {
                            for (int i = 0; i < fi.fissure_alltype().length; i++) {
                                if (fi.fissure_allishard()[i] == true && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 1
                                        && missionnode4.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == true && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 2
                                        && missionnode5.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == true && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 3
                                        && missionnode6.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == true && fi.fissure_allisStorm()[i] == false
                                        && fi.fissure_alltierNum()[i] == 4
                                        && missionnode7.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "钢铁裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                            }

                        }
                        if (missiontype3.isSelected() == true) {
                            for (int i = 0; i < fi.fissure_alltype().length; i++) {
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == true
                                        && fi.fissure_alltierNum()[i] == 1
                                        && missionnode4.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == true
                                        && fi.fissure_alltierNum()[i] == 2
                                        && missionnode5.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == true
                                        && fi.fissure_alltierNum()[i] == 3
                                        && missionnode6.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                                if (fi.fissure_allishard()[i] == false && fi.fissure_allisStorm()[i] == true
                                        && fi.fissure_alltierNum()[i] == 4
                                        && missionnode7.isSelected() == true) {
                                    if (missionnode.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode1.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode1
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode2.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode2
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                    if (missionnode3.isSelected() == true) {
                                        if (ft.fissure_translate(fi.fissure_alltype()[i]).hashCode() == missionnode3
                                                .getText()
                                                .hashCode()) {
                                            JOptionPane.showMessageDialog(null, "九重天裂隙\t" + fi.fissure_alltierNum()[i]
                                                    + "  " + fi.fissure_alltype()[i] + "出来了！\n" + "还有\t"
                                                    + fi.fissure_alleta()[i]);
                                            return;
                                        }
                                    }
                                }
                            }

                        }
                        try {
                            Thread.sleep(10000);
                        } catch (Exception k) {
                            System.out.println("while have worrn" + k);
                        }
                    }

                }).start();

            }
        });

        JScrollPane sc = new JScrollPane();
        sc.setViewportView(textarea);
        sc.setBounds(textarea.getBounds());
        // sc.setOpaque(false);
        panel.add(missiontype);
        panel.add(missiontype1);
        panel.add(missiontype2);
        panel.add(missiontype3);
        panel.add(missionnode);
        panel.add(missionnode1);
        panel.add(missionnode2);
        panel.add(missionnode3);
        panel.add(missionnode4);
        panel.add(missionnode5);
        panel.add(missionnode6);
        panel.add(missionnode7);
        panel.add(label);
        panel.add(label1);
        panel.add(button);
        panel.add(button1);
        panel.add(sc);
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