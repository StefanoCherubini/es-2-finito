package es_2;


public class MioThread extends Thread {
    int ind;
    int[]array = new int[10];

    MioThread(int ind, int[] array)
    {
       this.ind = ind;
       this.array = array;
    }

    @Override
    public void run() {
        int val = (int) (Math.random() * 100)+1;
        array[ind] = val;
        System.out.println(Thread.currentThread().getName() + "ha scritto " + val);
    }
}   
