import java.util.*;
class Main
{
    void guessnumber()
    {
        Scanner sc = new Scanner(System.in);
        int trail;
        int i,guess;
	int num= 1+(int)(100* Math.random());
	System.out.println("Enter number of choices available:");		
	trail=sc.nextInt();
        System.out.println("A number is selected between 1 to 100.");
	System.out.println("Guess that number within " +trail+" trails.");
	int score=trail*10;
	System.out.println("Total score="+score);
        for (i=0;i<trail;i++) 
	{
            System.out.println("guess the number:");
            guess=sc.nextInt();
            if(num==guess) 
	    {
                System.out.println("Congratulations!! You guessed the correct number:)");
		System.out.println("Your score:"+((trail-i)*10));
                break;
            }
            else if(num<guess) 
	    {
                System.out.println("The number is"+" less than "+guess);
            }
            else if(num>guess) 
	    {
                System.out.println("The number is"+" greater than "+guess);
            }
        }
        if(i==trail)
	{
            System.out.println("You have completed your "+trail+" trials.");
	    System.out.println("Better Luck next time:(");
            System.out.println("The Actual Number is: " + num);
        }
    }
}
class Task2
{
    public static void main(String args[])
    {
	Main g=new Main();
        g.guessnumber();
    }
}