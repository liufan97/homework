//���̵�

package R9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Hld extends JFrame {
	public static void main(String[] args) {
		new Hld();
	}
	static boolean bl  = true;
	public Hld(){
		this.setLayout(null);
		this.setBounds(100,100,600,400);
		this.setVisible(true);
		JLabel jl = new JLabel();
		jl.setOpaque(true);
		jl.setBounds(100,100,90,80);
		//jl.setBackground(Color.red);//���ñ�����ɫ
		this.add(jl);
		//
		JButton jb = new JButton();
		jb.setBounds(110,190,60,40);
		jb.setText("��ʼ");
		this.add(jb);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){
						//�ж�
						if(jb.getText().equals("ֹͣ")){
							bl = false;
						}
						jb.setText("ֹͣ");
						while(bl){
							try {
								jl.setBackground(Color.red);
								Thread.sleep(1600);//ֹͣһ��ʱ��
								jl.setBackground(Color.yellow);
								Thread.sleep(500);
								jl.setBackground(Color.green);
								Thread.sleep(1600);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						
					}
				}).start();;
			}
		});
	}
}







