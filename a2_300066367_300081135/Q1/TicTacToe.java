import java.util.Scanner;

public class TicTacToe{

   /**
     * <b>main</b> of the application. Creates the instance of  GameController
     * and starts the game. If two parameters line  and column
     * are passed, they are used.
     * Otherwise, a default value is used. Defaults values are also
     * used if the paramters are too small (less than 2).
     *
     * @param args
     *            command line parameters
     */
     public static void main(String[] args) {

        StudentInfo.display();

        TicTacToeGame game;
        int lines = 3;
        int columns = 3;
        int win = 3;


        try{
            if (args.length >= 2) {
                lines = Integer.parseInt(args[0]);
                if(lines<2){
                    System.out.println("Invalid argument, using default...");
                    lines = 3;
                }
                columns = Integer.parseInt(args[1]);
                if(columns<2){
                    System.out.println("Invalid argument, using default...");
                    columns = 3;
                }
            }
            if (args.length >= 3){
                win = Integer.parseInt(args[2]);
                if(win<2){
                    System.out.println("Invalid argument, using default...");
                    win = 3;
                }
            }
            if (args.length > 3){
                System.out.println("Too many arguments. Only the first 3 are used.");
            }

        } catch(NumberFormatException e){
            System.out.println("Invalid argument, using default...");
            lines   = 3;
            columns  = 3;
            win = 3;
        }

        Player[] players;
        HumanPlayer humanUser = new HumanPlayer();
        ComputerRandomPlayer computerUser = new ComputerRandomPlayer();
        Scanner input= new Scanner(System.in);
        game = new TicTacToeGame(lines, columns, win);

        players = new Player[]{humanUser,computerUser};
        int playersTurn = Utils.generator.nextInt(2);



        while (game.getGameState() == GameState.PLAYING){
            if (playersTurn==0){
           
                if (game.getLevel()%2==0){
                        System.out.println("Player 1's turn. ");
                        System.out.println(game);
                        System.out.println("X to play: ");
                        HumanPlayer humanPlayer= new HumanPlayer();
                        humanPlayer.play(game);                

                }
                else{
                    if (game.getLevel()%2 != 0){
                            System.out.println("Player 2's turn. ");
                            ComputerRandomPlayer computerPlayer= new ComputerRandomPlayer();
                            computerPlayer.play(game);

                    }

                }
            }

            else{

                if (game.getLevel()%2==0){
                        System.out.println("Player 1's turn. ");
                        ComputerRandomPlayer computerPlayer= new ComputerRandomPlayer();
                        computerPlayer.play(game);                

                }
                else{
                    if (game.getLevel()%2 != 0){
                            System.out.println("Player 2's turn. ");
                            System.out.println(game);
                            System.out.println("O to play: ");
                            HumanPlayer humanPlayer= new HumanPlayer();
                            humanPlayer.play(game);
                    }   
                }            
            }               
        
        }
        System.out.println(game);
        switch (game.getGameState()){
            case PLAYING:{
                break;
            }

            case DRAW:{
                System.out.println
            }
        }
    
    }

}