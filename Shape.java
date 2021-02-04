public abstract class Shape {
  
    String name;
    
    Shape(String name){
      this.name = name;
    }
    @Override 
    public String toString(){
     return name; 
    }
    
    abstract void draw(int x, int y);
}
