import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        XO x = new XO();
        Logic l = new Logic();
        l.x = x;  
        x.logic = l;  
        x.menu();  
    }
}

class Logic {
    public XO x;
    public int choice;
    public Scanner sc = new Scanner(System.in);

    public String player1;
    public String player2;
    public String winplayer;


    public void forFun() {
        x.game();  
        for (int i = 0; i < 9; i++) {  
            if (i % 2 == 0) {
                winplayer = player1;
                System.out.print("Enter Input for " + player1 + ": ");
            } else {
                winplayer = player2;
                System.out.print("Enter Input for " + player2 + ": ");
            }
            choice = sc.nextInt();
            playChoice();  
            if (checkWin()) {  
                break;
            }
        }
        System.out.println("Game Over!");  
    }


    public void playChoice() {
        int row = (choice - 1) / 3;
        int col = (choice - 1) % 3;
        if (x.arr[row][col] != 'X' && x.arr[row][col] != 'O') {  
            if (winplayer.equals(player1)) {
                x.arr[row][col] = 'X';  
            } else {
                x.arr[row][col] = 'O';  
            }
            x.display();
        } else {
            System.out.println("Cell already occupied! Choose another cell.");
            if (winplayer.equals(player1)) {
                System.out.print("Enter Input for " + player1 + ": ");
            } else {
                System.out.print("Enter Input for " + player2 + ": ");
            }
            choice = sc.nextInt();
            playChoice();  
        }
    }


    public boolean checkWin() {

        for (int i = 0; i < 3; i++) {
            if (x.arr[i][0] == x.arr[i][1] && x.arr[i][1] == x.arr[i][2]) {
                System.out.println(winplayer + " WON!!!");
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (x.arr[0][i] == x.arr[1][i] && x.arr[1][i] == x.arr[2][i]) {
                System.out.println(winplayer + " WON!!!");
                return true;
            }
        }

        if (x.arr[0][0] == x.arr[1][1] && x.arr[1][1] == x.arr[2][2]) {
            System.out.println(winplayer + " WON!!!");
            return true;
        }
        if (x.arr[0][2] == x.arr[1][1] && x.arr[1][1] == x.arr[2][0]) {
            System.out.println(winplayer + " WON!!!");
            return true;
        }
        return false;
    }
}

class XO {
    public char arr[][] = new char[3][3]; 
    public Scanner sc = new Scanner(System.in);
    public Logic logic;

    public void game() {
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (char) (k + '0');  
                k++;
            }
        }
        display();
    }

    
    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public void menu() {
        System.out.println("Welcome To XOXO");

        boolean running = true; 

        while (running) {
            System.out.println("1. Start Game\n2. Exit"); 
            int choice = sc.nextInt(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name for Player 1: ");
                    logic.player1 = sc.next();
                    System.out.print("Enter name for Player 2: ");
                    logic.player2 = sc.next();
                    logic.forFun();  
                    running = false;
                    break;
                case 2:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Enter A Valid Choice!");
                    break;
            }
        }
    }
}
