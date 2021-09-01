public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.


    Example:
     */
    public static void main(String[] args) {


            int seconds=4500;

            //convert seconds into hr, min, sec
            int hr=(int)(seconds/3600);
            int min=((int)(seconds/60))%60;
            int sec=(int)(seconds/60);

            System.out.println("Hours:"+hr+"\n"+"Minutes:"+ min +"\n"+"Seconds" + sec);
        }
    }
