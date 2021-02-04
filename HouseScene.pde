Rect r;
Square s;
void setup(){
  size(800, 600);
  r = new Rect(this);
  s = new Square(this);
  print("The name of this class is " + s.toString());
}

void draw(){
  background(45, 211, 250);
  r.draw(100,100);
  s.draw(300,300);
}
