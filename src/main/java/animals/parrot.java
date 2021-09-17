package animals;

public class parrot {
    public String name;
    public String speak;

    public parrot(String name, String speak) {
        this.name = name;
        this.speak = speak;


    }
    public String mimick(){
        String talk = "polly want a cracker";
        return talk;
    }

    @Override
    public String toString() {
        return "parrot{" +
                "name='" + name + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }
}
