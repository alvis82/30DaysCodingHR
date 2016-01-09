public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage

        double gross = M * (1 + T / 100.0 + X / 100.0);
        int total = (int) Math.round(gross);

        System.out.printf("The final price of the meal is $%d.", total);
    }
    
}
