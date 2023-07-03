public class Craps2
{public static void main(String[] args) {

    int diceRoll = (int)(Math.random()* 6) + 1;

    int diceRoll2 = (int)(Math.random()* 6) + 1;

    int roll = diceRoll + diceRoll2;

    System.out.println();

    System.out.print("You rolled "+roll+". ");

    if(roll == 2 || roll == 3 || roll == 12){

        System.out.println("You Lose !");

    }else if(roll == 7 || roll == 11){

        System.out.println("You Win !");

    }else{

        System.out.println("Point is "+roll+"\n");

        diceRoll = (int)(Math.random()* 6) + 1;

        diceRoll2 = (int)(Math.random()* 6) + 1;

        int roll2 = diceRoll + diceRoll2;

        System.out.print("You rolled "+roll2+". ");

        while(roll2 != 7){

            if(roll == roll2){

                System.out.println("You Win !");

                break;

            }else{

                System.out.println("Point is "+roll+"\n");

            }

            diceRoll = (int)(Math.random()* 6) + 1;

            diceRoll2 = (int)(Math.random()* 6) + 1;

            roll2 = diceRoll + diceRoll2;

            System.out.print("You total rolled "+roll2+". ");

        }

        if(roll2 == 7){

            System.out.println("You Lose !");

        }

    }

}

}


