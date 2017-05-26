//∫Ï¬Ãµ∆

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
		//jl.setBackground(Color.red);//…Ë÷√±≥æ∞—’…´
		this.add(jl);
		//
		JButton jb = new JButton();
		jb.setBounds(110,190,60,40);
		jb.setText("ø™ º");
		this.add(jb);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){
						//≈–∂œ
						if(jb.getText().equals("Õ£÷π")){
							bl = false;
						}
						jb.setText("Õ£÷π");
						while(bl){
							try {
								jl.setBackground(Color.red);
								Thread.sleep(1600);//Õ£÷π“ª∂Œ ±º‰
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







