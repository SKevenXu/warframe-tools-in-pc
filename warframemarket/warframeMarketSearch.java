package warframemarket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.event.DocumentEvent;

import Main.Main;
import java.util.regex.*;

import program.getItemUrlName.itemurlget;
import program.getWeaponPlat.getplat;

public class warframeMarketSearch {
    private static JPanel panel = null;
    private static JFrame frame = null;

    public static JPanel secondView() {
//TODO
        // 导入frame
        frame = Main.returnJFrame();

        panel = new JPanel();

        // 添加新的panel
        frame.add(panel);

        panel.setBounds(-1, 31, 700, 500);
        panel.setLayout(null);

        JLabel label = new JLabel("中文名称:");

        // label.setFont(new Font("宋体", Font.PLAIN, 20));
        label.setBounds(490, 20, 80, 30);

        JTextArea textarea = new JTextArea("");
        textarea.setBounds(20, 20, 430, 297);
        textarea.setEditable(false);
        // textarea.setFont(new Font("宋体", Font.PLAIN, 20));
        JTextArea textarea1 = new JTextArea("");
        textarea1.setBounds(520, 140, 140, 200);
        textarea1.setEditable(false);

        JTextField textfield = new JTextField();
        textfield.setBounds(550, 20, 100, 30);

        textfield.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                textarea1.setText("");

                try {
                    itemurlget itemurl = new itemurlget();
                    Document doc = e.getDocument();
                    String s = doc.getText(0, doc.getLength());
                    String[] list = itemurl.getitemname().clone();
                    Pattern pattern = Pattern.compile(s, Pattern.CASE_INSENSITIVE);// 该处决定大小写是否敏感
                    
                    for (int i = 0; i < list.length; i++) {
                        Matcher matcher = pattern.matcher(list[i]);
                        if (matcher.find()) {
                            textarea1.append(list[i]+"\n");
                            //System.out.println(list[i]);
                        }

                    }

                } catch (BadLocationException e1) {

                    e1.printStackTrace();
                }
                

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textarea1.setText("");

                try {
                    itemurlget itemurl = new itemurlget();
                    Document doc = e.getDocument();
                    String s = doc.getText(0, doc.getLength());
                    String[] list = itemurl.getitemname().clone();
                    Pattern pattern = Pattern.compile(s, Pattern.CASE_INSENSITIVE);// 该处决定大小写是否敏感
                    
                    for (int i = 0; i < list.length; i++) {
                        Matcher matcher = pattern.matcher(list[i]);
                        if (matcher.find()) {
                            textarea1.append(list[i]+"\n");
                            //System.out.println(list[i]);
                        }

                    }

                } catch (BadLocationException e1) {

                    e1.printStackTrace();
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

        });

        JButton button = new JButton("applet");
        button.setBounds(560, 100, 80, 25);

        class rivensearch implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textarea.setText("loading......");
                new Thread(() -> {

                    try {
                        getplat getplat = new getplat();
                        itemurlget itemurl = new itemurlget();
                        itemurl.items_detail("localfile\\items_urlname.json");
                        String temp[][] = getplat.plat_detail(itemurl.getoneurlname(textfield.getText())).clone();
                        textarea.setText("");
                        int num;
                        textarea.append("你选择的是:\t" + textfield.getText() + "\n");
                        // textarea.append(textfield.getText()+"\t的url名称是\t"+itemurl.getonename(textarea.getText())+"\n");
                        for (num = 0; num < temp.length; ++num) {
                            if (temp[num][2].hashCode() != "offline".hashCode()) {
                                textarea.append("plat:\t" + temp[num][0] + "\n");
                                // textarea.append(temp[num][1]+"\n");
                                textarea.append("status:\t" + temp[num][2] + "\n");
                                textarea.append("ingame name:\t" + temp[num][3] + "\n");
                                textarea.append("copy this:/w " + temp[num][3] + "Hi! I want to buy: "
                                        + itemurl.getoneurlname(textfield.getText()) + " for " + temp[num][0]
                                        + " platinum. (warframe.market)" + "\n\n");
                            }
                        }

                        num = Integer.valueOf(temp[0][0]);

                        for (int i = 0; i < temp.length; ++i) {
                            if (Integer.valueOf(temp[i][0]) < num && temp[i][2].hashCode() != "offline".hashCode()) {
                                num = Integer.valueOf(temp[i][0]);
                            }
                        }

                        System.out.println(num);
                    } catch (Exception n) {
                        textarea.setText("");
                        textarea.append("don't find the items,Please retry!");
                    }
                }).start();

            }
        }

        button.addActionListener(new rivensearch());

        JScrollPane sc = new JScrollPane();
        JScrollPane sc1 = new JScrollPane();
        sc.setViewportView(textarea);
        sc.setBounds(20, 20, 430, 297);

        sc1.setViewportView(textarea1);
        sc1.setBounds(textarea1.getBounds());

        panel.add(textfield);
        panel.add(sc1);
        panel.add(sc);
        panel.add(label);

        panel.add(button);
        return panel;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
