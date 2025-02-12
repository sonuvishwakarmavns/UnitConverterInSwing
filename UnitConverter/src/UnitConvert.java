import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UnitConvert extends JFrame{
    JLabel unitmm,unitfeet,unitmeter;
    JTextField unitmmtf;
    JButton Calculate,Clear;
    //Constructor
    UnitConvert(String s1){
        super(s1);

    }
    UnitConvert(){
        

    }

    public void addComponent(){
       
        unitmm=new JLabel("Unit in mm :");
        unitmmtf=new JTextField();

        
        add(unitmm);
        unitmm.setBounds(50,100,100,20);
        add(unitmmtf);
        unitmmtf.setBounds(150,100,100,20);
        unitfeet=new JLabel("Unit in Feet is: ");
        unitmeter=new JLabel("Unit in Meter is: ");
        add(unitfeet);
        unitfeet.setBounds(50,200,200,20);
        add(unitmeter);
        unitmeter.setBounds(50,300,200,20);
        
        Calculate=new JButton("Calculate");
        Clear=new JButton("Clear");
        
        add(Calculate);
        add(Clear);

        Calculate.setBounds(50,400,100,20);
        Clear.setBounds(250,400,80,20);
        Calculate.addActionListener(new Cal());
        Clear.addActionListener(new Clear());

    }
    public double calfeet(double y){
        double feetval=(y/304.8);
        return feetval;
    }
    public double calmeter(double y){
        double meter=(y/1000);
        return meter;
    }

    public static void main(String args[]){
        UnitConvert uc=new UnitConvert("Unit Converter App");
        uc.setVisible(true);
        uc.setSize(600,500);
        uc.addComponent();
        uc.setLayout(null);
        uc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    class Cal implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1=unitmmtf.getText();
            double x=Double.parseDouble(s1);
            double feetvalue=calfeet(x);
            unitfeet.setText("Value in feet : "+feetvalue);

            String s2=unitmmtf.getText();
            double y=Double.parseDouble(s2);
            double Metervalue=calmeter(y);
            unitmeter.setText("Value in feet : "+Metervalue);
        }
    }

    class Clear implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent e) {
           
            unitmmtf.setText("");

            unitfeet.setText("");

           
            unitmeter.setText("");
        }
    }
    
}

