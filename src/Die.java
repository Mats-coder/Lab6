import java.util.Arrays;

public class Die {
    String[] sides;
    public Die(){
        this.sides = new String[6];
        Arrays.fill(sides, ".");
        this.sides[0] = "C";
        this.sides[1] = "R";
        this.sides[2] = "L";
    }
    public String rollDie(){
        int rand = (int)(Math.random()*6);
        return this.sides[rand];
    }
    @Override
    public String toString(){
        String die = "";
        for(int i = 0; i < this.sides.length; i++){
            die += this.sides[i];
        }
        return die;
    }
}
