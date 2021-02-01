import processing.core.*;

//Written by changa.imara@sonomaacademy.org

class Grass implements Drawable {
 
 PApplet p; 
 
 Grass(PApplet p) {
  this.p = p;
 }
 
public void draw(int x, int y){
   p.pushMatrix();
     p.fill(13, 178, 52);
     p.noStroke();
     p.rect(x, y, p.width - x, p.height - y);
   p.popMatrix();
 }
}
