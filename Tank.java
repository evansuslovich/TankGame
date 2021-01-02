import javax.swing.*; 
import java.awt.*; 

public class Tank extends JFrame {
    private static final long serialVersionUID = 1L;

    JPanel panel = new JPanel(); 
    JLabel label = new JLabel(); 

    public Tank(){
        setTitle("Tank Game"); 
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setBackground(Color.LIGHT_GRAY); 

        ImageIcon icon = new ImageIcon("tankIMG.png"); 
        label.setIcon(icon); 

        panel.add(label); 

        add(panel); 
        setVisible(true); 
    }
    public static void main(String[] args){
        new Tank(); 
    }
}