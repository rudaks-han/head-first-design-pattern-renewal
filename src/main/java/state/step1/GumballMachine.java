package state.step1;

public class GumballMachine {

    private final int SOLD_OUT = 0;
    private final int NO_QUARTER = 1;
    private final int HAS_QUARTER = 2;
    private final int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
        } else if (state == SOLD){
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }
}
