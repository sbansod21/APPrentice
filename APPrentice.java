import java.util.*;

public class APPrentice{

    public static void main(String[]args)
    {
        Scanner inScan = new Scanner(System.in);
        System.out.println("Hey! Welcome to apprentice!");
        System.out.println("Our Mission:To accelerate the students transition to the workplace");
        System.out.println("Do you have a pre-existing profile?");

        String ans = inScan.nextLine();

        if(ans.equalsIgnoreCase("y"))
        {//write a get user profile method, like ask for their name and thier major and search a 'database'
            System.out.println("Please enter your name and your major so I can find you...");
            String name = inScan.next();
            String major = inScan.next();

            //find in database
            
        }else if(ans.equalsIgnoreCase("n"))
        {
            UserInput x = new UserInput();
            System.out.println("Thank you for creating a profile");
        }

        //from here, we want to create a class for each thing? idk how we want to create an access the interview questions?
        //maybe have a textfile that can be changed? one for eveery skill/major and a behavioral one. then we can use a random
        //number to get a question??

        //and lastly we need something that "reads" in the user answer. this is really open ended but i think that we should have
        //something that checks for keywords. Like if we asked a question about linked list then we check if the answer that the user
        //entered contains the keyword "head" and ".next" Thats what i was thinking because we can actually code it.

    }

}