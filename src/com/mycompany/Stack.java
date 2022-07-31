package com.mycompany;

public class Stack{
    private int[] arr= new int[20];
    private int Top=-1;

    public void push(int num){
        if (Top < arr.length){
            Top++;
            arr[Top]=num;
        }else {

        }
    }
    public int pop(){
        if (arr.length >0){
            return arr[Top--];
        }else {
            return -1;
        }
    }
    public int getTop(){
        return arr[Top];
    }
    public boolean isEmpty(){
        return arr.length==0;
    }

    @Override
    public String toString() {
        String cont="[";
        for (int i=0 ; i<=Top;i++){
            cont=cont+arr[i];
            if (i!= Top){
                cont=cont+", ";
            }
        }
        cont=cont+']';
        return cont;
    }
}
