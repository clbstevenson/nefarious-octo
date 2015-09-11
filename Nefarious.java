import java.util.Scanner;

public class Nefarious {

    String name;
    int health, attack;
    int maxHealth;

    /**
    *@param n: The name of this Nefarious
    *@param h: The starting health value of this Nefarious
    *@param a: The starting attack value of this Nefarious
    */
    public Nefarious(String n, int h, int a) {
        name = n;
        health = h;
        maxHealth = h;
        attack = a;
    }
    
    public int attack(Nefarious enemy) {
        return (enemy.health -= this.attack);
        //this.health -= enemy.attack;
    }
    
    public int heal() {
        return (this.health += maxHealth / 4);
    }
    
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Nefarious nefarian = new Nefarious("Nefarian", 25, 3);
        Nefarious jafar = new Nefarious("Jafar", 11, 6);
        
        int turn = 0;
        Scanner scan = new Scanner(System.in);
        
        String nefChoice = "What does Nefarian choose to do?";
        String jafChoice = "What does Jafar choose to do?";
        
        System.out.println("Behold! The great champions have returned to the center of the city, \n
            where their battle three ages earlier had left only a pile of mud.");
        System.out.println("Nefarian steps forward first.\n" + 
            nefChoice);
        
        String input = "go"
        Nefarious current = nefarian;
        do {
            input = scan.nextLine();
            // do an attack
            if(input.equals("attack")) {
                //current.attack
                if(current == nefarian)
                    current.attack(jafar);
                else
                    current.attack(nefarian);
            } else if(input.equals("heal")) {
                //current.heal
                if(current == nefarian)
                    current.heal(jafar);
                else
                    current.heal(nefarian);
            } else {
                //invalid
                System.out.println(current.toString() + " fumbles in confusion. He decides to try something else.");
                printChoice(current);
            }
            
        } while(nefarian.isAlive() && jafar.isAlive());
        
        System.out.println("The victor rises from the ashes!");
        System.out.println(current + " is victorious!");
        
    }
    
    private void printChoice(Nefarious n) {
        System.out.println("What does " + n.toString() + " choose to do?";
    }
    
}
