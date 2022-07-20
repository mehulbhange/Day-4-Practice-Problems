public class SnakeAndLadder{

    public static void main(String[] args) {
        System.out.println("Snake and ladder game. Player1 at 0");
        
        int player1 = 0;
        int player2 = 0;
        int totalDiceRolls = 0;
        boolean turnPlayer = true;

        while( player1 != 100 && player2 != 100){
            int dice = rollDice();
            totalDiceRolls++;
            int option = checkOptions();
            if(turnPlayer){
                if ( option == 1){
                    player1 += dice;
                    if(player1>100){
                        player1 -= dice;
                    }
                    System.out.println("Player1 position after dice roll : "+ player1);
                }else if ( option == 2){
                    player1 -= dice;
                    if(player1 < 0){
                        player1 = 0;
                    }
                    System.out.println("Player1 position after dice roll : "+ player1);
                    turnPlayer = false;
                }else{
                    System.out.println("Player1 position after dice roll : "+ player1);
                    turnPlayer = false;
                }
            }else{
                if ( option == 1){
                    player2 += dice;
                    if(player2>100){
                        player2 -= dice;
                    }
                    System.out.println("Player2 position after dice roll : "+ player2);
                }else if ( option == 2){
                    player2 -= dice;
                    if(player2 < 0){
                        player2 = 0;
                    }
                    System.out.println("Player2 position after dice roll : "+ player2);
                    turnPlayer = true;
                }else{
                    System.out.println("Player2 position after dice roll : "+ player2);
                    turnPlayer = true;
                }
            }
            
        }
        if(player1 == 100){
            System.out.println("Player1 won!!!");
        }else{
            System.out.println("Player2 won!!!");
        }
        System.out.println("number of times the dice was played to win the game : "+ totalDiceRolls);
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