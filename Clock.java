public class Clock {
    public static void main(String args[]) {
        TimeClass timeObj = new TimeClass();

        System.out.println(timeObj.toMilitary());

        timeObj.setTime(13, 27, 6);
        System.out.println(timeObj.toMilitary());
    }
}
