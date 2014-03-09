package madhav;

public class Triangle {
private Point pointa;
public Triangle(Point pointa)
{
	this.pointa=pointa;
}
public Point getPointa() {
     return pointa;
}
public void setPointa(Point pointa) {
     this.pointa = pointa;
}

public void show()
{
     System.out.printf("pointa=" + "(" + pointa.getX()+"," + pointa.getY()+ ")" +"\n" );
    
}

}