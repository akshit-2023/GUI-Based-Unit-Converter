import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterFrame extends JFrame {
    private JPanel panel;
    private JTextField t1;
    private JComboBox b1;
    private JComboBox b2;
    private JLabel l1;
    private JLabel l2;
    private JButton button1;
    private JLabel l3;

    public void initializeComp(){
        String [] arr={"m","km","inch","mile"};
        panel.setLayout(null);
        t1.setBounds(40,80,100,30);
        b1.setBounds(140,80,100,30);
        l1.setBounds(260,80,100,30);
        b2.setBounds(300,80,100,30);
        for(int i=0;i<arr.length;i++){
            b1.addItem(arr[i]);
            b2.addItem(arr[i]);
        }
        button1.setBounds(190,130,100,30);
        l2.setBounds(190,20,100,20);
        l3.setBounds(160,160,400,40);

        panel.add(button1);
        panel.add(t1);
        panel.add(b1);
        panel.add(l1);
        panel.add(b2);
        panel.add(l2);
        panel.add(l3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a=Double.parseDouble(t1.getText());
                String from=b1.getSelectedItem().toString();
                String to=b2.getSelectedItem().toString();
                Double b;
                //Case if from="m"
                if(from.equals("m")){
                    if(to.equals("m")){
                        l3.setText("already in metre");
                    }
                    else if(to.equals("km")){
                        b=a*(0.001);
                        l3.setText("Conversion is: "+b+" km");
                    }
                    else if(to.equals("inch")){
                        b=a*(39.37);
                        l3.setText("Conversion is: "+b+" inches");
                    }
                    else if(to.equals("mile")){
                        b=a*(0.000621);
                        l3.setText("Conversion is: "+b+" miles");
                    }
                }

                //Case if from="km"
                else if(from.equals("km")){
                    if(to.equals("km")){
                        l3.setText("already in kilometre");
                    }
                    else if(to.equals("m")){
                        b=a*(1000);
                        l3.setText("Conversion is: "+b+" m");
                    }
                    else if(to.equals("inch")){
                        b=a*(39370.079);
                        l3.setText("Conversion is: "+b+" inches");
                    }
                    else if(to.equals("mile")){
                        b=a*(0.621);
                        l3.setText("Conversion is: "+b+" miles");
                    }
                }
                //Case if from="inch"
                else if(from.equals("inch")){
                    if(to.equals("inch")){
                        l3.setText("already in inch");
                    }
                    else if(to.equals("m")){
                        b=a*(0.0254);
                        l3.setText("Conversion is: "+b+" m");
                    }
                    else if(to.equals("km")){
                        b=a*(2.54)*(Math.pow(10,-5));
                        l3.setText("Conversion is: "+b+" km");
                    }
                    else if(to.equals("mile")){
                        b=a*1.578*(Math.pow(10,-5));
                        l3.setText("Conversion is: "+b+" miles");
                    }
                }
                //Case if from="mile"
                else if(from.equals("mile")){
                    if(to.equals("mile")){
                        l3.setText("already in mile");
                    }
                    else if(to.equals("m")){
                        b=a*1609.344;
                        l3.setText("Conversion is: "+b+" m");
                    }
                    else if(to.equals("km")){
                        b=a*1.609;
                        l3.setText("Conversion is: "+b+" km");
                    }
                    else if(to.equals("inch")){
                        b=a*63360;
                        l3.setText("Conversion is: "+b+" inches");
                    }
                }//end of cases
            }
        });
    }
    public ConverterFrame(){
        initializeComp();
        setContentPane(panel);
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}