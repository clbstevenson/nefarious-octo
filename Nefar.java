import java.util.Scanner;

/**
 * class Nefar.java: used for the Nefar entities
 * they have a health, attack, name,..
 **/ 
public class Nefar {

    String name;
    int health, attack;
    int maxHealth;
    int maxAttack;

    /**
    *@param n: The name of this Nefar
    *@param h: The starting health value of this Nefar
    *@param a: The starting attack value of this Nefar
    */
    public Nefar(String n, int h, int a) {
        name = n;
        health = h;
        maxHealth = h;
        attack = a;
    }
    
    /**
     * This Nefar attacks another Nefar.
     * The damage dealt is equal to this Nefar's attack.
     * */
    public int attack(Nefar enemy) {
        return (enemy.health -= this.attack);
        //this.health -= enemy.attack;
    }
    
    /**
     * This Nefar heals itself.
     * The amount of health healed equals its starting health / 4.
     * */
    public int heal() {
        return (this.health += maxHealth / 4);
    }
    
    /**
     * The toString() for this Nefar returns its name
     * */
    public String toString() {
        return name;
    }

    
}
