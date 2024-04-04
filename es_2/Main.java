package es_2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int [10];
        MioThread[] at = new MioThread [10];

        for(int i=0; i<at.length; i++){
            at[i] = new MioThread(array,i);
        }
        
        for(int i=0; i<at.length; i++){
            at[i].start();
        }

        for(int i=0; i<at.length; i++){
        try {
            at[i].join();
        }catch (InterruptedException e) 
        {
            e.printStackTrace();
        }    
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(at[i]);
        }

     }
}