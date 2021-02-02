class Flower implements Drawable {
 
 PApplet p; 
 
 Flower(PApplet p) {
  this.p = p;
 }
 
public void draw(int x, int y){
   p.pushMatrix();
     p.fill(50, 20, 100);
     p.ellipse(x,y,w,h);
     p.ellipse(x,y,w,h);
     p.circle();
   p.popMatrix();
 }
}
