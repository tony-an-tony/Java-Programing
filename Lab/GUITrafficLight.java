package oopj24lab71;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GUITrafficLight extends JFrame implements ActionListener{
			JRadioButton r1,r2,r3;
			
			
		JFrame f=new JFrame("TrafficLight");		
		ButtonGroup bg;
		Color red_C,yellow_C,green_C;
		
	
	GUITrafficLight(){
	
		
		red_C=f.getBackground();
		yellow_C=f.getBackground();
		green_C=f.getBackground();
			
		
		
		r1=new JRadioButton("Red");
		r2=new JRadioButton("Yellow");
		r3=new JRadioButton("Green");
		
		r1.setBounds(50, 20, 100, 30);
		r2.setBounds(200, 20, 100, 30);
		r3.setBounds(350, 20, 100, 30);
		
		
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		add(r1);
		add(r2);
		add(r3);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
			new GUITrafficLight();
		
	}

	public void actionPerformed(ActionEvent e) {
		if (r1.isSelected()){
			red_C=Color.red;
			yellow_C=f.getBackground();
			green_C=f.getBackground();
		}
		else if (r2.isSelected()){
			yellow_C=Color.yellow;
			red_C=f.getBackground();
			green_C=f.getBackground();
			
		}
		else if (r3.isSelected()){
			green_C=Color.green;
			yellow_C=f.getBackground();
			red_C=f.getBackground();
			
		}
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);//this line calls the super class implementation of paint method which clears
		//the previous drawing and prepares the components for fresh drawing
		g.drawOval(50,100 ,50,50);
		g.drawOval(50,200 ,50,50);
		g.drawOval(50,300 ,50,50);
		
		g.setColor(red_C);
		g.fillOval(50, 100, 50, 50);
		g.setColor(yellow_C);
		g.fillOval(50, 200, 50, 50);
		g.setColor(green_C);
		g.fillOval(50, 300, 50, 50);
		
		}

}
