import java.util.ArrayList;
import java.util.PriorityQueue;

class  closeOriginPair{

        int distance;
        int x;
        int y;

        closeOriginPair(int distance,int x,int y){
            this.distance = distance;
            this.x = x;
            this.y = y;
        }

}

public class Y_K_Closest_Points_To_Origin {

    public static void main(String[] args) {

        int[][] points = {
                {1,3},
                {2,2},
                {5,8},
                {0,1}
        };
        int k = 2;

        PriorityQueue<closeOriginPair> pq = new PriorityQueue<>((a,b)->b.distance-a.distance);
        for (int i = 0 ; i < points.length ; i++){

            int x = points[i][0];
            int y = points[i][1];
            int distance = x*x + y*y;
            pq.add(new closeOriginPair(distance,x,y));

            if(pq.size() > k){
                pq.remove();
            }
        }
        while(!pq.isEmpty()){

            closeOriginPair  p = pq.remove();
            System.out.print(p.x + " " + p.y+",");

        }

    }

}
