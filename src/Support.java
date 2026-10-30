import javax.swing.ImageIcon;

public class Support  extends Characters {

 public Support( int x, int y){
    super(x,y,new ImageIcon( "support.png"),50, 100,150,500,25, new Weapon()) ;  
	//however you want to set your x/y values
	super.setX(100);
}


public Support( int x, int y){
	super(x,y,new ImageIcon("support.png"),50,100,150,500,25, new Weapon() );
}


public String toString(){
    return "Support +" + super.getSpeed();
}





}
