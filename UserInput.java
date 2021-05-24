import java.util.EventListener;
import java.util.Scanner;

public class UserInput
{
    String name;
    String major;
    String skills;
 public UserInput()
 {
     String[] majors = {"Computer Science", "Business", "Mathematics"};
     String[] skillsCS = {"Java", "Python", "MIPS"};
     String[] skillsMath = {"Addition", "Subtraction", "Division"};
     String[] skillsBusiness = {"Accounting", "Finance", "Management?"};
     
     Scanner inScan = new Scanner(System.in);

     System.out.println("What is your first name?");
        this.name = inScan.nextLine();
     
        System.out.println("What is your major?");
     System.out.println("Choices:");
     System.out.println("1)Computer Science");
     System.out.println("2)Business");
     System.out.println("3)Mathematics");
     System.out.println("Press (1) (2) (3)");
     System.out.println("--------------------------------------------------------------------------------");
        int num = inScan.nextInt();
        while(true)
        {
            if((num < 1) || (num > 3))
            {
                System.out.println("Im sorry. Try again.");
                num = inScan.nextInt();

            }else 
            {
                this.major = majors[num-1];
                break;
            }
        }
        
        System.out.println("What are your skills?");
        if(major == "Computer Science")
        {
            System.out.println("Choices:");
            System.out.println("1)Java");
            System.out.println("2)Python");
            System.out.println("3)MIPS");
            System.out.println("--------------------------------------------------------------------------------");
            num = inScan.nextInt();
        
            while(true)
            {
                if((num < 1) || (num > 3))
                {
                    System.out.println("Im sorry. Try again.");
                    num = inScan.nextInt();

                }else{
                
                    this.skills = skillsCS[num-1];
                    break;
                }
            }
        }else if(major == "Mathematics")
        {
            System.out.println("Choices:");
            System.out.println("1)Addition");
            System.out.println("2)Subtraction");
            System.out.println("3)Division");
            System.out.println("--------------------------------------------------------------------------------");
            num = inScan.nextInt();
        
            while(true)
            {
                if((num < 1) || (num > 3))
                {
                    System.out.println("Im sorry. Try again.");
                    num = inScan.nextInt();

                }else{
                
                    this.skills = skillsMath[num-1];
                    break;
                }
            }
        }else if(major == "Business")
        {
            System.out.println("Choices:");
            System.out.println("1)Accounting");
            System.out.println("2)Finance");
            System.out.println("3)Management");
            System.out.println("--------------------------------------------------------------------------------");
            num = inScan.nextInt();
        
            while(true)
            {
                if((num < 1) || (num > 3))
                {
                    System.out.println("Im sorry. Try again.");
                    num = inScan.nextInt();

                }else{
                
                    this.skills = skillsBusiness[num-1];
                    break;
                }
            }
        }

 }

 public getName()
 {
     return this.name;
 }

 public getMajor()
 {
     return this.major;
 }

 public getSkills()
 {
     return this.skills;
 }
}



