package hash;

import java.util.*; 
import java.util.logging.ConsoleHandler;


import java.util.logging.Level;

import java.util.logging.Logger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.logging.Level;

//Example of data retrieval with Hashing!
public class HashData extends CreateUser
{
    public static void main(String args[]) 
    { 
    	//basic logger telling level
    	Logger logger = Logger.getLogger(LoggingExample.class.getName());
    	logger.log(Level.INFO, "Drone");
    	
    	//clears the screen
        System.out.print('\u000C');
        
        //set integer exit equal to 0
        int exit=0;
        
        // Create a HashTable to store data about users
        // String values corresponding to string of arraylist
        LinkedHashMap<String, List<String>> UserInfo= new LinkedHashMap<>(); 
        
        //creates a list to store values for Fox Davenport
        List<String> FoxDavenport= new ArrayList<String>();
        FoxDavenport.add("UltimateLifeForm@gmail.com");
        FoxDavenport.add("Pineapple Pizza");
        
        //create a list to store values for Daniel Yang
        List<String> DanielYang= new ArrayList<String>();
        DanielYang.add("danielyang@yahoo.com");
        DanielYang.add("Tyler1");
        
        //create a list to store values for Mithil Pujar
        List<String> MithilPujar= new ArrayList<String>();
        MithilPujar.add("HugeMuscleMithil@muscle.com");
        MithilPujar.add("MUSCLE!");
        
        //create a list to store values for Mr. John
        List<String> MrJohn= new ArrayList<String>();
        MrJohn.add("OurLordAndSavior@holy.com");
        MrJohn.add("CodePower");
        
        //create a list to store values for Alex Clanton
        List<String> AlexClanton= new ArrayList<String>();
        AlexClanton.add("BadCoder@terrible.com");
        AlexClanton.add("CacaPooPoo");
        
        //create a list to store values for order 
        List<String> CT = new ArrayList<String>();
        CT.add("Email: ");
        CT.add("Password: ");
        
        //creates a scanner object for input from user
        Scanner input= new Scanner(System.in);
        
        CreateUser CU= new CreateUser();
        
        //Input some user info into the map
        UserInfo.put("Fox Davenport", FoxDavenport);
        UserInfo.put("Mithil Pujar", MithilPujar);
        UserInfo.put("Daniel Yang", DanielYang);
        UserInfo.put("Mr. John", MrJohn);
        UserInfo.put("Alex Clanton", AlexClanton);
        
        
        System.out.println("Hi! Welcome to our mini databse! Please input a user you would like to learn about");
        System.out.println("Press 0 when you want to exit");
        
        System.out.println("Would you like to add an user? If so press y. If not press n");
        
        char bruh = input.next().charAt(0);
        
        if (bruh=='y') {
            List<String> NewUserInfo= run();
        }
        
        if (bruh=='n') {
            System.out.println("You may not add users now");
        }
        
        // HashMap's key set
        Set<String> Username = UserInfo.keySet();
        System.out.println("Users: " + Username);
        
       //loops till user wants to exit
       while (exit==0){      	
        System.out.println("Which one do you want to get info on?");
        System.out.println("Please input the number of the user. Ex: Fox is 1, Mithil 2, etc...");
        char user = input.next().charAt(0);
        
       if (user=='0') {
            exit=1;
            String done= "done";
            System.out.println(done);
        }
        
        if(user=='1') {
            List<String> FoxInfo= UserInfo.get("Fox Davenport");
            System.out.println("Fox's info: ");
            System.out.println(CT.get(0)+ FoxInfo.get(0)); 
            System.out.println(CT.get(1)+ FoxInfo.get(1) + "\n");
       } 
    
       if(user=='2') {
    	List<String> MithilInfo= UserInfo.get("Mithil Pujar");
        System.out.println("Mithil's info: ");
        System.out.println(CT.get(0) + MithilInfo.get(0));
        System.out.println(CT.get(1)+ MithilInfo.get(1) + "\n");
       } 

       if(user=='3') {
    	    List<String> DanielInfo= UserInfo.get("Daniel Yang");
            System.out.println("Daniel's info: ");
            System.out.println(CT.get(0) + DanielInfo.get(0));
            System.out.println(CT.get(1)+ DanielInfo.get(1)+ "\n");
            
       }
    
       if(user=='4') {
    	   List<String> JohnInfo= UserInfo.get("Mr. John");
        System.out.println("Mr John's info: ");
        System.out.println(CT.get(0)+JohnInfo.get(0));
        System.out.println(CT.get(1)+JohnInfo.get(1)+ "\n");
       } 
    
       if(user=='5') {
    	   List<String> AlexInfo=UserInfo.get("Alex Clanton");
        System.out.println("Alex's info: ");
        System.out.println(CT.get(0)+AlexInfo.get(0));
        System.out.println(CT.get(1)+AlexInfo.get(1)+ "\n");
    } 
    
    if(user=='6'){
        List<String> NewUserInfo= run();
        System.out.println(NewUserInfo);
}
}
}
}
