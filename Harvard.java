import java.util.Scanner;
/**
 * Write a description of class Harvard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harvard implements Location {
    @Override
    public String getName() {
        // Location name will match class name for convenience
        return "Harvard";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
        // put your code here
        System.out.println("*Its you first day of college at Harvard!*");
        System.out.println("The time is " + p.getHour());
        
        Thread.sleep(1000);
        System.out.println("Man I'm really excited for college!");
        Thread.sleep(1000);
        System.out.println("*A random fellow freshman walks up to you.*");
        Thread.sleep(1000);
        System.out.println("Hi! I'm uhh ... Toby! -Toby");
        Thread.sleep(1000);
        System.out.println("How do you respond to Toby? [Hi] or [Akwardly walk away]");
        Scanner sc = new Scanner(System.in);
        String userinput = sc.nextLine();
        userinput = userinput.toUpperCase();
        if(userinput.indexOf("HI") > -1 || userinput.indexOf("HELLO") > -1 ) {
            System.out.println("Whats going on? I'm excited to be here! -Toby");
            Thread.sleep(1000);
            System.out.println("Me too");
            Thread.sleep(1000);
            System.out.println("I'm going to join the dungeons and dragons club! You want to join in? - Toby");
            Thread.sleep(1000);
            System.out.println("Are you going to join the dungeons and dragons club? [YES] or [No].");
            String moreUserinput = sc.nextLine();
            moreUserinput = moreUserinput.toUpperCase();
            if(moreUserinput.indexOf("YES") > -1 || moreUserinput.indexOf("YA") > -1 ) {
                p.addClub("Dungeons and Dragons");
            } else {
                System.out.println("Thats ok. If you change you mind let me know! - Toby");
            }
        } else {
             Thread.sleep(1000);
             System.out.println("*You walk away.*")
             ;Thread.sleep(1000);
             System.out.println("Hey, you don't want to be friends? -Toby");
             ;Thread.sleep(1000);
             System.out.println("Maybe later. ");
        }
        System.out.println("*!*");
        return "l";
    }
}
