import java.util.*;
class Decision{
    Scanner sc = new Scanner(System.in);  /*0 pap 1 sci 2 sto */
    Random random = new Random(); 
    void decide(){
        int cominput = random.nextInt(2);
        // System.out.println(cominput);
        System.out.println("User's choice ");
        int user = sc.nextInt();
        if (user == 0 && cominput == 1) System.out.println("Computer Wins...");
        else if (user == 0 && cominput == 2) System.out.println("Hurray! You win...:)");
        else if (user == 0 && cominput == 0) {System.out.println("Alas! It's a tie let's go for tie breaker "); decide();}
        else if (user == 1 && cominput == 0) System.out.println("Hurray! You win...:)");
        else if (user == 1 && cominput == 2) System.out.println("Computer Wins...");
        else if (user == 1 && cominput == 1) {System.out.println("Alas! It's a tie let's go for tie breaker "); decide();}
        else if (user == 2 && cominput == 0) System.out.println("Computer Wins...");
        else if (user == 2 && cominput == 1) System.out.println("Hurray! You win...:)");
        else if (user == 2 && cominput == 2) {System.out.println("Alas! It's a tie let's go for tie breaker "); decide();}
        else{
            System.out.println("wrong choice entered");
        }
    }
}
public class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decision Dd = new Decision();
        System.out.println("Welcome to the Game");
        System.out.println("<---Stone--Paper--Scissor--->");
        System.out.println("0 : Paper");
        System.out.println("1 : Scissor");
        System.out.println("2 : Stone");
        System.out.println("Let's Begin select your Option");
        System.out.print("Start : 1 or exit : 0   ");
        int instr = sc.nextInt();
        sc.close();
        if (instr == 0) {System.out.println("Wrong choice entered"); System.exit(0);}
        else Dd.decide();
    }
}