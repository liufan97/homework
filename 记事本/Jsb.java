//记事本
package R8;

import javax.swing.*;
import java.io.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Jsb extends JFrame {
	
	public Jsb(){
		this.setLayout(null);
		this.setTitle("记事本");
		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(0,0,300,30);
		this.add(jmb);
		//jmb.setVisible(true);
		//
		JMenu jm = new JMenu();
		jm.setText("文件");
		jmb.add(jm);
		jm.setFont(new java.awt.Font("Dialog",1,30));
		//jm.setVisible(true);
		jm.setBounds(0,0,80,30);
		//
		JMenu jm1 = new JMenu();
		jm1.setText("编辑");
		jm1.setFont(new java.awt.Font("Dialog",1,30));
		jm1.setBounds(0,0,80,30);
		jmb.add(jm1);
		//
		JMenuItem jmi1 = new JMenuItem();
		jm1.add(jmi1);
		jmi1.setText("删除");
		jmi1.setFont(new java.awt.Font("Dialong",1,25));
		//
		JMenuItem jmi = new JMenuItem();
		jmi.setText("新建");
		jmi.setFont(new java.awt.Font("Dialog",1,25));
		jmi.setBounds(0,0,80,20);
		//jmi.setVisible(true);
		jm.add(jmi);
		//
		JMenuItem jmi2 = new JMenuItem();
		jmi2.setText("保存");
		jmi2.setFont(new java.awt.Font("Dialog",1,25));
		jmi2.setBounds(0,0,80,20);
		jm.add(jmi2);
		//
		JTextArea jta = new JTextArea();
		jta.setText("请输入内容");
		jta.setFont(new java.awt.Font("Dialog",1,22));
		this.add(jta);
		jta.setBounds(40,40,400,100);
		this.setBounds(550,200,800,500);
		//
		jmi2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String s = jta.getText();
				File f = new File("D:/files/du.txt");
				try {
					FileWriter fw = new FileWriter(f);
					fw.write(s);
					jta.setText("保存成功");
					fw.close();
					System.out.println("保存成功");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Jsb();
	}
	
}








