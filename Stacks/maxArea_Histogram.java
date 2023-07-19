package Stacks;

import java.util.*;

public class maxArea_Histogram {
    public static int maxArea(int height[]) {
        int MaxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // currArea: width = j-i-1 or nsr[i] - nsl[i] -1
        for (int i = 0; i < height.length; i++) {
            int Height = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = Height * width;
            MaxArea = Math.max(MaxArea, currArea);
        }
        return MaxArea;
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };// heigths of histogram
        System.out.println(maxArea(height));
    }
}
