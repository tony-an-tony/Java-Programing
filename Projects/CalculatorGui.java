package oopj24lab71;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGui extends JFrame implements ActionListener{
	
	
	JButton  b1,b2,b3,badd,b4,b5,b6,bsub,b7,b8,b9,bmul,b0,bclr,beql,bdiv;
	JTextField jtf;
	int operator;
	double a,b,r;
	
	
	CalculatorGui(){
		operator=0;
		JFrame f=new JFrame("Calculator");
		operator=0;
		
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		badd=new JButton("+");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		bsub=new JButton("-");
		b8=new JButton("8");
		b9=new JButton("9");
		bmul=new JButton("*");
		b0=new JButton("0");
		bclr=new JButton("C");
		beql=new JButton("=");
		bdiv=new JButton("/");
		jtf = new JTextField();
	
		     
		
		b1.setBounds(10,50,100,100);
		b2.setBounds(110,50,100,100);
		b3.setBounds(210,50,100,100);
		badd.setBounds(310,50,100,100);
		
		b4.setBounds(10,150,100,100);
		b5.setBounds(110,150,100,100);
		b6.setBounds(210,150,100,100);
		bsub.setBounds(310,150,100,100);
		
		b7.setBounds(10,250,100,100);
		b8.setBounds(110,250,100,100);
		b9.setBounds(210,250,100,100);
		bmul.setBounds(310,250,100,100);
		
		b0.setBounds(10,350,100,100);
		bclr.setBounds(110,350,100,100);
		beql.setBounds(210,350,100,100);
		bdiv.setBounds(310,350,100,100);
		jtf.setBounds(0,0,420,40);
		
		f.add(jtf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(badd);
		
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bsub);
		
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bmul);
		
		f.add(b0);
		f.add(bclr);
		f.add(beql);
		f.add(bdiv);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		badd.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bsub.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bmul.addActionListener(this);
		b0.addActionListener(this);
		bclr.addActionListener(this);
		beql.addActionListener(this);
		bdiv.addActionListener(this);
		
		f.setSize(420,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		
	}

	public static void main(String[] args) {
		new CalculatorGui();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) jtf.setText(jtf.getText()+"1");
		if(e.getSource()==b2) jtf.setText(jtf.getText()+"2");
		if(e.getSource()==b3) jtf.setText(jtf.getText()+"3");
		if(e.getSource()==b4) jtf.setText(jtf.getText()+"4");
		if(e.getSource()==b5) jtf.setText(jtf.getText()+"5");
		if(e.getSource()==b6) jtf.setText(jtf.getText()+"6");
		if(e.getSource()==b7) jtf.setText(jtf.getText()+"7");
		if(e.getSource()==b8) jtf.setText(jtf.getText()+"8");
		if(e.getSource()==b9) jtf.setText(jtf.getText()+"9");
		if(e.getSource()==b0) jtf.setText(jtf.getText()+"0");
		
		
		if(e.getSource() == badd) {
			a=Double.parseDouble(jtf.getText());
			operator=1;
			jtf.setText("");
		}
		if(e.getSource() == bsub) {
			a=Double.parseDouble(jtf.getText());
			operator=2;
			jtf.setText("");
		}
		if(e.getSource() == bmul) {
			a=Double.parseDouble(jtf.getText());
			operator=3;
			jtf.setText("");
		}if(e.getSource() == bdiv) {
			a=Double.parseDouble(jtf.getText());
			operator=4;
			jtf.setText("");
		}if(e.getSource() == bclr) {
			jtf.setText("");
		}
		if(e.getSource() == beql) {
			b=Double.parseDouble(jtf.getText());
			switch (operator) {
			case 1: r=a+b;jtf.setText(String.valueOf(r));break;
			case 2: r=a-b;jtf.setText(String.valueOf(r));break;
			case 3: r=a*b;jtf.setText(String.valueOf(r));break;
			case 4:
				if(b==0) {
					jtf.setText("division impossible");
				}else {
					r=a/b;jtf.setText(String.valueOf(r));
				}
				break;
			case 0:
				jtf.setText("nothing selected");operator=0;break;
			default:jtf.setText("invalid option");
				
			}
		}
	}
}