package madhav;

public class Triangle {
private Point pointa;
private Point pointb;
private Point pointc;
public Point getPointa() {
     return pointa;
}
public void setPointa(Point pointa) {
     this.pointa = pointa;
}
public Point getPointb() {
     return pointb;
}
public void setPointb(Point pointb) {
     this.pointb = pointb;
}
public Point getPointc() {
     return pointc;
}
public void setPointc(Point pointc) {
     this.pointc = pointc;
}
public void show()
{
     System.out.printf("pointa=" + "(" + pointa.getX()+"," + pointa.getY()+ ")" +"\n" );
     System.out.printf("pointb=" + "(" + pointb.getX()+"," + pointb.getY()+ ")" +"\n" );
     System.out.printf("pointc=" + "(" + pointc.getX() +"," + pointc.getY()+ ")" +"\n" );
}

}