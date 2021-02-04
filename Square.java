import processing.core.PApplet;
public class Square extends Rect{

  Square(PApplet p){
    super(p);
  }

  @Override
  void draw(int x, int y){
    p.push();
    p.fill(255,162,246);
    p.rect(x,y,100,100);
    p.pop();
  }
}
