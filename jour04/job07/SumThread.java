package jour04.job07;

class SumThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}