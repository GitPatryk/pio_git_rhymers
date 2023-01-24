package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
/* HanoiRhymer wymagał formatowania w linii piątej oraz 11-15 *
* Klawisze alt + <- i alt + ->  przełączają nas pomiędzy plikami otwartymi w programie, po kolei w prawo lub lewo (Intelij)*
* Refaktoryzacja polegała na dodaniu odpowiednich wcięć względem zaczętych klas i instrukcji */