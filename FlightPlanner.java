package week5;

import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;

public class FlightPlanner extends ConsoleProgram {
	
	public void run() {
	
			println("Welcome to Flight Planner!");
			readFlightData("flights.txt");
			println("Here's a list of all the cities in our database:");
			printCityList(cities);
			println("Let's plan a round-trip route!");
			String startCity = readLine("Enter the starting city: ");
			ArrayList<String> route = new ArrayList<String>();
			route.add(startCity);
			String currentCity = startCity;
			while (true) {
			String nextCity = getNextCity(currentCity);
			route.add(nextCity);
			if (nextCity.equals(startCity)) break;
			currentCity = nextCity;
			}
			printRoute(route);
			}
	
	
	private void readFlightData(String filename) {
		flights = new HashMap<String,ArrayList<String>>();
		cities = new ArrayList<String>();
		try {
		BufferedReader
		rd = new BufferedReader(new FileReader(filename));
		while (true) {
		String line = rd.readLine();
		if (line == null) break;
		if (line.length() != 0) {
		readFlightEntry(line);
		}
		}
		rd.close();
		} catch (IOException ex) {
		throw new ErrorException(ex);
		}
		
		private void readFlightEntry(String line) {
			int arrow = line.indexOf("->");
			if (arrow == -1) {
			throw new ErrorException("Illegal flight entry " + line);
			}
			String fromCity = line.substring(0, arrow).trim();
			String toCity = line.substring(arrow + 2).trim();
			defineCity(fromCity);
			defineCity(toCity);
			getDestinations(fromCity).add(toCity);
			}


	}
	
}
