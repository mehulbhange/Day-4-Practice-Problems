public class SnakeAndLadder{

    public static void main(String[] args) {
        System.out.println("Snake and ladder game. Player1 at 0");
        
        int player1 = 0;

    }
    
    public static int rollDice(){
        return (int) ((Math.random()*10)%6) + 1;
    }
    
}