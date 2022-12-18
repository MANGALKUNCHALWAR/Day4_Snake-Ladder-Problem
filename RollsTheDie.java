package assignment4.snakeandladderproblem;

//The Player rolls the die to get a number between 1 to 6.
// - Use ((RANDOM)) to get the number between 1 to 6

public class RollsTheDie {
    public static void main(String[] args) {
        int die_roll = (int) (((Math.random()*10)%6)+1);
        System.out.println("roll die number : " + die_roll);
    }
}
