package test1.training;

public class removeduplicates {
    public static void main(String[] args) {

        int[] myarray={1,2,3,4,3,5,5,6,7,8,9,4,5};
//      StringBuffer ar=new myarray();
//        newmyarray = new StringBuffer(String.valueOf(myarray));

        for(int i=0;i<myarray.length;i++)
        {
            for(int j=i+1;j<myarray.length;j++){
                if(myarray[i]==myarray[j])
                {
                    for (int  k = j; k < myarray.length - 1; k++)
                    {
                        myarray[k] = myarray [k + 1];
                    }


                }
                else {

                }




            }
        }
    }
}
