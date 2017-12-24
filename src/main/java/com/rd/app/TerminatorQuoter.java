package com.rd.app;

@Profiling
public class TerminatorQuoter implements Quoter {

    public void setMessage(String message) {
        this.message = message;
    }

    @InjectRandomInt(min = 2,max = 7)
    private int repeat;

    private String message;

    public void init(){
        System.out.println("Phase 2 : "+repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1 : "+repeat);
    }



    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
