import javax.swing.*;

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
        String [] arr={"m","cm","mm","km","inch","mile"};
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
        l3.setBounds(150,160,100,40);

        panel.add(button1);
        panel.add(t1);
        panel.add(b1);
        panel.add(l1);
        panel.add(b2);
        panel.add(l2);
    }
    public ConverterFrame(){
        initializeComp();
        setContentPane(panel);
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
