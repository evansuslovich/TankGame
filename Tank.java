import javax.swing.*; 
import java.awt.event.*; 

public class Tank extends JFrame implements KeyListener{
    private static final long serialVersionUID = 1L;

   private JLabel label; 

   private int x = 0; 
   private int y = 0; 

   private int lastDirection = KeyEvent.VK_W; 

   private ImageIcon left = new ImageIcon("tankLEFT.png"); 
   private ImageIcon up = new ImageIcon("tankUP.png"); ; 
   private ImageIcon right = new ImageIcon("tankRIGHT.png"); ; 
   private ImageIcon down = new ImageIcon("tankDOWN.png"); ; 

    public Tank(){
        setTitle("Tank Game"); 
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);


        label = new JLabel(); 
        label.setBounds(x,y,30,30); 
        rotateImage(lastDirection); 

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

        // Move the TANK 

        if(key ==  KeyEvent.VK_LEFT){
            x-=10; 
            rotateImage(lastDirection);
            label.setLocation(x,y); 
        }
        if(key ==  KeyEvent.VK_UP){
            y-=10; 
            rotateImage(lastDirection);
            label.setLocation(x,y); 
        }
        if(key ==  KeyEvent.VK_RIGHT){
            x+=10; 
            rotateImage(lastDirection);
            label.setLocation(x,y); 
        }
        if( key ==  KeyEvent.VK_DOWN){
            y+=10;
            rotateImage(lastDirection);
            label.setLocation(x,y); 
        }

        // Rotate the TANK 

        if(key == KeyEvent.VK_A){
            rotateImage(KeyEvent.VK_A);
        }
        if(key == KeyEvent.VK_W){
            rotateImage(KeyEvent.VK_W);
        }
        if(key == KeyEvent.VK_D){
            rotateImage(KeyEvent.VK_D);
        }
        if(key == KeyEvent.VK_S){
            rotateImage(KeyEvent.VK_S);
        }


    }


    public void rotateImage(int key){
        switch(key){
            case(KeyEvent.VK_A):
                label.setLocation(x,y);
                label.setIcon(left);
                lastDirection = KeyEvent.VK_A; 
                break; 

            case(KeyEvent.VK_W):
                label.setLocation(x,y); 
                label.setIcon(up);
                lastDirection = KeyEvent.VK_W; 
                break; 

            case(KeyEvent.VK_D):
                label.setIcon(right);
                label.setLocation(x,y); 
                lastDirection = KeyEvent.VK_D; 
                break; 

            case(KeyEvent.VK_S):
                label.setIcon(down);
                label.setLocation(x,y); 
                lastDirection = KeyEvent.VK_S; 
                break;          
        }
    }
    

    public static void main(String[] args){
        new Tank();  
    }
}