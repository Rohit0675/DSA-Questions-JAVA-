package Array;
public class rainwater {
    public static int trappedRainwater(int height[]){
        // calculate left max boundary
        int lefMax[] = new int[height.length];
        lefMax[0] = height[0];
        for(int i = 1; i<height.length; i++ ){
            lefMax[i] = Math.max(height[i] , lefMax[i-1]);
        }


        // calculate right max boundary

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop
        int trappedWater = 0;
        for(int i = 0; i<height.length;i++){
               // water level = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(lefMax[i], rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;
     
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5,5,9,7,8,2}; 
       System.out.println("Total water trapped: "+trappedRainwater(height)); 
    }

    
}
