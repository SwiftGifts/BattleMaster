import java.util.*;

public class Combat
{
    // instance variables - replace the example below with your own
    private int x;
    CharacterSheet character;
    MonsterSheet monster;
    int choice;

    public Combat(CharacterSheet charname, String monname)
    {
        Scanner scan = new Scanner(System.in);
        monster = new MonsterSheet(monname);
        character = charname;
        
        Combatmenu();
        
        choice = MainMenu.Makechoice(3);
        if (choice == 1){
            int dmg = character.Attack();
            monster.monhealth -= dmg;
            System.out.println(dmg + " Damage done!");
        }
    }

    
    public void Combatstats(MonsterSheet monster , CharacterSheet character){
        character.Showcharstats();
        monster.Showmonstats();
    }
    
    public void Combatmenu(){
        
        System.out.println("Current foe: " + monster.Getname());
        System.out.println("");
        System.out.println(character.Getname());
        System.out.println("Health: " + character.Gethealth());
        System.out.println("Mana: " + character.Getmana());
        System.out.println("1) Attack");
        System.out.println("2) Guard");
        System.out.println("3) Flee");
        
    }
}
