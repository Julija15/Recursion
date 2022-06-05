public class Recursion {
    // Дано натуральное число n. Выведите все числа от 1 до n.
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }

    //Дано натуральное число N. Вычислите сумму его цифр.
    public static int recursion1(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion1(n / 10);
        }
    }

    //Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
    public static String recursion2(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + "  " + recursion2(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
        }
        return a + "  " + recursion2(a + 1, b);
    }
}