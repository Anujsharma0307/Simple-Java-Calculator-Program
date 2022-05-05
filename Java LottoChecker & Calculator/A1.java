import java.util.Random;
import java.util.Scanner;
/*
# Class name: A1
# Name: Anuj Sharma
# Student number: 3820112
# Class description: This class has all methods required to run Calculator and Lotto Checker. 
User can choose between Lotto checker and Calculator from the menu
*/


public class A1{
    
    
    public void menu(){
        /*
        # method description: This method displays the menu and gives the user the choice of chosing either  Calculator or a Lotto Checker 
        # param: None
        # return: None
        # exceptions: Invalid input: The input provided must either be a string type or any integer other than {1,2}.
          The program displays the error message and terminate the program.
        */
        
        Scanner in = new Scanner(System.in);// Defines a new scanner named 'in'
        int user_in=0;
        System.out.println("\n\nHello mate!! \nWelcome to the Program\n ");//Prints the welcome message
        System.out.print("PRESS 1 For CALCULATOR\nPRESS 2 For LOTTO CHECKER\n\n");   
        if(!in.hasNextInt()){// Checks the given input is an integer or not
            System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
            // Terminates the Program 
        }
        else{
            user_in = in.nextInt();
        }
        if (user_in==1){
                
            System.out.println(calculate());// Directs to the Calculate method
        }
        else if(user_in==2){
            
            System.out.println(checkLotto());// Directs to the Checklotto method
        }
        if (user_in!=1 && user_in!=2){
                
            System.err.println("\n\nSORRY!!\nThe Input provided must be either be 1 or 2. Try Again....\n\n\n ");
            System.exit(0);
        }

        in.close();// Closes the scanner
    }



