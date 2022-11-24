import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InfoGui implements ActionListener {
	static String a1;
	static String a2;
	JFrame k;
	JButton b;
	JLabel l;
	JPanel p;
	JTextField fieldOne;
	JTextField fieldTwo;
	public InfoGui(){
		 k = new JFrame();
		 b=new JButton("click");
		 l=new JLabel("Number of Clicks");//creating instance of JButton 
		 p=new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		p.setLayout(new GridLayout(0,1));
		
//		b.setBounds(130,100,100, 40);
		fieldOne = new JTextField();
	    fieldTwo = new JTextField();
	    p.add(fieldOne);
	    p.add(fieldTwo);
		p.add(b);
		b.addActionListener(this);
		p.add(l);
		k.add(p,BorderLayout.CENTER);
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		k.setSize(400,500);
		
//		k.setLayout(null);
		
		k.pack();
		k.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InfoGui() ;
		System.out.print(a1);

	}
	

    
	@Override
	public void actionPerformed(ActionEvent e) {
		String valOne = fieldOne.getText();
        a1=valOne;
        
        String valTwo = fieldTwo.getText();
        a2=valTwo;
        String k=(a1+" "+a2);
        l.setText("My name is : " +k);
        
		
	}

}
