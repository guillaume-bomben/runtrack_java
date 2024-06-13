package jour04.job05;

class CounterThread extends Thread {
    private int start;
    private int end;
    private int sum;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}