import processing.core.*;
class Flower implements Drawable {
 
 PApplet p; 
 
 Flower(PApplet p) {
  this.p = p;
 }
 
public void draw(int x, int y){
   p.pushMatrix();
     p.fill(0,0,0);
     p.strokeWeight(5);
     p.line(x,y,x,y+100);
     p.strokeWeight(0);
     p.fill(50, 20, 100);
     p.ellipse(x,y,100,50);
     p.ellipse(x,y,50,100);
     p.ellipse(x,y,75,75);
     p.fill(180,180,180);
     p.circle(x,y,25);
   p.popMatrix();
 }
}
