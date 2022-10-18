package Singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {
    public static Planet thePlanet;
    static
    {
        try
        {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void readKeyFromConsoleAndInitPlanet() {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        if (x.equals(Planet.SUN))
        {
            thePlanet = (Planet) Sun.getInstance();
        }
        else if (x.equals(Planet.MOON))
        {
            thePlanet = (Planet) Moon.getInstance();
        }
        else if (x.equals(Planet.EARTH)) thePlanet = (Planet) Earth.getInstance();
        else thePlanet = null;
    }

    public static void main(String[] args) {
        // implement step #5 here - реализуйте задание №5 тут
        readKeyFromConsoleAndInitPlanet();
        System.out.println(thePlanet.getClass());
    }

}
