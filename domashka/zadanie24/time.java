package domashka.zadanie24;

public class time {
    int sec;
    int min;
    int h;
    public time(int i) {

    }
    public static void main(String[] args) {

    }

    public time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "time{" +
                "sec=" + sec +
                ", min=" + min +
                ", h=" + h +
                '}';
    }
    public int allSeconds(){
        return sec+(min*60)+(h*3600);
    }
    public int allMinutes(){
        return min+sec/60+h*60;
    }
    public int allHours(){
        return h+min/60+sec/3600;
    }
}

