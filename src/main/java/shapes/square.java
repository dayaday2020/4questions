package shapes;

public class square {
    public int side;

    public square(int side){
        this.side=side;
    }
    public int area(){
        return this.side *this.side;
    }
    public int perimeter(){
        return 4 * this.side;

    }
}
