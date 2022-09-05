
import java.util.Arrays; 
import java.lang.StringBuilder;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.lang.Math;
import java.util.List;

 




    


public class program {
    int lucky;
    int str;
    int hp;
    String name;
    String enemyname;
      
    public static void main(String[] args) {
        
       // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
      // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
        // TODO Auto-generated method stub
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        Scanner input = new Scanner(System.in);
        
        //boolean mainLoop = true;

        int choice;
        while(true){
            

        // identify function choice
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("1.) Function1.\n");
            System.out.print("2.) Function2.\n");
            System.out.print("3.) Function3.\n");
            System.out.print("4.) Function4.\n");
            System.out.print("5.) Function5.\n");
            System.out.print("6.) Function6.\n");
            System.out.print("7.) Function7.\n");
            System.out.print("8.) Function8.\n");
            System.out.print("9.) Function9.\n");
            System.out.print("10.) Function10.\n");
            System.out.print("11.) Function11.\n");
            System.out.print("12.) Function12.\n");
            System.out.print("13.) Function13.\n");
            System.out.print("14.) Function14.\n");
            System.out.print("15.) Function15.\n");
            System.out.print("16.) Function16.\n");
            //program exit
            System.out.print("17.) Exit\n"); 
            System.out.print("\nEnter Your Menu Choice: ");
            
            choice = input.nextInt();

            




        switch(choice){

        case 1:
        // Hello world.
             System.out.println("Hello, World!"); 
             break;

        case 2: 
        // Name and Age.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your firstname :");
        String firstname=s.nextLine();
        System.out.println("Enter your lastnname :");
        String lastname=s.nextLine();
        System.out.println("Enter your age :");
        int age=s.nextInt();
        System.out.println("FirstName :"+firstname);
        System.out.println("LastName :"+lastname);
        System.out.println("Age :"+age);
        
            break;

        case 3:
         Scanner f =new Scanner(System.in);
         System.out.println("TEXT :");
         String  text =f.nextLine();
         System.out.println(ANSI_RED + text + ANSI_RESET);
        
        break;

        case 4: 
        //  Date.
            java.util.Date today =  new java.util.Date();
            System.out.println(today);

            break;

        case 5:
        // Find the largest number.
        int numberOne, numberTwo, largest;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the First Number: ");
        numberOne = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        numberTwo = scan.nextInt();
        
        if(numberOne>numberTwo)
           largest = numberOne;
        else
           largest = numberTwo;
        
        System.out.println("\nLargest = " +largest);
            
            break;

        case 6:
       // Guess a number between 1 and 100.
        Guessinggame();
        
            break;

        case 7:
        // save a text file.
        filesave();

            break;

        case 8:
        //load .
        fileload();

            break;
            
        case 9:
        decimaltal();

            break;

        case 10:
        table();
      
        
            break;
        
        case 11:
        arrays();

            break;

        case 12:
        
        Palindrome();
        
            break;
        
        
        case 13:
        //function 13
            mellan();
            break;
        
        case 14:
        //function 14
        //oddeven ();
        odd ();
            break;
        case 15:
        //function 15
        addinput();
            break;

        case 16:
            //function 16
            rpg ();
                break;
       
        case 17: 
            System.out.println("Exiting Program...");
            System.exit(0);
             break;
        default:
        System.out.println(choice + " is not a valid Menu Option! Please Select Another.");
        break;

    }
    }



}

    


//case 6
private static void Guessinggame(){
    // Scanner Class
   Scanner input = new Scanner(System.in);
   String another = "";
   int answer, guess,attemptsNum = 0;
   
    // Generate the numbers
   Random generator = new Random();
   answer = generator.nextInt(100)+1;

   System.out.println("Guess a number between 1 and 100");
   System.out.println("Enter your guess (0 to quit):");
  // Take input for guessing
  guess = input.nextInt();
      
     // Enter 0 or correct answer to quit
   while (guess != answer && guess != 0) {
     
     // If the number is guessed
       if(guess==answer)
           System.out.println("Right!");
        // If the number is lower   
     else if (guess<answer) {
       System.out.println("Your guess was too LOW.");
       attemptsNum++; //Guessing times
       System.out.println ("Guessing times " + attemptsNum);
       guess = input.nextInt();
     } 
     else {
        // If the number is higher
       System.out.println("Your guess was too HIGH.");
       attemptsNum++;
       System.out.println ("Guessing times " + attemptsNum);
       guess = input.nextInt();
     }
   }

   System.out.println ("The number was " + answer);
   System.out.println("Want to Play again?(y/n)");
   another = input.next();
   System.out.println("Any keys back to the menu = " + another);
   // Play again
   if(another.equals("y")) {
    Guessinggame();
   } else {
     System.out.println("Goodbye!");
     
   }
   
}
   // function 7
   private static void filesave(){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Text :" );
    String save = input.nextLine();
    System.out.println("Your Text :" + save);
     // output file in src file.
     try {
        
    BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt"));
        writer.write(save);
        writer.close();
        System.out.println("Successfully saved :" + save);
     } catch (IOException e) {
     e.printStackTrace();
    }


}

// function 8
private static void fileload(){
    try {
    //read the test file in src file
    BufferedReader reader = new BufferedReader(new FileReader("Test.txt"));
        
    System.out.println(reader.readLine());
        reader.close();
        System.out.println("Successfully read, Goodbye! ");
     } catch (IOException e) {
     e.printStackTrace();
    }


}
// function 9
private static void decimaltal(){

    
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a decimal number ");
    double b= input.nextDouble();
    System.out.println("Enter a power of this number ");
    int p = input.nextInt();
    
    //for (int  i=1; i<=p ;i++);{
        
      // result = b*result ;
    
    double result = Math.pow(b, p);
   
    //}
    System.out.println( "The result = " + result);
    
}   


//function 10
private static void table(){
    int r = 1 ;
    // column
    while(r < 11) 
    {
        // row
    for (int i = 1; i< 11 ; i++){
        // 
            System.out.print( r + "*" + i + "=" +  r * i + " " );

        }
        // ”tabb” " \t"
       System.out.println();

       r++;
    }

}


// function 11
  private static void arrays(){
int[] firstArray = {222,333,444,555,111};        //source array  
System.out.println("Input numbers are "  + Arrays.toString(firstArray) ); // prints the input numbers array
int[] secondArray = new int [6] ;  //random 6 numbers              
//destination array 
for(int index = 0; index < secondArray.length;index++ ) 
{
  secondArray [ index ] = (int) (Math.random()*11);// random nubmers less than 10
}
System.out.println("Random numbers are "  + Arrays.toString(secondArray) );// prints the Random numbers array
int first = firstArray.length;        //determines length of firstArray  
int second = secondArray.length;   //determines length of secondArray  
int[] result = new int[first + second];  //resultant array of size first array and second array  
System.arraycopy(firstArray, 0, result, 0, first);  
System.arraycopy(secondArray, 0, result, first, second);  
System.out.println("All numbers are " + Arrays.toString(result));    //prints the resultant array 
System.out.println("Ascending order " );

// Ascending order sorting
int temp = 0;
for(int i = 0; i < result.length;i++ ) {
  for(int j = i; j < result.length;j++ ){
    if( result[i] > result[j] ){
       temp  = result[i];
       result[i] = result[j];
       result[j] =temp;
      }
    }
    
    
  
  }
  for(int i = 0; i < result.length;i++ ) {
    
    System.out.println( result[i]);
    
  }
}

private static void Palindrome(){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a word :" );
    String s = input.nextLine();
    StringBuilder builder = new StringBuilder(s);
    // StringBuilder reverse function. Check a input word from back.
    String output = builder.reverse().toString();
    if(s.equals(output)){
        System.out.println("Palindrome" );
       }else{
        
        System.out.println("Not a palindrome" );

      }
      
    }
  




