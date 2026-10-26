import javax.swing.ImageIcon;

public class Support  extends Characters {
    public Support(){
        super(new ImageIcon("support.png") , 50 , extracted() , 150, 500 );
    }


    public Support(int x, int y){
        super(x,y, new ImageIcon(filename:"support.png") , happiness  : 50, health: 100  , 150, 500 );
    }

    public Support1( int x, int y){
	super(x,y,new ImageIcon(file name:”support.png”),50, 100,150,500,25, new Weapon() );
	//however you want to set your x/y values
	super.setX(100);
}


public Support( int x, int y){
	super(x,y,new ImageIcon(file name:”support.png”),50,100,150,500,25, new Weapon() );
}


public String toString(){
    return "Support";
}



    public String toString(){
        return "Support";
    }

}
