

public class CharacterSheet
{
    String charname;
    String charhistory;
    int charage;
    int charlevel;
    int charexperience;
    int charhealth;
    int charmana;
    
    int charstr;
    int charcon;
    int chardex;
    int charwis;
    int charint;
    int charcha;
    
    public CharacterSheet(String name,int age)
    {
        charname = name;
        charage = age;
       
    }
    
    // The following methods will be the basic info for the character
    public int Getage(){
        return this.charage;
    }
    
    public String Getname(){
        return this.charname;
    }
    
    public int Gethealth(){
        return this.charhealth;
    }
    
    public int Getmana(){
        return this.charmana;
    }
    
    public int Getexperience(){
        return charexperience;
    }
    
    public void Growlevel(){
        this.charlevel += 1;
        System.out.println ("You've reached level " + this.charlevel + "!!!");
    }
    
    public void charhistory(String x){
        this.charhistory = x;
    }
    
    public String Getcharhistory(){
        return this.charhistory;
    }
    
    public void Showcharstats(){
        System.out.println ("");
        System.out.println (Getname());
        System.out.println ("");
        System.out.println ("Strength: " + charstr); 
        System.out.println ("Constitution: " + charcon); 
        System.out.println ("Dexterity: " + chardex); 
        System.out.println ("Wisdom: " + charwis); 
        System.out.println ("Intelligence: " + charint); 
        System.out.println ("Charisma: " + charcha); 
    }
}
