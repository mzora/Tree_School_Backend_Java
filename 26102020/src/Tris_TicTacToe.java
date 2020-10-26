import java.util.Scanner;

public class Tris_TicTacToe {
    private char[][] scacchiera = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    private boolean gameOn = false;
    private final char player_1 = 'O';
    private final char player_2 = 'X';
    private boolean player1_plying = true;

    public void gioca(){
        gameOn=true;
        char actualPlayer = player_1;

        while (this.gameOn){
            char winner = checkWin();
            if(winner==player_1 || winner== player_2){
                stampaGioco();
                System.out.println("Winner: "+winner);
                gameOn=false;
            }
            if(gameOn){
                stampaGioco();
                System.out.println("Player "+actualPlayer+" , scegli la posizione:");
                Scanner sc = new Scanner(System.in);
                char sceltaCasella = sc.next().charAt(0);
                inserisciScelta(sceltaCasella, actualPlayer);

                if(winner=='n'){
                    if(actualPlayer==player_1){
                        actualPlayer = player_2;
                    }else if(actualPlayer == player_2){
                        actualPlayer=player_1;
                    }
                }
            }
        }
    }

    private void stampaGioco(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(this.scacchiera[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void inserisciScelta(char scelta, char player){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if( scacchiera[i][j] == scelta){
                    scacchiera[i][j] = player;
                }
            }
        }
    }

    private char checkWin(){
        //orizzontali
        if(scacchiera[0][0]==scacchiera[0][1] && scacchiera[0][1]== scacchiera[0][2]){
            return scacchiera[0][0];
        };
        if(scacchiera[1][0]==scacchiera[1][1] && scacchiera[1][1]== scacchiera[1][2]){
            return scacchiera[1][0];
        };
        if(scacchiera[2][0]==scacchiera[2][1] && scacchiera[2][1]== scacchiera[2][2]){
            return scacchiera[0][1];
        };
        //verticali
        if(scacchiera[0][0]==scacchiera[1][0] && scacchiera[1][0]== scacchiera[2][0]){
            return scacchiera[0][0];
        };
        if(scacchiera[0][1]==scacchiera[1][0] && scacchiera[1][0]== scacchiera[2][0]){
            return scacchiera[0][1];
        };
        if(scacchiera[0][2]==scacchiera[1][2] && scacchiera[1][2]== scacchiera[2][2]){
            return scacchiera[0][2];
        };

        //obliqui
        if(scacchiera[0][0]==scacchiera[1][1] && scacchiera[1][1]== scacchiera[2][2]){
            return scacchiera[0][0];
        };
        if(scacchiera[0][2]==scacchiera[1][1] && scacchiera[1][1]== scacchiera[2][0]){
            return scacchiera[0][2];
        };
        return 'n';
    }

}
