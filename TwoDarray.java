import java.util.Scanner;
public class TwoDarray 
{
    static int[][] array2D=new int[100][100];
    static int getRows=0;
    static int getColumn=0;
    public static void getElement() 
{
        for (int i=0;i<getRows;i++) {
            for(int j=0;j<getColumn;j++) {
                array2D[i][j]=scanInput.nextInt();
            }
        }
    }

    public static void printElement() 
{
        System.out.println("----------------------------------------------");
        System.out.println("printing array elements");
        for (int i=0;i<getRows;i++) {
            for(int j=0;j<getColumn;j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

    }

    static Scanner scanInput = new Scanner(System.in);
    public static void main(String[] args) 
{
        System.out.println("number of column ");
        getColumn=scanInput.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("number of rows ");
        getRows=scanInput.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("enter number -");
        getElement();
        printElement();

    }
}
