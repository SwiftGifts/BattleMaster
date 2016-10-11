
public class MonsterSheet
{
    String monname;
    int monlevel;
    int monhealth;
    int monmana;
    
    int monstr;
    int moncon;
    int mondex;
    int monwis;
    int monint;
    int moncha;
    
    public MonsterSheet(String name)
    {
        monname = name;
        if (monname == "Spider"){
            monstr = 10;
            moncon = 10;
            mondex = 10;
            monwis = 10;
            monint = 10;
            moncha = 10;
            monhealth = 10;}
        
    }
    
    // The following methods will be the basic info for the monster
    public String Getname(){
        return this.monname;
    }
    
    public int Gethealth(){
        return this.monhealth;
    }
    
    public int Getmana(){
        return this.monmana;
    }
 
    public void Showmonstats(){
        System.out.println ("");
        System.out.println (Getname());
        System.out.println ("");
        System.out.println ("Strength: " + monstr); 
        System.out.println ("Constitution: " + moncon); 
        System.out.println ("Dexterity: " + mondex); 
        System.out.println ("Wisdom: " + monwis); 
        System.out.println ("Intelligence: " + monint); 
        System.out.println ("Charisma: " + moncha); 
        
    }
}