package com.example.demo4;

public class StackDemo {
    private String [] arr;

    int top;

    StackDemo(int size) {

        arr=new String[size];
        top=-1;
    }

    public void push(String a)
    {
        arr[++top]=a;
    }


    public String pop()
    {
        return arr[top--];
    }


//    public void display(int top)
//    {
//        int i;
//        if(top==-1)
//        {
//            System.out.println("empty");
//        }
//        else {
//            for(i=0;i<=top;i++)
//            {
//                System.out.println(arr[i]);
//            }
//        }
//    }


    public int getTop(){
        return top;
    }

    public String peek()
    {
        return arr[top];
    }
    public String data(int top)
    {
        return arr[top];
    }

}


