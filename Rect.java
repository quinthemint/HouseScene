import processing.core.PApplet;
public class Rect extends Shape{
  PApplet p;
  Rect(PApplet p){
    super("Rect");
    this.p = p;
  }
  void draw(int x, int y){
    p.rect(x,y,100,300);
  }
}
