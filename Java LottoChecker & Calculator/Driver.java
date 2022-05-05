/*
# Class name: Driver
# Name: ANUJ SHARMA
# Student number: 3820112

# Class description:This class Driver only contains one method - main-. It only runs the program
and directs to class A1 where all of the program logic is stored. It also displays a successfull
termination message after the program finished running. Once the program has finished running,
it will return to main class and then terminate.If an error occurs during the user input phase,
the program displays the error message and terminate. 

*/
public class Driver{
    public static void main(String[] args) {
        
        A1 object = new A1();// Defines a new object of type A1 to access the A1 class 
        object.menu();// Directs the program to A1 class 
        System.out.println("\n******** PROGRAM TERMINATED ********\n\t HAVE A NICE DAY\n\n\n");// Displays the terminaton message 
    }
}