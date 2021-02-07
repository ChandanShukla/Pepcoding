import java.util.*;

public class Ring_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int[][] arr = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        int oned[] = fill1d(arr, s);

        int n = oned.length;
        r = r % n;
        if (r < 0) {
            r += n;
        }
        reverseArr(oned, 0, n - r - 1);
        reverseArr(oned, n - r, n - 1);
        reverseArr(oned, 0, n - 1);

        fill(arr, s, oned);
        display(arr);
		
	}
	public static int[] fill1d(int mat[][], int shell) {
        int nr = mat.length;
        int nc = mat[0].length;
        int rmin = shell - 1, cmin = shell - 1, rmax = nr - shell, cmax = nc - shell;
        int total = 2 * (rmax - rmin + cmax - cmin);

        int oned[] = new int[total];
        int idx = 0;
        // left wall : top -> bottom
        for (int i = rmin, j = cmin; i <= rmax; i++) {
            oned[idx] = mat[i][j];
            idx++;
        }
        cmin++;

        // bottom wall : left -> right
        for (int i = rmax, j = cmin; j <= cmax; j++) {
            oned[idx] = mat[i][j];
            idx++;
        }
        rmax--;

        // right wall : bottom -> top
        for (int i = rmax, j = cmax; i >= rmin; i--) {
            oned[idx] = mat[i][j];
            idx++;
        }
        cmax--;

        // top wall : right -> left
        for (int i = rmin, j = cmax; j >= cmin; j--) {
            oned[idx] = mat[i][j];
            idx++;
        }
        rmin++;
        
        return oned;
    }
	public static void fill(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;


        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        minc++;
        for (int i = maxr, j = minc; j <= maxc; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        maxc--;
        for (int i = minr, j = maxc; j >=minc; j--) {
            
            arr[i][j] = oned[idx];
            idx++;
        }
        

    }
    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
	public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
