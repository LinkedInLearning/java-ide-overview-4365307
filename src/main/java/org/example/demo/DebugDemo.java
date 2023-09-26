package org.example.demo;

public class DebugDemo {
    public static void main(String[] args) {

        SampleObject sample= new SampleObject();

        int sum=0;
        for (int i = 0; i < 200; i++) {
            
            //how to stop when sum goes beyond 100?
            //how to stop after 10 times?
            sum+=i;

            //stop on value change
            sample.value=sum;

            //stop on exception
            if(sum>400)
            {
                //throw new IllegalStateException("Demo of exception");
            }
            
        }
    
    }
}
class SampleObject {
    int value;
}
