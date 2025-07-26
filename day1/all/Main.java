class Main {
    public static void main(String[] args) {
        char as ='d';
        System.out.print(as > 64 && as <97 ?  (char)(as+32) :  (char)(as-32));
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println((a>b) ? ((a>c) ? a:c ) :((b>a) ? b:c));
    }
}


class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a % 2 == 0 ? "Even" : "odd");
    }
}