/*
* File: Hengfel.java
* Author: Juhász Zsombor
* Copyright: 2024, Juhász Zsombor
* Group: Szoftver fejlesztés 1/2/N
* Date: 2024-12-19
* Github: https://github.com/zsombor696/
* Licenc: MIT
*/

import java.util.Scanner;

public class Hengfel {
    public void doit() {
        System.out.print("Juhász Zsombor \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sugár:  ");
        double radius = scanner.nextDouble();

        System.out.print("Magasság:  ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Felszine: " + surfaceArea);

        scanner.close();
    }
}