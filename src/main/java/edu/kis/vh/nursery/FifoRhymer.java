package edu.kis.vh.nursery;

/**
 *Klasa reprezentujaca wyliczanke w oparciu o kolejke first in first out
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca i susuwa najstarszy elemtn z kolejki.
     * * @return wartość pierwszego dodanego elementu lub wartość domyślną, gdy wyliczanka jest pusta
     */
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int returnValue = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return  returnValue;
    }
}
