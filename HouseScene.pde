Flower flower;
void setup(){
  size(800, 600);
  flower = new Flower(this);
}

void draw(){
  background(45, 211, 250);
  flower.draw(200,500);
}
