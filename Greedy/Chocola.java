package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String[] args) {
        int m = 4, n = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int h = 0, v = 0, hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            // ver cost < hor cost
            if (costVer[v] < costHor[h]) {// hor cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {// ver cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost is: " + cost);
        System.out.println("Total pieces: " + m * n);
    }

}
