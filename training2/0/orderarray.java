package test1;

public class orderarray {
    public static void main(String[] args) {


    int[] arr= {52,85,4,7,55,2,6,8};
    int temp;
		for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i]>arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }

    }
        for(int h:arr)
            System.out.println(h);
        System.out.println("---------------");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
}
}
