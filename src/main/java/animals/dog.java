package animals;

public class dog {
    public String name;
    public int paws;
     public dog(String name,  int paws){
         this.name = name;
         this.paws = paws;

     }
     public String speak(){
         String bark = "woof woof";
         return bark;
     }


    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", paws=" + paws +
                '}';
    }

}



