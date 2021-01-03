import javax.swing.*; 
import java.awt.event.*; 

public class Tank extends JFrame implements KeyListener{
    private static final long serialVersionUID = 1L;

   private JLabel label; 

   private int x = 0; 
   private int y = 0; 

    public Tank(){
        setTitle("Tank Game"); 
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);


        label = new JLabel(new ImageIcon("tankIMG.png")); 
        label.setBounds(x,y,30,30); 

        add(label); 
        setVisible(true); 
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // does nothing 
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // does nothing 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); 

        if((key == KeyEvent.VK_A || key ==  KeyEvent.VK_LEFT)){
            x-=10; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_W || key ==  KeyEvent.VK_UP)){
            y-=10; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_D || key ==  KeyEvent.VK_RIGHT)){
            x+=10; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_S || key ==  KeyEvent.VK_DOWN)){
            y+=10;
            label.setLocation(x,y); 
        }
    }

    

    public static void main(String[] args){
        new Tank();  
    }
}