import java.util.*;
public class maxfood {
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    public static int maxfod(int[][] food,int[][] nest,int[] home,int time,int f,int n){
        int sum = 0;
        while(sum<=time){
            b                                 
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        int n = s.nextInt();
        int[][] food = new int[f][2];
        int[][] nest = new int[n][2];
        for(int i = 0;i<f;i++){
            food[i][0] = s.nextInt();
            food[i][1] = s.nextInt();
        }
        for(int i = 0;i<n;i++){
            nest[i][0] = s.nextInt();
            nest[i][1] = s.nextInt();
        }
        int[] home = new int[2];
        home[0] = s.nextInt();
        home[1] = s.nextInt();
        int time = s.nextInt();
        System.out.println( );
    }
}
