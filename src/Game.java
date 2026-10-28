import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;






public class Game extends JPanel  implements Runnable, KeyListener, MouseListener, MouseMotionListener{
   
   
    private BufferedImage back;
    private ArrayList<Characters> characters;
    private String level;
    private Characters mainChar;
    private ArrayList<Weapons> rangedAttack;
    private Queue<Enemies> enemyQueue;

   
    public Game() {
       
        //This is the music
        Player p = new Player();
        //p.playmusic("track02.wav");
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        new Thread(this).start();
		    displayChars = setupChars();
        enemies=setEs();
        for(Characters c : displayChars) {
			System.out.println(c.toString());
    }
        level="start";
        //only if you want to have one selected init
		mainChar = displayChars.get(0);
		rangedAttack = new ArrayList<Weapons>();

	}
	public Queue<Enemies> setEs(){
		Queue<Enemies> temp = new LinkedList<>();
		// Initialize enemies here
	

		return temp;	

	}

    public void setupChars() {
        // Initialize characters here
    }
    public void setupGame() {
        characters = new ArrayList<>();
        rangedAttack = new ArrayList<>();
        enemyQueue = new LinkedList<>();
    }
      public void run()
       {
        try
        {
            while(true)
            {
               Thread.currentThread().sleep(5);
                repaint();
             }
          }catch(Exception e)
          {
          }
        }

        public void paint(Graphics g){
          Graphics2D  twoDgraph= (Graphics2D)g;
        if(back==null)
          back = (BufferedImage)(createImage(getWidth(), getHeight()));

        Graphics g2d = back.createGraphics();


        g2d.clearRect(0, 0, getSize().getWidth(), getSize().getHeight());
        //start coding here

        switch(level){
          case "start":
              drawStart(g2d);
             break;
             case "stats":
              drawStats(g2d);
             break;

        }

        //do not delete this line, it draws everythign above
        int y;
        twoDgraph.drawImage(back,op;op; null, x;x;0 y;y;0);

 
        }
        private void drawStart(Graphics2D g2d){
          System.out.println("Drawing start");
          g2d.setColor(Color.WHITE);
          for(Characters c : displayChars) {
              c.drawChar(g2d);
              //this will display all of them
              //g2d.drawString("Range:" + c.getRange(), c.getX(), c.getY() - 10);
          }
        }
        private void drawStats(Graphics2D g2d){
          mainChar.drawChar(g2d);
          g2d.setColor(Color.WHITE);
          g2d.drawString("Range:" + mainChar.getRange(), 100, 100);
          g2d.drawString("Health:" + mainChar.getHealth(), 100, 120);
          g2d.drawString("Damage:" + mainChar.getDamage(), 100, 140);
          g2d.drawString("Speed:" + mainChar.getSpeed(), 100, 160);
        }
    
      @Override
      public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
      }


      @Override
      public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
      }


      @Override
      public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
      
        mainChar=//whichever character is clicked on displayChars.get(i);
        level="stats";

      }


      @Override
      public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
      }


      @Override
      public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
      }


      @Override
      public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        ////throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
      }


      @Override
      public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
      }


      @Override
      public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
      }


      @Override
      public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
      }


      @Override
      public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
      }
   
}
