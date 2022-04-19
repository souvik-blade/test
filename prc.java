import java.util.*;

public class prc {
    static void display(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size");
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println("enter elements");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = s.nextInt();
        }
        display(arr, m, n);

        int sumrow = 0;
        int sumcol = 0;
        int sumdiagonal1 = 0;
        int sumdiagonal2 = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                sumrow += arr[i][j];
                sumcol += arr[j][i];

                if (i == j)
                    sumdiagonal1 += arr[i][j];
                if()
            }
            System.out.println("Row    " + i + " sum: " + sumrow);
            System.out.println("Column " + i + " sum: " + sumcol);
            sumrow = 0;
            sumcol = 0;
        }
        System.out.println("Diagonal1 Sum" + sumdiagonal1);
        System.out.println("Diagonal2 Sum" + sumdiagonal2);

    }

}

// for(int i=0;i<m;i++)
// {
// sumrow1=0;
// sumrow2=0;
// sumrow3=0;
// for(int j=0;j<n;j++)
// {
// sumrow1+=arr[0][j];
// sumrow2+=arr[1][j];
// sumrow3+=arr[2][j];
// }

// }
// System.out.println(sumrow1+" "+sumrow2+" "+sumrow3);
