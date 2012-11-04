package week11;

/**
 * Represents a Pixel in a PPM file
 * @author dr.im
 * @version 0.1
 */
public class Pixel {

	private int red;
	private int green;
	private int blue;
	
	/**
	 * Construct a pixel based on RGB values
	 *  
	 * @param red RGB value for red
	 * @param green RGB value for green 
	 * @param blue RGB value for blue
	 */
	public Pixel(String red, String green, String blue) {
		this.red = Integer.parseInt(red);
		this.green = Integer.parseInt(green);
		this.blue = Integer.parseInt(blue);
	}

	/**
	 * @return the red
	 */
	public String getRed() {
		return red + "";
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(String red) {
		this.red = Integer.parseInt(red);
	}

	/**
	 * @return the green
	 */
	public String getGreen() {
		return String.valueOf(green);
	}

	/**
	 * 
	 * @return the r value
	 */
	public int getRedInt() {
		return red;
	}
	
	/**
	 * 
	 * @return the b value 
	 */
	public int getBlueInt() {
	    return blue;
	}
	
	/**
	 * 
	 * @return the g value
	 */
	public int getGreenInt() {
		return green;
	}
	
	/**
	 * @param green the green to set
	 */
	public void setGreen(String green) {
		this.green = Integer.parseInt(green);
	}

	/**
	 * @return the blue
	 */
	public String getBlue() {
		return String.valueOf(blue);
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(String blue) {
		this.blue = Integer.parseInt(blue);
	}

	/**
	 * Calculates grayscale value based on this formula
	 * Y = 0.2126 R + 0.7152 G + 0.0722 B 
	 *  
	 * @return grayscale value
	 */
	public int getGrayScale() {
		
		int gray = (int) ( 0.21*red + 0.71*green + 0.07*blue);
		return gray;
	}
	
	/**
	 * Turns all the rgb values into gray
	 */
	public void turnGray() {
		int gray = getGrayScale();
		red = gray;
		green = gray;
		blue = gray;
	}
	
	/**
	 * Blends itself with another pixel
	 * 
	 * @param alpha value from 0..1 used for alpha blending
	 * @param pixel the pixel we are blending with
	 */
	public void turnAlpha(double alpha, Pixel pixel)
	{
		double remaining = 1 - alpha;
		red =(int) (red*alpha + pixel.getRedInt()*remaining);
		green = (int) (green*alpha + pixel.getGreenInt()*remaining);
		blue = (int) (blue*alpha + pixel.getBlueInt()*remaining);	
	}
	
	/**
	 * Textual represention of Pixel for PPM file
	 * You can use this &lt;code&gt;  pw.println(Pixel) &lt;/code&gt;
	 * 
	 */
	@Override
	public String toString() {
		return red + "\n" + green + "\n" + blue;
	}
}
