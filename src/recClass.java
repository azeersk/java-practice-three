import java.util.Scanner;

public class recClass {
    public static void solveClass(int a){
        for(int i =0; i<a; i++){
            System.out.print(i);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length=10;
        System.out.println();
        solveClass(length);
    }
}
