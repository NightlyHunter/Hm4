import java.util.Arrays;

/**
 * Created by night on 17.07.2017.
 */
public class Hm4 {
    static int c=1;
    static int k=1;
    static int l=1;
    public static void Count (int size){
        int a[]= new int[size];
        for (int i=0; i <a.length ; i++){
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void drawRectangle (int a, int b){

        for (int y=0; y < a; y++){

            for (int x=0; x < b;x++){
                System.out.print("+ ");
            }
            System.out.println("");
        }


    }
    public static void drawRectangle (int a){

        for (int y=0; y < a; y++){

            for (int x=0; x < a; x++){
                System.out.print("+ ");
            }
            System.out.println("");
        }


    }
    public static void getMax (int a, int b){
        if (a>b) System.out.println("Max="+a);
        if (b>a) System.out.println("Max="+b);
        else System.out.println("Equal");
    }
    public static void getMax (float a, float b){
        if (a>b) System.out.println("Max="+a);
        if (b>a) System.out.println("Max="+b);
        else System.out.println("Equal");
    }
    public static void CountR (int size){

        System.out.println(c++);
        if (c <= size){
            CountR(size);
        }

    }
    public static void drawRectangleR(int a, int b) {

        System.out.print("+ ");
        k++;
        if (k <= a){
            drawRectangleR(a, b);
        }
        l++;
        if(l <= b){
            k = 1;
            System.out.println();
            drawRectangleR(a, b);
        }
    }
    public static void main(String[] args) {

        drawRectangleR(10,14);
    }
}
