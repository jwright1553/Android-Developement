public class getMyInitials{
    public static void main(String[] args){
	String first = "Jordan";
	String middle = "Chad";
	String last = "Wright";
	String firstInitial = "";
	String secondInitial = "";
	String thirdInitial = "";
	firstInitial = String.valueOf(first.charAt(0));
	secondInitial = String.valueOf(middle.charAt(0));
	thirdInitial = String.valueOf(last.charAt(0));
	System.out.println(firstInitial+secondInitial+thirdInitial);
    }
}
