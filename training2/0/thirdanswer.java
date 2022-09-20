//package test1.training;import java.util.Arrays;public class thirdanswer {
//    public static int removeduplicate(int ar[],int n)
//    {
//        if(n==0||n==1)
//        {
//            return n;
//        }
//        int j=0;
//        for (int i = 0; i < n; i++) {
//            if(ar[i]!=ar[i+1])
//            {
//                ar[j+1]=ar[n-1];
//            }
//            ar[j++]=ar[n-1];
//            return j;
//        }
//        return j;
//    }
//    public static void test1.main(String[] args) {
//        String[] ar1= {"AA","ggg","high","ojrs","2a","710aa"};
//        int a1=ar1.length;
//        String[] ar2= {"AAad","ggg","ojrs","high","mjos","710aa","de20"};
//        int a2=ar2.length;
//        int[] ar3=new int[a1+a2];
//        System.arraycopy(ar1,0,ar3,0,a1);
//        System.arraycopy(ar2,0,ar3,a1,a2);
//        int length=ar3.length;
//        System.out.println(Arrays.toString(ar3));
//        length= removeduplicate(ar3,length);
//
//        for (int i = 0; i < length; i++) {
//            System.out.println(ar3[i]+" ");
//        }
//    }
//}
//
