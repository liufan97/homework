//QQ
package R8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dlk extends JFrame {

	static String s1,s2;
	public Dlk(){
		this.setBounds(200,200,400,300);
		this.setLayout(null);
		JLabel jl = new JLabel();
		jl.setText("QQ");
		jl.setBounds(60,30,60,60);
		this.add(jl);
		jl.setFont(new java.awt.Font("Dialog",1,34));
		jl.setForeground(Color.red);
		this.setVisible(true);
		//
		JLabel jl1 = new JLabel();
		jl1.setText("’À∫≈£∫");
		this.add(jl1);
		jl1.setBounds(30,80,40,40);
		jl1.setVisible(true);
		//
		JTextArea jta = new JTextArea();
		jta.setBounds(68,88,110,25);
		this.add(jta);
		jta.setText("«Î ‰»Î’À∫≈");
		jta.setVisible(true);
		//
		JLabel jl2 = new JLabel();
		jl2.setText("√‹¬Î£∫");
		jl2.setBounds(30, 110,40,40);
		this.add(jl2);
		jl2.setVisible(true);
		//
		JTextArea jta1 = new JTextArea();
		jta1.setBounds(68,118,110,25);
		jta1.setText("«Î ‰»Î√‹¬Î");
		this.add(jta1);
		jta1.setVisible(true);
		//
		JButton jb = new JButton();
		jb.setText("µ«¬Ω");
		jb.setBounds(105,155,80,30);
		this.add(jb);
		this.setVisible(true);
		//
		jb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//≈–∂œ
					if(jta.getText().equals(s1)){
						if(jta1.getText().equals(s2)){
							jb.setText("µ«¬Ω≥…π¶");
						}else{
							jta1.setText("√‹¬Î¥ÌŒÛ");
						}
					}else{
						jta.setText("√ª”–¥À’À∫≈");
					}
				}
			}
		);
		//
		JButton jb1 = new JButton();
		jb1.setText("◊¢≤·");
		jb1.setBounds(40, 155, 60, 30);
		this.setVisible(true);
		this.add(jb1);
		//
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame jf = new JFrame();
				jf.setLayout(null);
				jf.setBounds(90,90,600,500);
				jf.setVisible(true);
				//
				JLabel jl1 = new JLabel();
				jl1.setText("’À∫≈£∫");
				jf.add(jl1);
				jl1.setBounds(30,80,40,40);
				jl1.setVisible(true);
				//
				JTextArea jta = new JTextArea();
				jta.setBounds(68,88,110,25);
				jf.add(jta);
				jta.setText("«Î ‰»Î’À∫≈");
				jta.setVisible(true);
				//
				JLabel jl2 = new JLabel();
				jl2.setText("√‹¬Î£∫");
				jl2.setBounds(30, 110,40,40);
				jf.add(jl2);
				jl2.setVisible(true);
				//
				JTextArea jta1 = new JTextArea();
				jta1.setBounds(68,118,110,25);
				jta1.setText("«Î ‰»Î√‹¬Î");
				jf.add(jta1);
				jta1.setVisible(true);
				//
				JButton jb1 = new JButton();
				jb1.setText("◊¢≤·");
				jf.add(jb1);
				jb1.setBounds(110,160,100,30);
				jb1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent a){
						s1 = jta.getText();
						s2 = jta1.getText();
						jb1.setText("◊¢≤·≥…π¶");
					}
				});
			}
		});
	}
	
	public static void main(String[] args) {
		new Dlk();
		
	}

}
