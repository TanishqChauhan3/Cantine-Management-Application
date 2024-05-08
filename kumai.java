import java.awt.*;
import java.awt.event.*;

class ABC extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Font f1,f2,f3,f4;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	Checkbox cb1,cb2,cb3,cb4,cb5,rb1,rb2,rb3;
	Button b1,b2;
	CheckboxGroup group;
	ABC()
	{	
		f1=new Font("TimesNewRoman",Font.BOLD,50);
		f2=new Font("TimesNewRoman",Font.BOLD,30);
		f3=new Font("TimesNewRoman",Font.PLAIN,30);
		f4=new Font("TimesNewRoman",Font.BOLD,40);
		l1=new Label("Kumai Cantine");
		l1.setFont(f1);
		l1.setBounds(450,50,600,50);
		l2=new Label("1.Samosa @ 15");
		l2.setFont(f2);
		l2.setBounds(200,180,250,50);
		tf1=new TextField();
		tf1.setBounds(500,180,150,40);
		tf1.setFont(f3);
		tf2=new TextField();
		tf2.setBounds(700,180,150,40);
		tf2.setFont(f3);
		l3=new Label("Extra");
		l3.setFont(f4);
		l3.setBounds(980,130,200,50);
		cb1=new Checkbox("Paneer @ 5");
		cb1.setBounds(950,170,200,50);
		cb1.setFont(f3);
		cb2=new Checkbox("Cream @ 10");
		cb2.setBounds(950,220,200,50);
		cb2.setFont(f3);
		l4=new Label("2.Tea @ 10");
		l4.setBounds(200,230,250,50);
		l4.setFont(f2);
		tf3=new TextField();
		tf3.setBounds(500,230,150,40);
		tf3.setFont(f3);
		tf4=new TextField();
		tf4.setBounds(700,230,150,40);
		tf4.setFont(f3);
		l5=new Label("3.Coffee @ 20");
		l5.setBounds(200,280,250,50);
		l5.setFont(f2);
		tf5=new TextField();
		tf5.setBounds(500,280,150,40);
		tf5.setFont(f3);
		tf6=new TextField();
		tf6.setBounds(700,280,150,40);
		tf6.setFont(f3);
		cb3=new Checkbox("Dark @ 10");
		cb3.setBounds(950,270,200,50);
		cb3.setFont(f3);
		cb4=new Checkbox("Latte @ 10");
		cb4.setBounds(950,320,200,50);
		cb4.setFont(f3);
		/*
		cb5=new Checkbox("Latte @ 15");
		cb5.setBounds(950,370,200,50);
		cb5.setFont(f3);*/
		group=new CheckboxGroup();
		rb1=new Checkbox("Student 20%");
		rb1.setBounds(200,370,200,50);
		rb1.setFont(f2);
		rb2=new Checkbox("Staff 15%");
		rb2.setBounds(200,420,200,50);
		rb2.setFont(f2);
		rb3=new Checkbox("General 10%");
		rb3.setFont(f2);
		rb3.setBounds(200,470,200,50);
		rb1.setCheckboxGroup(group);
        rb2.setCheckboxGroup(group);
		rb3.setCheckboxGroup(group);
		l6=new Label("Total");
		l6.setBounds(450,370,100,50);
		l6.setFont(f2);
		l7=new Label("Discount");
		l7.setBounds(450,420,150,50);
		l7.setFont(f2);
		tf7=new TextField();
		tf7.setBounds(600,370,250,40);
		tf7.setFont(f3);
		tf8=new TextField();
		tf8.setBounds(600,420,250,40);
		tf8.setFont(f3);
		tf9=new TextField();
		tf9.setBounds(600,470,250,40);
		tf9.setFont(f3);
		l8=new Label("Amount");
		l8.setBounds(450,470,150,50);
		l8.setFont(f2);
		b1=new Button("Calculate Bill");
		b1.setFont(f2);
		b1.setBounds(400,550,300,40);
		b1.addActionListener(this);
		b2=new Button("Cancel");
		b2.addActionListener(this);
		b2.setFont(f2);
		b2.setBounds(730,550,200,40);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		add(tf8);
		add(tf9);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(rb1);
		add(rb2);
		add(rb3);
		add(b1);
		add(b2);
		setBackground(new Color(173, 216, 230));
		setSize(1920,1080);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf3.getText());
		int c=Integer.parseInt(tf5.getText());
		int g=0,h=0,i=0;
		if(ae.getSource()==b1)
		{		
			int d=a*15;
			if(cb1.getState()==true)
				d=a*20;
			
			int e=b*10;
			if(cb2.getState()==true)
				e=b*20;
			
			int f=c*20;
			if(cb3.getState()==true)
				f=c*30;
			else if(cb4.getState()==true)
				f=c*30;
			
			g=d+e+f;
			tf2.setText(String.valueOf(d));
			tf4.setText(String.valueOf(e));
			tf6.setText(String.valueOf(f));
			tf7.setText(String.valueOf(g));
			if(rb1.getState()==true)
			{
				h=(int)((20.0/100.0)*(g));
				tf8.setText(String.valueOf(h));
				
			}
			
			else if(rb2.getState()==true)
			{
				h=(int)((15.0/100.0)*(g));
				tf8.setText(String.valueOf(h));
				
			}
			
			else if(rb3.getState()==true)
			{
				h=(int)((10.0/100.0)*(g));
				tf8.setText(String.valueOf(h));

			}
				i=g-h;
				tf9.setText(String.valueOf(i));
		}
		
		if(ae.getSource()==b2)
		{
			tf1.setText(String.valueOf(0));
			tf3.setText(String.valueOf(0));
			tf5.setText(String.valueOf(0));
			tf7.setText(String.valueOf(0));
			tf8.setText(String.valueOf(0));
			tf9.setText(String.valueOf(0));
			tf2.setText(String.valueOf(0));
			tf4.setText(String.valueOf(0));
			tf6.setText(String.valueOf(0));
			/*group.clearSelection();
			rb1.setState(false);
			rb2.setState(false);
			rb3.setState(false);
			*/
		}
	}
	
	public static void main(String args[])
	{
		new ABC();
	}
}
