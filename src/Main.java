import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int upperRange = n.nextInt();
        int lowerRange = n.nextInt();
        for (int i = lowerRange; i <= upperRange; i++) {
            if (isPrimeNum(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrimeNum(int x) {
        if (x<2)
            return false;
        for (int i = 2; i < x; i++) {
            if (x%i == 0)
                return false;
        }
        return true;
    }
}