public class javaTutorial{
    public static void main(String [] args){
    int aNumber = 3;
    if (aNumber >= 0)
	if (aNumber == 0)
	   System.out.println("first string");
    else System.out.println("second string");
    System.out.println("third string");}}

/*
public class javaTutorial {

    public static void main(String [] args) {

    int aNumber = 3;

    if (aNumber >= 0)	
	if (aNumber == 0)
	    System.out.println("first string");

	else
	    System.out.println("second string");

    System.out.println("third string");

    }
}


public class javaTutorial {

    public static void main(String [] args) {

    int aNumber = 3;

    if (aNumber >= 0) {	
	if (aNumber == 0) {
	    System.out.println("first string");
        }
	else {
	    System.out.println("second string");
	}
    }

    System.out.println("third string");

    }
}





a. The output should be 'second string' when aNumber == 3, because it will pass the first if, then fail the second if-then statement, passing it to the else statement associated with it, which causes "second string" to be printed.

b. The output was "second string" and "third string".  It printed "second string" for the reasons that I stated earlier, and printed "third string" because, after the if-else loop terminates, the "third string" command will still run regardless of what aNumber is.  The control flow is as follows: if the number is greater than zero, pass to the next if. If it is 0, print "first string" and exit the loop.  If it is not zero, pass to the else which prints "second string" then exit the loop, then print "third string".

c. see 2nd code block

d. see 3rd code block


*/
