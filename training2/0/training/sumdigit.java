package test1.training;

//doubt
     public class sumdigit {
    public static void main(String[] args) {
        sumdegit(125);
        sumdegit(-125);
        sumdegit(4);
        sumdegit(32123);
    }
    private static void sumdegit(int num)
    {
        if(num<10)
        {
            System.out.println("-1");
        }
        int sum=0;
        //125%10=5,125/10=12// 12%10=2, 12/10=1 ;
        while(num>0)
        {
            int digit= num%10;
            sum += digit ;

            num=num/10;

        }
        System.out.println("sum of digits ="+ sum);
    }
}
