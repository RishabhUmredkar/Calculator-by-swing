import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Text1 {
public static void main(String[] args)
{
	JFrame frame=new JFrame("Asterisc.in");
		
		JTextField tx=new JTextField();
		tx.setBounds(250,50,100, 40);
		
		JTextField tx1=new JTextField();
		tx1.setBounds(380,50,100, 40);
					
		JButton b =new JButton("Add");
		b.setBounds(130,100,100,40);
		
		JLabel addd=new JLabel();
		addd.setBounds(130,150,100, 40);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(tx.getText());
				int m=Integer.parseInt(tx1.getText());
				addd.setText("Add="+(n+m));
				
			}
		});
		
		JButton s =new JButton("Sub");
		s.setBounds(250,100,100,40);
		
		JLabel sub=new JLabel();
		sub.setBounds(250,150,100, 40);
		
		s.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(tx.getText());
				int m=Integer.parseInt(tx1.getText());
				addd.setText("Sub="+(n-m));
				
			}
		});
		
		JButton m =new JButton("Multiply");
		m.setBounds(380,100,100,40);
		
		JLabel multiply=new JLabel();
		multiply.setBounds(300,150,100, 40);
		
		m.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(tx.getText());
				int c=Integer.parseInt(tx1.getText());
				addd.setText("Multiply="+(n*c));
				
			}
		});
		
		
		JButton d =new JButton("Divide");
		d.setBounds(500,100,100,40);
		
		JLabel div=new JLabel();
		div.setBounds(300,150,100, 40);
		
		d.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(tx.getText());
				int c=Integer.parseInt(tx1.getText());
				addd.setText("Division="+(n/c));
				
			}
		});
		
		
	    frame.add(tx);
		frame.add(tx1);
		frame.add(addd);
		
		
		frame.add(b);
		frame.add(sub);
		frame.add(s);
		frame.add(multiply);
		frame.add(m);
		
		frame.add(d);
		frame.add(div);
		frame.setSize(700,300);
		frame.setLayout(null);
        frame.setVisible(true);		
		}
}
