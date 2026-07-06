import java.util.Stack;

public class Y_Max_Area_Rectangle_in_binary_matrix {

    public static int MAH(int[] height){

        int[] right = new int[height.length];
        int[] left = new int[height.length];
        int max = 0;
        int width;
        int area;

        Stack<Integer> stR = new Stack<>();
        Stack<Integer> stL = new Stack<>();

        for(int i = height.length -1 ; i >=0 ; i--){

            if(stR.isEmpty()){
                right[i] = height.length;
            }
            else if(height[i] > height[stR.peek()]){
                right[i] = stR.peek();
            }
            else if(height[i] <= height[stR.peek()]){
                while (!stR.isEmpty() &&  height[i] <= height[stR.peek()]){
                    stR.pop();
                }
                if(stR.isEmpty()){
                    right[i] = height.length;
                }
                else {
                    right[i] = stR.peek();
                }
            }
            stR.push(i);
        }
        for(int i = 0 ; i<height.length;i++){

            if(stL.isEmpty()){
                left[i] = -1;
            }
            else if (height[i] > height[stL.peek()]) {
                left[i] = stL.peek();
            }
            else if (height[i] <= height[stL.peek()]) {

                while(!stL.isEmpty() && height[i] <= height[stL.peek()]){
                    stL.pop();
                }
                if(stL.isEmpty()){
                    left[i] = -1;
                }
                else {
                    left[i] = stL.peek();
                }
            }

            stL.push(i);
        }

        for(int i = 0 ; i <height.length ; i++ ){
            width = right[i]-left[i]-1;
            area = width * height[i];
            max = Math.max(max,area);
        }

        return max;
    }

    public static int Maximum_Area_Rectangle(int[][] matrix){

        int[] height = new int[matrix[0].length];

        for(int j =0 ; j<matrix[0].length ;j++){
                height[j] = matrix[0][j];
        }

        int max = MAH(height);

        for (int i = 1; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    height[j] = 0;
                } else {
                    height[j] += 1;
                }
            }

            max = Math.max(max, MAH(height));
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };


        System.out.println(Maximum_Area_Rectangle(matrix));
    }

}
