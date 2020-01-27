/** Designed by LeeAnna Ewing 1/21/2020
CSC_251_91 Instructor: Dr Arrington

Review Project - Demo Program

Assignment Instructions:

Design and code a program that will process information for some of the top indoor arenas in the United States. 
Arena profiles contain information about the venue, as well as current major Tenant (sports team) that plays 
home games in the indoor arena. Arena profiles will be read from the text file IndoorArenas.txt. Download the 
text file from Blackboard (text file is under the Project 1 link).

Instructions

Use the UML class diagram provided to create the Arena and the Tenant classes. Each class should contain the 
specified fields and methods with correct accessors, mutators, as well as default no-argument constructors and 
overloaded constructors that accept arguments. Each class should also contain a toString method. Demonstrate 
aggregation by adding an instance of the Tenant class to the as a field in the the Arena class. Note: There is 
a “has a” Relationship between the Arena and Tenant class, which means EVERY Arena “has a” Tenant. Demonstrate 
your design in a program that will use loops to read the Arena information from the text file. Process the 
IndoorArenas.txt file in such a way that it can handle a similarly formatted file that contains any number of 
Arena profiles. 
 
The text file contains Arena Information in the following order:

Venue Name
City
State
Maximum Capacity
Year Opened
Team Name
Sport
League

Please note: The IndoorArenas.txt file should not be edited.  Your program should be able to process the text 
file as is. For each profile, create an instance of the Arena class, and store into an ArrayList that contains 
all of the Arena objects created for the profiles in the text file. Display the information processed from the 
file in the console. See Sample output section in this document.

Special Instructions:

You must use object-oriented principles in this project.  All data in the Arena and Tenants classes should be 
encapsulated. There should be no duplication of fields or methods in the Arena and Tenant classes. A separate 
demo program must be used to demonstrate your classes. Demo code must not be added to the Arena and/or Tenant 
classes. Use the toString method of the Arena class to display the policy information as shown in the sample 
output on page 2 of this document. Document your source code with single and multi-line comments.
*/

import java.util.*;
import java.io.*;


public class DemoProgram
{
   public static void main(String[] args) 
   {
      try
      {
         File file = new File("IndoorArenas.txt");
         Scanner inputFile = new Scanner(file);
         String venue, city, state, capacity_str;
         String year_str, team, sport, league;
         int capacity, year;
         
         //create arenas list
         ArrayList<Arena> arenas = new ArrayList<Arena>();
         
         //read file
         while(inputFile.hasNext())
         {
            venue = inputFile.nextLine();
            city = inputFile.nextLine();
            state = inputFile.nextLine();
            capacity_str = inputFile.nextLine();
            capacity = Integer.parseInt(capacity_str);
            year_str = inputFile.nextLine();
            year = Integer.parseInt(year_str);
            team = inputFile.nextLine();
            sport = inputFile.nextLine();
            league = inputFile.nextLine();
            
            if(inputFile.hasNext())
            {
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }

            //create Arena objects
            Arena arena = new Arena(venue, city, state, capacity, year, team, sport, league);
            //add arena objects to the ArrayList
            arenas.add(arena);
                   
          }//close while loop
          
         //close the input file 
         inputFile.close();
      
         //print out each object (arena) in the arrayList
         for(int i = 0; i < arenas.size(); i++)
         {
            System.out.println(arenas.get(i).toString() + "\n");
         }//close for loop
         
    }//close try
    catch(IOException ex)//if IOException throws then catch
    {
      //error message
      System.out.println("Something went wrong reading the file: " + ex.getMessage());
    }//close catch
  }//close main
}//fine