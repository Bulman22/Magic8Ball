import java.util.Random;

public class magicBall {

//Should use a switch statement with cases for fortunes,
//and generate random number for fortunes

    public static void main(String[] args) {



        Random random= new Random();

     switch (random.nextInt(11)){
         case 0:
             System.out.println("It is decidedly so");
             break;
         case 1:
             System.out.println("It is certain");
             break;
         case 2:
             System.out.println("Without a doubt");
             break;
         case 3:
             System.out.println("Yes definitely");
             break;
         case 4:
             System.out.println("You may rely on it");
             break;
         case 5:
             System.out.println("Reply hazy, try again");
             break;
         case 6:
             System.out.println("Ask again later");
             break;
         case 7:
             System.out.println("Concentrate and ask again");
            break;
         case 8:
             System.out.println("Don’t count on it");
             break;
         case 9:
             System.out.println("My reply is no");
             break;
         case 10:
             System.out.println("My sources say no");
             break;


     }
    }
}

