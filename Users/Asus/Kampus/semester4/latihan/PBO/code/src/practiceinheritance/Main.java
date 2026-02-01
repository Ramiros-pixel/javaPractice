package practiceinheritance;
import java.util.Scanner;


 
public class Main {
enum roleGame{MAGE,ATTACKER,ARROW};   
    void roleCharacter(){

        System.out.println("Input the role");
        Scanner rolesChar= new Scanner(System.in);
        String userInput = rolesChar.nextLine();
        roleGame role =null;

        try{
         role = roleGame.valueOf(userInput.toUpperCase());
         
        switch(role){
            case MAGE: 
               mainCharacter mage = new mageCharacter("Lina", 120, 25, 90);
               mage.display(); 
               break;

            case ATTACKER:
                mainCharacter attacker = new attackerCharacter("Rezy", 90, 110, 96);
                attacker.display();
                break;
            case ARROW:
                System.out.println("Character not avaible");
                break;
            default:
                System.out.println("Invalid role");
                break;
        }
    }

        catch(IllegalArgumentException e){
            System.out.println("Role invalid");
            return;
        }
        
    }
    public static void main(String[] args) {
        // mainCharacter attacker = new attackerCharacter("Ryza", 90, 80, 23);
        // attacker.display(); 
        Main app= new Main();   
        app.roleCharacter();
        
         

    }

}