    public double calculate(){
        /*
        # method description: This method contains all the logic for the calculator.
        It takes 2 integer type values from the user and ask for the operation they 
        want to perform between those values and provide the final the answer 
        # param: None
        # return: 0
        # exceptions: Invalid input: The input provided must either be a string type or any integer value out of the provided range.
          The program displays the error message and terminate the program.
        */
        double number1=0; double number2=0;int number3=0;
        double answer=0;
        Scanner in = new Scanner(System.in);

        System.out.print("\nYou Chose CALCULATOR Now Let's do some Calculation\n\n");
                System.out.println("\nEnter number 1:\n ");
                if(!in.hasNextInt()){// Checks the given input is an integer or not
                    System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
                    System.exit(0);
                }
                else { number1 = in.nextDouble();// Takes the input for Number 1
                }
                System.out.println("\nEnter number 2:\n ");
                if(!in.hasNextInt()){// Checks the given input is an integer or not
                    System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
                    System.exit(0);
                }
                else {number2 = in.nextDouble();// Takes the input for Number 2
                }
                System.out.println("\n==========================");
                System.out.println("\nEnter 0-3 to choose:\n\n0:Addition\n1:Subtraction\n2:Multiplication\n3:Division\n");
                if(!in.hasNextInt()){// Checks the given input is an integer or not
                    System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
                    System.exit(0);
                }
                else {number3 = in.nextInt();// Takes the input for Number 3
                }
                System.out.println("\n========================== ");

                in.close();
            
            if(number3>3 || number3<0){// Checks the validity of the operation requested by the user
                System.err.println("The input was not correct!\nTry Again!");
                return -1;
            }
            else {System.out.print("\nAnswer ");
            }
            
                switch(number3){
                case 0:// Addition case 
                    answer = number1+number2;
                    return answer;
                case 1:// Subtraction Case
                    answer = number1-number2;
                    return answer;
                case 2:// Multiplication Case
                    answer = number1*number2;
                    return answer;
                case 3:
                    if(number2 == 0){// Checks for the zero divion error
                        System.err.println("Sorry!! The input was not correct Cannot divide by Zero!\nTry Again!");
                        return -2;
                    }
                    else{// Division Case
                        answer = number1/number2;
                        return answer;// Generates the final answer   
                    }
                    
                } 
        
        return 0; 
        
    }
    
    
    public String checkLotto(){
        /*
       # method description: This method contains all the logic for the Lotto Checker. 
       It takes three integer type entries from the user, generates 8 random numbers and
       checks how many of the entries from the user matches the random and displays the result 
       consisting of correct guesses and total number of correct guesses. 
       # param: None 
       # return: String ""
       # exceptions: Invalid input: The input provided must either be a string type or any integer value out of the provided range.
        The program displays the error message and terminate the program.
       */
        
        Scanner in= new Scanner(System.in);
        int chosen1=0; 
        int chosen2=0; 
        int chosen3=0;

        System.out.print("\nYou Chose Lotto Checker. Lets Check you LUCK TODAY!!\n\n!! DONT'T FORGET U CAN ONLY CHOOSE NUMBERS BETWEEN 1 TO 24 !!\n\n\t\t\tALL THE BEST!!!\n\n");
         System.out.print("\nWhat is your first Number?\n\n");   
        if(!in.hasNextInt()){// Checks the given input is an integer or not
            System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n");
            System.exit(0);
        } 
        else { chosen1 = in.nextInt();
        }   
        if (chosen1<1||chosen1>24){// Checks the range of First Number
            System.out.print("\nOops!! Invalid input must enter between 1 to 24\n\n");
            System.exit(0);
        }
        else {System.out.print("\nWhat is your Second Number?\n\n");
        }
        if(!in.hasNextInt()){// Checks the given input is an integer or not
            System.out.print("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
            System.exit(0);
            } 
            
        else { chosen2=in.nextInt();
        }
            if (chosen2<1||chosen2>24){//Checks the range of Second Number
               System.out.print("\nOops!! Invalid input must enter between 1 to 24\n\n");
               System.exit(0);
               }
            else { System.out.print("\nWhat is your Third Number?\n\n");}
                if(!in.hasNextInt()){// Checks the given input is an integer or not// Checks the given input is an integer or not
                   System.err.println("\n\nSorry mate (" +in.next()+ ") was not something we were looking for Try writing an integer value next time\nTRY AGAIN!! Incorrect input.....\n\n\n");
                   System.exit(0);
                   }  
                   
                else { chosen3 = in.nextInt();
                }
                in.close();
                if (chosen3<1||chosen3>24){//Checks the range of Third Number
                    System.err.println("\nOops!! Invalid input must enter between 1 to 24\n\n");
                    System.exit(0);
                     }
                     
                    else {
                        System.out.println("\n\n====================================================================================");
                        System.out.print("\n\nYou Choose: "+ chosen1+" "+""+chosen2+""+" and "+chosen3+"");// Displays the guesses
                    
                        Random rand = new Random();
                        
                        // Generates the random numbers between 1 to 24 
                        int n1=rand.nextInt((23)+1)+1;
                        int n2=rand.nextInt((23)+1)+1;
                        int n3=rand.nextInt((23)+1)+1;
                        int n4=rand.nextInt((23)+1)+1;
                        int n5=rand.nextInt((23)+1)+1;
                        int n6=rand.nextInt((23)+1)+1;
                        int n7=rand.nextInt((23)+1)+1;
                        int n8=rand.nextInt((23)+1)+1;

        
                        // Displays the generated random numbers
                        System.out.print("\n\nThe generated number are " +n1+"\t");
                        System.out.print( +n2+"\t");
                        System.out.print( +n3+"\t");
                        System.out.print( +n4+"\t");
                        System.out.print( +n5+"\t");
                        System.out.print( +n6+"\t");
                        System.out.print( +n7+"\t");
                        System.out.print( +n8+"\t");
                        System.out.println("\n\n====================================================================================");

                        String final_ans1 = "\n\nSorry none of your numbers match\nBetter luck next time!\n\n\n";
                        String final_ans = "";
                        int count = 0;
                        int correct_guesses=0;
                        
                        if (chosen1==n1 || chosen1==n2 || chosen1==n3 ||chosen1==n4 ||chosen1==n5 ||chosen1==n6 ||chosen1==n7 || chosen1==n8){
                            final_ans = " "+chosen1;// Checks the correctness of the First number
                            correct_guesses=1;
                            count = 1;
                        }
                        if (chosen2==n1 || chosen2==n2 || chosen2==n3 ||chosen2==n4 ||chosen2==n5 ||chosen2==n6 ||chosen2==n7 || chosen2==n8){
                            final_ans += " "+chosen2;// Checks the correctness of the Second Number
                            correct_guesses+=1;
                            count=1;
                        }
                        if (chosen3==n1 || chosen3==n2 || chosen3==n3 ||chosen3==n4 ||chosen3==n5 ||chosen3==n6 ||chosen3==n7 || chosen3==n8){
                            final_ans += " "+chosen3;// Checks the correctness of the Third Number
                            correct_guesses+=1;
                            count=1;
                        }
                        
                        if (chosen1!=n1 && chosen1!=n2 && chosen1!=n3 && chosen1!=n4 && chosen1!=n5 && chosen1!=n6 && chosen1!=n7 && chosen1!=n8 &&
                            chosen2!=n1 && chosen2!=n2 && chosen2!=n3 && chosen2!=n4 && chosen2!=n5 && chosen2!=n6 && chosen2!=n7 && chosen2!=n8 && 
                            chosen3!=n1 && chosen3!=n2 && chosen3!=n3 && chosen3!=n4 && chosen3!=n5 && chosen3!=n6 && chosen3!=n7 && chosen3!=n8){
                            return final_ans1;// Display the Sorry message if none of the guesses were correct
                        }
                        if(count == 1 ){
                            return ("\n\nYour correct guess are: "+final_ans+"\n\nTotal number of correct guesses are: "+correct_guesses+"\n");//Displays the correct guess and total number of coorect guesses.
                                                
                        }
                       
                } 
                
        return "";     //Returns the string   
    }
}   
