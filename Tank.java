import javax.swing.*; 
import java.awt.event.*; 

public class Tank extends JFrame implements KeyListener{
    private static final long serialVersionUID = 1L;

    private JLabel label;

   private int x = 0; 
   private int y = 0; 


   private ImageIcon left = new ImageIcon("tankLEFT.png"); 
   private ImageIcon up = new ImageIcon("tankUP.png"); 
   private ImageIcon right = new ImageIcon("tankRIGHT.png"); 
   private ImageIcon down = new ImageIcon("tankDOWN.png");

    public Tank(){
        label = new JLabel(up); 

        setTitle("Tank Game"); 
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        add(label); 

        setVisible(true); 
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // does nothing 
    }
    @Override
    public void keyReleased(KeyEvent e){
        // does nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); 
        
        switch(key){
            case KeyEvent.VK_A: 
                label.setLocation(x,y); 
                label.setIcon(left);
                break;

            case KeyEvent.VK_W: 
                label.setLocation(x,y); 
                label.setIcon(up);
                break;

            case KeyEvent.VK_D: 
                label.setLocation(x,y); 
                label.setIcon(right);
                break;

            case KeyEvent.VK_S:
                label.setLocation(x,y); 
                label.setIcon(down);
                break;

            case KeyEvent.VK_LEFT: 
                x-=10; 
                label.setLocation(x,y);
                break; 

            case KeyEvent.VK_UP: 
                y-=10; 
                label.setLocation(x,y); 
                break;

            case KeyEvent.VK_RIGHT:
                x+=10; 
                label.setLocation(x,y); 
                break;

            case KeyEvent.VK_DOWN: 
                y+=10; 
                label.setLocation(x,y);
                break; 

        }
    }


    public static void main(String[] args){
        new Tank();  
    }
}