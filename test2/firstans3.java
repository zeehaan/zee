package test2;

import java.util.ArrayList;
import java.util.Objects;

public class firstans3 {
    int[] array;
    ArrayList<Integer> arr; //for removing duplicate values


    public firstans3(int[] array, ArrayList<Integer> arr) {
        this.array = array;
        this.arr = arr;
    }

    public int GetSumOfTheNumber() {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public ArrayList<Integer> GetMiddleNumber() {
        ArrayList<Integer> arr2=new ArrayList<Integer>(2);
        int num = arr.size();
        if (num % 2 == 0) {
            arr2.add(arr.get(num / 2));
            arr2.add(arr.get((num / 2) -1));

        } else {
            arr2.add(arr.get(num / 2));
        }

        return arr2;
    }
    ArrayList<Integer> RemoveNegativeNumbers() {
        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i)) <= 0) {

                arr.remove(i);
            }
        }
        return arr;
    }

    ArrayList<Integer> ReturnArray(){
        return arr;
    }
    ArrayList<Integer>   RemoveDuplicateNumbers(){
        for (int i = 0; i <=arr.size() ; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(Objects.equals(arr.get(i), arr.get(j))){
                    arr.remove(i);
                }
            }
        }
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(Objects.equals(arr.get(i), arr.get(j))){
                    arr.remove(j);
                }
            }
        }
        return arr;
    }













}









