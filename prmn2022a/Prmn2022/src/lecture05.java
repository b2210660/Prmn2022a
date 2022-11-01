public class lecture05 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        int view;

        Totalling t = new Totalling();

        t.judge(score);

        System.out.println("最低点:" + t.min(score));

        System.out.println("最高点:" + t.max(score));

        System.out.println("平均点:" + t.average(score));

    }

}
