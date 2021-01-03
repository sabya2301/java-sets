package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
	// write your code here
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Venus", 225);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Earth", 365);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Mars", 687);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Jupiter", 4332);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Saturn", 10759);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Uranus", 30660);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Neptune", 165);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        temp = new HeavenlyBody("Pluto", 248);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);
///////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\nPlanets and their moons:\n");
        for(HeavenlyBody heavenlyBody: planets){
            System.out.println(heavenlyBody.getName() + ": ");
            for(HeavenlyBody moon: heavenlyBody.getSatellites()){
                System.out.println("\t" + moon.getName());
            }
            if(heavenlyBody.getSatellites().size() == 0){
                System.out.println("\t" + heavenlyBody.getName() + " has no moon");
            }
        }

        System.out.println("=====================================\n");
        Set<HeavenlyBody> moons = new HashSet<>(); //adding jupiter's moons
        moons.add(tempMoon);
//        System.out.println(tempMoon.getName());
        for(HeavenlyBody moon: moons){
            System.out.println(moon.getName());
        }

        System.out.println("=====================================-=\n");
        for(HeavenlyBody moon: planets){
            System.out.println(moon.getName()+ " " + moons.addAll(moon.getSatellites()));
        }
        System.out.println("=====================================\n");
        System.out.println("All moons:\n");
        for(HeavenlyBody moon: moons){
            System.out.println(moon.getName());
        }
    }
}
