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

   private ImageIcon lastDirection = up; 


    public Tank(){
        label = new JLabel(up); 
        label.setBounds(x,y,30,30);


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
    public void keyReleased(KeyEvent e) {
        // does nothing 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); 

        if(key == KeyEvent.VK_A){
            lastDirection = left; 
            move(left,x,y); 
        }
        if(key == KeyEvent.VK_W){
            lastDirection = up; 
            move(up,x,y); 

        }
        if(key == KeyEvent.VK_D){
            lastDirection = right; 
            move(right,x,y); 

        }
        if(key == KeyEvent.VK_S){
            lastDirection = down; 
            move(down,x,y); 
        }

        // Move the TANK 

        if(key ==  KeyEvent.VK_LEFT){
            x-=10; 
            move(lastDirection,x,y);
        }
        if(key ==  KeyEvent.VK_UP){
            y-=10; 
            move(lastDirection,x,y);
        }
        if(key ==  KeyEvent.VK_RIGHT){
            x+=10; 
            move(lastDirection,x,y);
  
        }
        if( key ==  KeyEvent.VK_DOWN){
            y+=10;
            move(lastDirection,x,y);
        }


    }

    public void move(ImageIcon img, int x, int y){
        label.setIcon(img); 
        label.setLocation(x,y); 
        label.repaint(); 

    }
    
    

    public static void main(String[] args){
        new Tank();  
    }
}