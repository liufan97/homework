//������Ƚ�
package R8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sjs extends JFrame {
	public static void main(String[] args) {
		new Sjs();
	}
	public static String s1 = null;
	static boolean bl = true;//�����ѭ��
	public Sjs(){
		this.setLayout(null);
		this.setVisible(true);
		int i = 0;
		this.setBounds(100,100,600,500);
		//
		JTextArea jta = new JTextArea();
		this.add(jta);
		jta.setText("����������");
		jta.setFont(new java.awt.Font("Dialog",1,20));
		jta.setBounds(100,0,110,30);
		//
		JButton jb = new JButton();
		jb.setBounds(50,50,60,30);
		this.add(jb);
		jb.setText("�Ƚ�");
		//
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s = jta.getText();
				if(s.equals(s1)){
					jta.setText("��ͬ");
				}else{
					jta.setText("����ͬ");
				}
				bl = false;
			}
		});
		//�����
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
