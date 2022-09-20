
    package demo;
    import java.util.ArrayList;
    public class firstanswer{
        public static void main(String args[]){
            int sum=0;
//            Scanner sc=new Scanner
            int[] arr= {1,25,80,71,88,7,3,31,560,23};
            for(int n:arr) {
                int i,m=0,flag=0;
                m=n/2;
                if(n==0||n==1){
                    continue;
                    }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)  {
                        sum=sum+n;
                        System.out.println(n+" ");
                    }
                }
            }
            System.out.println("the sum is :"+sum);
        }
    }


