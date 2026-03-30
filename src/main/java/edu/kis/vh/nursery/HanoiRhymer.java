package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    //TODO: Mozemy to kiedys zrefactoryzowac zeby niepotrzebnie trzymac to ww pamieci
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}
