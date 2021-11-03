public class operacjeNaZmiennych {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Czy x jest większe od y?");
        System.out.println(x>y);
        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        System.out.println(x*2>y);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(y<x+3 && y>x-2);
        System.out.println("Czy iloczyn liczb x i y jest parzysty?");
        System.out.println(((x * y) % 2 == 0));




        System.out.println("x=" + x + ", y=" + y);
        boolean result = x>y;
        System.out.println("x > y = " + result);

        result =  x * 2 > y;
        System.out.println("x * 2 > y =" + result);

        result  = (y < x + 3) && (y > x - 2);
        System.out.println("(y < x+3) && (y > x-2) = " + result);

        result = ((x * y) % 2 == 0);
        System.out.println("Czy x*y jest parzyste? " + result);


    }

}
