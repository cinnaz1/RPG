public class Bow extends Ranged {
    public Bow() {
        super(10, 5, new ImageIcon("C:\\Users\\S1833122\\Downloads\\RPG\\bin\\IMG_4771.JPG"));
    }

    public Bow(int damage, int attackSpeed, ImageIcon pic) {
        super(damage, attackSpeed, pic);
    }   
}