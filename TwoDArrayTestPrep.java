public class TwoDArrayTestPrep{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{5,6,7},{8,9,10}};
        System.out.println(sumOfFirstRow(matrix));
        System.out.println(sumOfMajorDiagonal(matrix));
        System.out.println(sumOfMinorDiagonal(matrix));
        print(matrix);
        System.out.println(sumOfKthRow(matrix, 2));
        System.out.println(sumOfKThColumn(matrix, 0));
        int[][] neighbors = {{1,2,3,4},{1,3,4,2},{1,4,3,2}};
        System.out.println(countNeighbors(neighbors, 0, 0, 0));
        addOne(matrix);
        multDiagByFive(matrix);
        int[][] anotherOne = {{1,2,3,4},{1,3,4,52},{1,4,63,2}};
        sumMatrices(matrix, neighbors, anotherOne);
        swapCols(matrix, 0, 2);
        swapRows(matrix, 0, 1);
        display(matrix);
        reverse(matrix, 0);
    }

    public static int sumOfFirstRow(int[][] m){
        int sum = 0;
        for(int k = 0; k<m[0].length; k++){
            sum+=m[0][k];
        }
        return sum;
    }

    public static int sumOfMajorDiagonal(int[][] m){
        int sum = 0; 
        for(int i = 0; i<m.length; i++){
            sum+=m[i][i];
        }
        return sum;
    }

    public static int sumOfMinorDiagonal(int[][] m){
        int sum = 0;
        for(int i = 0; i<m.length; i++){
            sum+=m[i][m.length-1-i];
        }
        return sum;
    }

    public static void print(int[][] m){
        int row = m.length;
        int col = m[0].length;
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                System.out.print(m[r][c]);
            }
            System.out.println();
        }
    }

    public static int sumOfKthRow(int[][] m, int kRow){
        int sum = 0;
        for(int i = 0; i<m[0].length; i++){
            sum+= m[kRow][i];
        }
        return sum;
    }

    public static int sumOfKThColumn(int[][] m, int kThCol){
        int sum = 0;
        for(int i = 0; i<m.length; i++){
            sum+=m[i][kThCol];
        }
        return sum;
    }

    public static int countNeighbors(int [][] m, int r, int c, int n){
        int count = 0;
        for(int i = r-1; i<=r+1; i++){
            for(int j = c-1; j<=c+1; j++){
                if(i>=0 && i<=m.length-1 && j>=0 && j<=m.length-1 && m[i][j] == n && !(i==r && j==c)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void addOne(int[][] m){
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[0].length; j++){
                m[i][j]++;
            }
        }
    }

    public static void multDiagByFive(int [][] m){
        for(int i = 0; i<m.length; i++){
            m[i][i]*=5;
            m[i][m.length-i-1]*=5;
        }
        m[m.length/2][m.length/2]/=5;
    }

    public static void sumMatrices(int [][] m1, int [][] m2, int [][] m3){
        for(int i = 0; i<m1.length; i++){
            for(int j = 0; j<m1[0].length; j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
    }

    int temp;
    public static void swapCols(int [][] m, int n , int x){
        for(int i = 0; i<m.length; i++){
            int temp = m[i][n];
            m[i][n] = m[i][x];
            m[i][x] = temp;
        }
    }

    public static void swapRows(int[][] m, int n, int x){
        int[] temp = m[n];
        m[n] = m[x];
        m[x] = temp;
    }   

    public static void display(int[][] m){
        for(int c = 0; c<m[0].length; c++){
            for(int i = 0; i<m.length; i++){
                System.out.print(m[i][c]);
            }
        }
    }

    public static void change(int [][] m, int col){
        for(int i = 0; i<m.length; i++){
            if(m[i][col]<0){
                m[i][col] *= -1;
            }
        }
    }

    public static void reverse(int[][] m, int c){
    for(int i = 0; i < m.length / 2; i++){
        int temp = m[i][c];
        m[i][c] = m[m.length - i - 1][c];
        m[m.length - i - 1][c] = temp;
    }
}

    public static int[][] mirror(int[][] m){
        int[][] result = new int[m.length][m[0].length];
        for(int c = 0; c<m.length; c++){
            for(int j = 0; j<m[0].length; j++ ){
                result[j][m[0].length - c -1] = m[j][c];
            }
        }
        return result;
    }

    public static int sumCross(int[][] m, int row, int col){
        int sum = 0;
        for(int i = 0; i<m[0].length; i++){
            sum+=m[row][i];
        }
        for(int j = 0; j<m.length; j++){
            sum+=m[j][col];
        }
        sum-=m[row][col];
        return sum;
    }


}