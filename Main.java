import static java.lang.Math.sqrt;

public class Main {

    public static void main(String ... args){
        int a, b, c, delta;
        double x1, x2;
        if(args.length == 3) {
            try {
                a=Integer.parseInt(args[0]);
                b=Integer.parseInt(args[1]);
                c=Integer.parseInt(args[2]);
                if(a==0) {
                    x1=(-c)/b;
                    System.out.println("Rowanie jest liniowe i jego rozwiązanie to: " + x1);
                } else {
                    delta = b * b - 4 * a * c;
                    if (delta == 0) {
                        x1 = (-b) / (2 * a);
                        System.out.println("Jedyny pierwiastek  równania to: " + x1);
                    } else if (delta < 0) {
                        System.out.println("Równanie nie ma rozwiązania");
                    } else {
                        x1 = ((-b) - sqrt(delta)) / (2 * a);
                        x2 = ((-b) + sqrt(delta)) / (2 * a);
                        System.out.println("Pierwiastki równania to: " + x1 + " i " + x2);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Argumenty nie są liczbami");
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Jeśli a jest zerem, to b nie może być zerem");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Niepoprawna liczba argumentow");
        }
    }

}
