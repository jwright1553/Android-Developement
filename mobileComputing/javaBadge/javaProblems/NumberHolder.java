/* Excercises 1 and 2 in Objects */

/*
public class SomethingIsWrong {
    public static void main(String [] args){
	Rectangle myRect = new Rectangle();
	myRect.width = 40;
	myRect.height = 50;
	System.out.println("myRect's area is " + myRect.area());
    }
}

1. The method does not correctly initialize myRect; you would need to initialize it as Rectangle myRect = new Rectangle.

*/

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public NumberHolder( int anIntInit, float aFloatInit ) {
	anInt = anIntInit;
	aFloat = aFloatInit;
    }
    
    public int getInt() {
	return anInt;
    }

    public float getFloat() {
	return aFloat;
    }
}
