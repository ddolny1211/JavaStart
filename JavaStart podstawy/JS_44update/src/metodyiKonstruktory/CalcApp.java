package metodyiKonstruktory;

public class CalcApp {
    public static void main(String[] args) {
        MetricCalc mCalc = new MetricCalc();
        TimeCalc tCalc = new TimeCalc();

        double miliSecondsResult;
        double a;
        double b;

        b=tCalc.hoursToMinutes(14);
        a=tCalc.minutesToSeconds(b);
        miliSecondsResult=tCalc.secondsToMiliseconds(a);

        System.out.println(miliSecondsResult);
    }
}
