import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long totalEmKg=0L;
        Long totalEmGrao=0L;
        Long totalEmGramas=0L;

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();

            for(int j=0; j<x; j++){
                if(j==0)
                    totalEmGrao=1L;
                totalEmGrao += totalEmGrao;
            }
            totalEmGramas = (long) totalEmGrao/12;
            totalEmKg = totalEmGramas/1000;
            System.out.printf(totalEmKg+" Kg \n");   //Complete o código aqui.
        }
        sc.close();
    }
}