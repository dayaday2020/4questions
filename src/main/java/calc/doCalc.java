package calc;

public class doCalc {
    public int num1;
    public int num2;


            public doCalc(int num1, int num2){
                this.num1 = num1;
                this.num2 = num2;}

    public int addition(){
                return this.num1 + this.num2;
            }
    public int multiply(){
                return this.num1 * this.num2;
            }
    public int divide() {
                return this.num1 / this.num2;
            }
    public int subtract(){
                return this.num1 - this.num2;
            }
    public int exponents(){ return (int) Math.exp(this.num2);}
    }





