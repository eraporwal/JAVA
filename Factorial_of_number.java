public class Factorial_of_number {
    public static void main(String[] args) {
        int n=2;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
