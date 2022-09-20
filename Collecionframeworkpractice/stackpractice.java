package Collecionframeworkpractice;

import java.util.Stack;

public class stackpractice {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.contains(6));
        System.out.println(st.elementAt(7));





//int i=-12;
//       String s=new String (String.valueOf(i));
//        System.out.println(s);
//
//        String s1=Integer.toString(i);
//        System.out.println(s1);
//
//        String str="";
//        String s3=str+s;
//        System.out.println("str is "+s3);
//




    }
    }
