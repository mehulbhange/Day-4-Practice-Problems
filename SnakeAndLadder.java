public class SnakeAndLadder{

    public static void main(String[] args) {
        System.out.println("Snake and ladder game. Player1 at 0");
        
        int player1 = 0;

        while( player1 != 100 ){
            int dice = rollDice();
            int option = checkOptions();
            if ( option == 1){
                player1 += dice;
                if(player1>100){
                    player1 -= dice;
                }
            }else if ( option == 2){
                player1 -= dice;
                if(player1 < 0){
                    player1 = 0;
                }
            }
        }
        System.out.println("Player1 won");

    }
    
    public static int rollDice(){
        return (int) ((Math.random()*10)%6) + 1;
    }

    // 0 -> No Play
    // 1 -> Ladder
    // 2 -> Snake
    public static int checkOptions(){
        return (int) (Math.random()*10)%3; 
    }

}