import javax.swing.ImageIcon;

public class warrior extends Characters {
    public warrior() {
        super(new ImageIcon("warrior.png") , 35, 30, 200, 500, 100);
        //however you want to set your x/y values
        setX(100);
        setY(100);
    
    }

    public warrior(int x , int y) {
        super(x,y,new ImageIcon("warrior.png") , 50, 100, 150, 500, 25, null);
    }

    public String toString(){
        return "warrior";
    
    }
    
}
