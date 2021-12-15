import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//allows user to to user prompts
		Scanner pam = new Scanner(System.in);
		//Prompts user to enter a direction
		System.out.println("Enter the direction to Move(W=UP, A=Left, Z=Down, S=Right): ");
		String operator=pam.next();//A string that examines individual characters
		
		//switch that tells the user what direction they moved
		switch(operator)
		    {
		//User moves up
		    case "W": 
			System.out.print("You moved UP");
            break ;
		//User moves left
		    case "A" :
		    System.out.print("You moved left");
		    break;
		//User moves down
		    case "S" :			
	        System.out.print("You moved down");
	        break;
	    //User moves right
		    case "D" :
	        System.out.print("You moved right");
	        break;
	    //When the user enters an invalid character it will prompt an error
		    default:
            System.out.println("Error: Invalid character");
            return ;
		
		    }

	}

}
