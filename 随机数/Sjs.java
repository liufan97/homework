//随机数比较
package R8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sjs extends JFrame {
	public static void main(String[] args) {
		new Sjs();
	}
	public static String s1 = null;
	static boolean bl = true;//随机数循环
	public Sjs(){
		this.setLayout(null);
		this.setVisible(true);
		int i = 0;
		this.setBounds(100,100,600,500);
		//
		JTextArea jta = new JTextArea();
		this.add(jta);
		jta.setText("请输入数字");
		jta.setFont(new java.awt.Font("Dialog",1,20));
		jta.setBounds(100,0,110,30);
		//
		JButton jb = new JButton();
		jb.setBounds(50,50,60,30);
		this.add(jb);
		jb.setText("比较");
		//
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s = jta.getText();
				if(s.equals(s1)){
					jta.setText("相同");
				}else{
					jta.setText("不相同");
				}
				bl = false;
			}
		});
		//随机数
		JLabel jl = new JLabel();
		jl.setBounds(0,0,20,20);
		this.add(jl);
		while(bl){
			i = ((int)(Math.random()*96)+5);
			s1 = ""+i;
			jl.setText(s1);
		}
		
	}
}
