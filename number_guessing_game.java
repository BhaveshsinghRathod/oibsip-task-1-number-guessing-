import java.util.*;
class number_guessing_game
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("This is a number guessing game.");
        int z = rand.nextInt(100);  
        System.out.println("How many times would you like to play this game: ");
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 0; i < n; i++){
            
            System.out.println("Enter you number: ");
            int a = sc.nextInt();
            counter = counter + 1;
            System.out.println("Your entered number is: " + a + ".");  
            
            if(a == z){
                System.out.println("Congratulation \n Your guessed number matches computer's number.");
                System.out.println("You took " + counter + " attempts");
                break;
            }
            
            else{
                System.out.println("Number guessed is wrong.");

                if(a-z >= 50){
                    System.out.println("You are Very Far");
                }
                else if(a-z >= 30 && a-z <= 49){
                    System.out.println("You are Far");
                }
                else if(a-z >= 10 && a-z <=29){
                    System.out.println("You are Little Far");
                }
                else if(a-z >= 5 && a-z <= 9){
                    System.out.println("You are Close");
                }
                else if(a-z >= 1 && a-z <= 4){
                    System.out.println("You are Very Close");
                }
            }
           
            
        }
        System.out.println("Computer's selected number is: " + z);
    }

    
}