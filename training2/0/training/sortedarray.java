package test1.training;

public class sortedarray {
    public static void main(String[] args) {
        int[] array={10,70};
        int temp;
        boolean flag=true;
        while(flag) {
            flag=false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag=true;
                }

                for (int j = 0; j < array.length - 1; j++) {
                    System.out.println(array[j]);
                    System.out.println(array[j+1]);
            }

            }
        }
    }
}
