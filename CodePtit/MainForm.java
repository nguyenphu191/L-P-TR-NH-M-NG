
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MainForm extends JFrame{
    private JTextField tnum1,tnum2;
    private JButton btn;
    private JLabel lKetqua;
    public MainForm() {
        setTitle("Bai dau tien");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        add(new JLabel("So thu 1:"),gbc);
        tnum1=new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=0;
        add(tnum1,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        add(new JLabel("So thu 2:"),gbc);
        tnum2=new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=1;
        add(tnum2,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=2;
        btn=new JButton("Tong");
        add(btn,gbc);
        lKetqua=new JLabel("Tong:", JLabel.CENTER);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=2;
        add(lKetqua,gbc);
        btn.addActionListener(e->{
           
        });
    }
    public static void main(String[] args) {
        MainForm f=new MainForm();
        f.setVisible(true);
    }
}