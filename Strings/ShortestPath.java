package Strings;

public class ShortestPath {

    public static float Shortest(String path){
        int x = 0, y = 0;
        for(int i = 0; i <path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            //west
            else {
                x--;
            }
        }
        
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "WNENNESENNN";
        System.out.println(Shortest(path));
    }
    
}
