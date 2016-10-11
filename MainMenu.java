import java.util.*;
// this class will be for starting a new game or loading an old one
public class MainMenu
{

    String name;
    int choice;
    int Textdelay = 2;
    Scanner scan = new Scanner(System.in);

    public MainMenu()
    {
        System.out.println("Welcome to Battle Master");
        System.out.println("Please enter your name");
        
        
        name = scan.next();
        
        System.out.println("Welcome " + name + ", to Battle Master");
        System.out.println("How old are are you " + name + " ?");
        
        int age = scan.nextInt();
        
        CharacterSheet name = new CharacterSheet(this.name,age);
        
        System.out.println("Your name is " + name.Getname() + " and you are " + name.Getage() + " years old correct?");
        p("1)Yes");
        p("2)No");
        choice = Makechoice(2);
        if(choice == 1){
        pause(3);
        p("");
        p("");
        Firststeps(name);
    }
        else if (choice == 2){
        p("TOO BAD!");
        pause(3);
        Firststeps(name);
        }
    }
    
    public void Firststeps(CharacterSheet name){
        pd("Some things are certain, some are left to chance, and others are placed in the hands of mortals.");
        pd("You have spent your life making choices of little consequence. Together, they culminate and create your life at present");
        pd("Your first choice, so far as you remember, was when your family asked what you would like to do to help.");
        p("1) I helped my father grow crops");
        p("2) I worked with my mother to make clothing and crafts");
        p("3) I bartered and helped sell good come market day");
        choice = Makechoice(3);
        
        if (choice == 1){
            name.charhistory("farmer");
            name.charstr = 12;
            name.charcon = 14;
            name.chardex = 10;
            name.charwis = 10;
            name.charint = 10;
            name.charcha = 10;}
            else if (choice == 2){
            name.charhistory("mrafter");
            name.charstr = 10;
            name.charcon = 10;
            name.chardex = 12;
            name.charwis = 12;
            name.charint = 12;
            name.charcha = 10;}
            else if (choice == 3){
            name.charhistory("merchant");
            name.charstr = 10;
            name.charcon = 10;
            name.chardex = 10;
            name.charwis = 12;
            name.charint = 10;
            name.charcha = 14;}
        pd("Your experience gained as a " + name.Getcharhistory() + " will serve you well");
        pd("Story here. Grew up doing the thing you said before.");
        Townsquare(name);
        
        
    }
    
    public void Townsquare(CharacterSheet name){
    
    pd("What would you like to do?");
    p("1) Go exploring");
    p("2) Go to the market district");
    p("3) Go home");
    p("4) Take a nap");
    choice = Makechoice(4);
    Combat firstfight = new Combat(name , "Spider");
    }
    
    static int Makechoice(int options){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose...");
        int choice = 0;
       try
       {
           choice = sc.nextInt();
        }
        catch(InputMismatchException exception)
        {
        p("Please select a valid choice");
        Makechoice(options);
       }
       if (choice <= 0 || choice > options){
            p("Please select a valid choice");
        Makechoice(options);
       }
       return choice;
    
    }
    //Prints text without delay
    static void p(String x){
        System.out.println(x);
    }
    //Prints text but with the delay specified 
    public void pd(String x){
        System.out.println(x);
        pause(Textdelay);
    }
    //Should cause a x second delay
    public void pause(int x){
         try {Thread.sleep((x * 1000));
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