    //function 13
    private static void  mellan(){

        int num1, num2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please type a number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        num2 = keyboard.nextInt();
        
        System.out.print("All the numbers in between the two inputs numbers : " );
        System.out.print("\n");
        int smallNum = 0; // Identify small number
        int largeNum = 0; // Identify large number
        boolean isNum1Large = false;
        if (num1 - num2 > 0) {
            smallNum = num2;
            largeNum = num1;
            isNum1Large = true;
        } else {
            smallNum = num1;
            largeNum = num2;
        }
     
        if (isNum1Large) { //If first number is large
            for (int i = largeNum - 1 ; i > smallNum; i--) {
                {
                    System.out.println(i );
                }
            }
        } else { //If first number is small
            for (int i = smallNum + 1 ; i < largeNum; i++) {
                {

                    System.out.println( i );
                }
            }
       }
   }
   
 /*  private static void oddeven (){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Please type integers with Comma Separated: ");
        String s = input.nextLine();
        //delimiter  Comma Separated
        String [] allnumber = s.split(",");
        
        for (String item : allnumber) {
       int number = Integer.parseInt(item);
       if (number % 2 == 0) {
        System.out.print("even numbers:" + number );
       //} else {
       // System.out.println( "odd:"  + " "  +  number );
          } else {
            
            System.out.print("odd numbers:" + number);
        }
    }

  } */



        
        
    
    //function 15
    private static void addinput (){
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please type integers with Comma Separated: ");
        String s = input.nextLine();
        //delimiter  Comma Separated
        String [] addnumbers = s.split(",");
       // sum of numbers
        int sum = 0;
        for(String adnum : addnumbers){
            // convert String to Integer
        sum += Integer.parseInt(adnum);


    }
           System.out.println("sum :" +sum );

    }
    //function 14 
    private static void odd (){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Please type integers with Comma Separated: ");
        String s = input.nextLine();
        // an array of size 
        int even[] = new int[20]; 
        int odd[] = new int[20];
        //delimiter  Comma Separated
        String [] r = s.split(",");
        int j=0,k=0,oddChecker=0,evenChecker=0;
        for(int i=0;i<r.length;i++){
             // check even numbers 
            if(Integer.parseInt(r[i])%2 == 0){
                 // convert String to Integer
                even[j] = Integer.parseInt(r[i]);
                        ++j;
            // even numbers check
                evenChecker = 1;
        
            }   

            // else even numbers
            else{
                // convert String to Integer
                odd[k] = Integer.parseInt(r[i]);
                ++k;
            // odd numbers check
            oddChecker = 1;
            }
        
        }
        
        
        if(oddChecker == 0){
            System.out.println("even");
            System.exit(0);
        }
        
        if(evenChecker == 0){
            System.out.println("odd");
            System.exit(0);
        }
        
        
        
        System.out.println("Even numbers:");
        
        // result even 
        for(int i=0;i<j;i++){
        if(i!=j-1){
                System.out.print(even[i]+",");
        }
        else{
            System.out.print(even[i]);
        }
        }
        System.out.println();
        System.out.println("Odd numbers:");
        // result odd 
        for(int i=0;i<k;i++){
        if(i!=k-1){
                System.out.print(odd[i]+",");
        }
        else{
            System.out.print(odd[i]);
        }
    } 
    
  
    

}
  public static void rpg (){
    program a = new program();
    int str;
    int hp;
    int lucky;
    String name;
    String enemyname;
     
      
       // user in put
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your name:"); 
      name = keyboard.nextLine();
      Random rand = new Random();
        // random vaules
        str = rand.nextInt(10);
        hp = rand.nextInt(10);
        lucky = rand.nextInt(10);
        a.setName(name);
        a.setStr(str);
        a.setHp(hp);
        a.setLucky(lucky);   
      System.out.println("\nName: " + name + "\nStrength: " + str + "\nHealth: " + hp +"\nLuck: " + lucky ); 
      
      System.out.println("Enter your enemy's name:");
      enemyname = keyboard.nextLine();
      str = rand.nextInt(10);
       hp = rand.nextInt(10);
      lucky = rand.nextInt(10);
        a.setEnemyname(enemyname);
        a.setStr(str);
        a.setHp(hp);
        a.setLucky(lucky);   
      System.out.print("\nEnemy's Name: " + enemyname + "\nStrength: " + str + "\nHealth: " + hp +"\nLuck: " + lucky ); 
      

 }
 public void Rpg(String name,int str,int hp,int lucky){
    this.name = name;
    this.str = str;
    this.hp = hp;
    this.lucky =  lucky;
}
 public String toString(){
    String result = "";
    
    result = "\nName: " + name + "\nStrength: " + str + "\nHealth: " + hp +"\nLuck: " + lucky ;
    return result;
}


public String getName() {
    return name;
}




public void setName(String name) {
    this.name = name;
}




public String getEnemyname() {
    return enemyname;
}




public void setEnemyname(String enemyname) {
    this.enemyname = enemyname;
}




public int getLucky() {
    return lucky;
}




public void setLucky(int lucky) {
    this.lucky = lucky;
}




public int getStr() {
    return str;
}




public void setStr(int str) {
    this.str = str;
}




public int getHp() {
    return hp;
}




public void setHp(int hp) {
    this.hp = hp;
} 

}
