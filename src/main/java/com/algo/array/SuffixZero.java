package com.algo.array;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 2/11/18.
 * Move all zero at END
 */
public class SuffixZero {

    public static void main(String args[]) {
        int[] array = {0, 0,1, 0, 3, 12};//expt output : 1,3,12,0,0
        array = new SuffixZero().moveZeros(array);
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
    }

    private int[] moveZeros(int[] array) {
        Queue queue = new LinkedBlockingQueue(array.length);
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] == 0) {
                queue.add(currentIndex);
            } else if(!queue.isEmpty()){
                if (currentIndex > (int) queue.peek()) {
                    int zeroIndex = (int) queue.poll();
                    array[zeroIndex] = array[currentIndex];
                    array[currentIndex] = 0;
                    queue.add(currentIndex);
                }
            }
        }
        return array;
    }

}
