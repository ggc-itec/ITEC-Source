package week2;

public class UnitConversion {

    private UnitConversion() {
        
    }
	
	public static double getKilograms(double pounds)
	{
		return 0.453592 * pounds;
	}
	
	public static double getMeters(double feet)
	{
		return 0.3048 * feet;
	}
	
}
