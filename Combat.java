

public class Combat
{
    // instance variables - replace the example below with your own
    private int x;
    String character;
    String monster;

    public Combat(CharacterSheet charname, String monname)
    {
        MonsterSheet monster = new MonsterSheet(monname);
        
        Combatstats(monster , charname);
    }

    
    public void Combatstats(MonsterSheet monster , CharacterSheet character){
        character.Showcharstats();
        monster.Showmonstats();
    }
}
