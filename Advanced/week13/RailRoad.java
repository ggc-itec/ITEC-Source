package week13;

import java.util.EnumSet;
import java.util.Random;

public class RailRoad {

	// an enumset of stations where a train has arrived
	private EnumSet<Station> arrivals;
	private int arrivalsInNum;
	
	public RailRoad() {
		arrivals = getArrivalsSet();
	}
	
	public EnumSet<Station> getArrivalsSet() {
		int bitfield = readFromPort();
		EnumSet<Station> ports = EnumSet.noneOf(Station.class);
		
		if((bitfield&1) == Station.ONE.getStationNum())
			ports.add(Station.ONE);
		if((bitfield&2) == Station.TWO.getStationNum())
			ports.add(Station.TWO);
		if((bitfield&4) == Station.THREE.getStationNum())
			ports.add(Station.THREE);
		if((bitfield&8) == Station.FOUR.getStationNum())
			ports.add(Station.FOUR);
		if((bitfield&16) == Station.FIVE.getStationNum())
			ports.add(Station.FIVE);
		if((bitfield&32) == Station.SIX.getStationNum())
			ports.add(Station.SIX);
		if((bitfield&64) == Station.SEVEN.getStationNum())
			ports.add(Station.SEVEN);
		if((bitfield&128) == Station.EIGHT.getStationNum())
			ports.add(Station.EIGHT);
		
		return ports;
	}
	
	
	public int getArrivalsNum() {
		return arrivalsInNum;
	}
	
	public int translateSetToNum() {
		int num = 0;
		for(Station s: arrivals)
		{
			if( s.equals(Station.ONE)) 
				num += 1;
			else if( s.equals(Station.TWO))
				num += 2;
			else if( s.equals(Station.THREE))
				num += 4;
			else if( s.equals(Station.FOUR))
				num += 8;
			else if( s.equals(Station.FIVE))
				num += 16;
			else if( s.equals(Station.SIX))
				num += 32;
			else if( s.equals(Station.SEVEN))
				num += 64;
			else if( s.equals(Station.EIGHT))
				num += 128;
		}
		return num;
	}
	
	// stub method, we would actually read from a physical port in the digilent i/o explorer device
	private int readFromPort() {
		// randomly generate a number from 1 to 1 + 2 + 4 + 8 + ... + 128
		Random r = new Random();
		int num = 1 + r.nextInt(1+2+4+8+16+32+64+128);
		arrivalsInNum = num;
		return num;
	}
	
	@Override
	public String toString() {
		return arrivals.toString() + " "  + arrivalsInNum;
	}

}
