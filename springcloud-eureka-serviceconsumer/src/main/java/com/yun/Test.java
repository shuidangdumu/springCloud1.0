package com.yun;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    static{
        int x = 10;
    }
    static int x,y;
    public static void main(String args[]){
//        add();
//        add1();
        Character c = new Character('a');
        String s = "";
        StringBuffer sb = new StringBuffer();
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println(a==b);

//        queueTest();

//        int[] result = getIndex(new int[]{2, 7, 11, 13}, 9);
//        int[] result = getIndex2(new int[]{2, 7, 11, 13}, 9);
//        for(int i : result){
//            System.out.println(i);
//        }
    }

    public static void add1(){
        x--;
//        y=x++ + ++x;
        y = x++;
        System.out.println(y);
        //        System.out.println(x+y + ++x);
//        System.out.println(x);
    }

    public static void add(){
        int b[][] = {{1},{2,2}, {2,2,2}};
        int sum = 0;
        for(int i = 0; i<b.length ; i++){
            for(int j = 0; j<b[i].length;j ++){
                sum+=b[i][j];
            }
        }
        System.out.println(sum);
    }

    public static int[] getIndex2(int[] nums,int target){
        if(nums != null && nums.length > 0){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }
        }
        return  new int[]{0};
    }

    public static int[] getIndex(int[] nums,int target){
        if(nums != null && nums.length > 0){
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return  new int[]{0};
    }

    public static void queueTest(){
        Queue<String> queueList = new LinkedList<>();
        queueList.offer("a");
        queueList.offer("b");
        queueList.offer("c");
        queueList.offer("d");
        queueList.poll();
        String first = queueList.peek();
        System.out.println("first element : " + first);
        for(String s : queueList){
            System.out.println(s);
        }
        Deque<String> dequeList = new LinkedBlockingDeque<>();
    }



    class TestCallAble implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return 10086;
        }
    }
}
