package shapes;

public class triangle {
    public int height;
    public int base;
    public int side1;
    public int side2;

    public triangle(int height, int base,int side1,int side2){
    this.base = base;
    this.height = height;
    this.side1 = side1;
    this.side2 = side2;}
    public int area(){ return this.base * this.height;}


  public int perimeter(){
        return this.side1 + this.side2 + this.base;
  }


}
