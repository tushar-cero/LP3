public class Main {
	public static void main(String[] args) {
		Main obj = new Main();
		
		int terms = 5, last = 1, secondLast = 0;
		
		System.out.println("WITHOUT RECUSION");
		obj.withoutRecusion(terms, last, secondLast);
        System.out.println();
		System.out.println("WITH RECUSION");
		obj.withRecusion(terms);
	}
    public void withoutRecusion(int terms, int last, int secondLast) {
        int current = Integer.MIN_VALUE;
        for(int i = 0; i < terms; i++) {
            if(i < 2) {
                current = i;
            } else {
                current = last + secondLast;
                secondLast = last;
                last = current;
            }
            System.out.print(current + " ");
        }
    }

    public static void withRecusion(int terms) {
        for(int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int num) {
        if(num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
