 class LogicalDemo {
    
    public static void main(String[] args) {

        int x = 7;
        int y = 8;
        int a = 5;
        int b = 9;

        boolean result = x>y && a<b;       // and operators

        boolean result1 = x<y || a<b;         // or operators

        boolean result2= x<y || a>b;

        boolean result3=a>b;

        

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
