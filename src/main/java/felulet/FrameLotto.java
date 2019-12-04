package felulet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameLotto extends JFrame{

    private JTextField txtfldLottoszamok;
    private JButton bttnSorsol;
    private JPanel pnlAblak;
    public FrameLotto() {
        initComponents();
    }
    private void initComponents(){
        this.setTitle("Lotto");
        this.setSize(400, 350);
        this.setLocationRelativeTo(null); //középre igazít
        this.pnlAblak = (JPanel) this.getContentPane();
        this.pnlAblak.setLayout(null);
        this.txtfldLottoszamok = new JTextField();
        this.txtfldLottoszamok.setLocation(20, 20);
        this.txtfldLottoszamok.setSize(250, 20);
        this.txtfldLottoszamok.setText("sajt");
        this.pnlAblak.add(this.txtfldLottoszamok);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        
        
        this.setVisible(true);
    }
    
}
