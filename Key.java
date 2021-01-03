import java.awt.event.*; 
import javax.swing.*; 

public class Key implements KeyListener{ 

    private JLabel label; 
    private JFrame frame; 

    private int x = 0; 
    private int y = 0; 
    

    public Key(){

        label = new JLabel(new ImageIcon("tankIMG.png")); 
        label.setBounds(x,y,30,30); 



        frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.addKeyListener(this);
        frame.add(label); 


        frame.setVisible(true); 
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); 

        if((key == KeyEvent.VK_A || key ==  KeyEvent.VK_LEFT)){
            x-=1; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_W || key ==  KeyEvent.VK_UP)){
            y-=1; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_D || key ==  KeyEvent.VK_RIGHT)){
            x+=1; 
            label.setLocation(x,y); 
        }
        if((key == KeyEvent.VK_S || key ==  KeyEvent.VK_DOWN)){
            y+=1;
            label.setLocation(x,y); 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    public static void main(String[] args){
        new Key(); 
    }
}