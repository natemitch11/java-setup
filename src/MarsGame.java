import java.util.Scanner;

public class MarsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whoa... It looks like we are on Mars... What color is your spacesuit?");

        String color = input.nextLine();
        System.out.println("Nice, " + color + " is awesome.");

        System.out.println("What do you think we should do next?");
        String doNext = input.nextLine();
        System.out.println("I agree, we should " + doNext);

        System.out.println("Hey... I just realized I never got your name, comrade...");
        String name = input.nextLine();
        System.out.println("Wow... to think I'd be stuck here with a " + name);

        System.out.println("Well, might as well finish the mission "+ name +". Do you have your tools?");
        String toolsQ = input.nextLine();
        System.out.println("Lets get going");

        System.out.println("Do you think Houston can see me right now?");
        String seeMe = input.nextLine();
        System.out.println("Yeah, Yeah, so what if I am childish. Its a big camera in my face ok!");
    }
}
