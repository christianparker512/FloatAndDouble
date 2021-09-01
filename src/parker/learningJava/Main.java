package parker.learningJava;

public class Main {

    public static void main(String[] args) {
	    //single precision 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min value = " + myMinFloatValue);
        //double precision 64 bits
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min value = " + myMinDoubleValue);
        //double precision 64 bits
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        //declaring the variables
//        int myIntValue = 37;
//        float myFloatValue = (float)37.25;
//        double myDoubleValue = 37d;

        int myIntValue = 5/2;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyIntValue = " + myFloatValue);
        System.out.println("MyIntValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);
    }
}
