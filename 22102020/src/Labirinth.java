import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Labirinth {
    public static void main(String[] args){
        char[][] gameArr = {
                {'-','-','W','W','-'},
                {'-','W','-','W','-'},
                {'P','W','-','W','W'},
                {'-','-','W','-','E'},
                {'W','-','-','-','W'}
        };
        game(gameArr);
    }

    public static void print2D(char[][] mat){
        for(char[] row:mat){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void game(char[][] labArr){
        boolean gameON = true;
        int[] playerPosition = new int[2];//row,col
        int[] exitPosition = new int[2];//row,col
        boolean exitFound = false;

        char wall = 'W';
        char exit = 'E';
        char emptySpace = '-';

        int counter = 0;
        while(counter<5){
            print2D(labArr);

            for(int i=0; i<5;i++){
                for(int j=0; j<5;j++) {

                    if(labArr[i][j] == 'P'){
                        playerPosition[0]=i;
                        playerPosition[1]=j;
                    }
                    if(!exitFound && labArr[i][j] =='E'){
                        exitPosition[0]=i;
                        exitPosition[1]=j;
                        exitFound=true;
                    }
                }
            }//STAMPA E DETERMINA POSIZIONI P E

            boolean validInput = false;
            while(!validInput) {
                System.out.println("Type a valid WASD Direction for P:");
                Scanner sc = new Scanner(System.in);
                char inputDirection = sc.next().charAt(0);
                switch (inputDirection) {
                    case ('W'):
                        labArr[playerPosition[0]][playerPosition[1]] = '-';
                        labArr[playerPosition[0]-1][playerPosition[1]] = 'P';
                        validInput=true;
                        break;
                    case ('S'):
                        labArr[playerPosition[0]][playerPosition[1]] = '-';
                        labArr[playerPosition[0]+1][playerPosition[1]] = 'P';
                        validInput=true;
                        break;
                    case ('A'):
                        labArr[playerPosition[0]][playerPosition[1]] = '-';
                        labArr[playerPosition[0]][playerPosition[1]-1] = 'P';
                        validInput=true;
                        break;
                    case ('D'):
                        labArr[playerPosition[0]][playerPosition[1]] = '-';
                        labArr[playerPosition[0]][playerPosition[1]+1] = 'P';
                        validInput=true;
                        break;
                    default:
                        System.out.println("Type a valid character/direction");
                }
            }
            counter++;
        }

        System.out.println("Yep!");
    }
}
