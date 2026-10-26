import javax.swing.ImageIcon;


public class Tank extends Characters {
    public Tank() {
        super(new ImageIcon("tank.png") , 35, 30, 200, 500, 100);
        //however you want to set your x/y values
        setX(100);
        setY(100);

    
    }

    public Tank(int x , int y) {
        super(x,y,new ImageIcon("tank.png") , 50, 100, 150, 500, 25, null);
    }

    public String toString(){
        return "Tank";
    
    }
    

}
 