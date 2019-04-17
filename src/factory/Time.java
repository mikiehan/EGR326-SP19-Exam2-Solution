package factory;

public abstract class Time {
    protected int hours;
    protected int minutes;
    protected boolean isPm;
    protected String zoneName;

    public Time(int hours, int minutes, boolean isPm) {
        this.hours = hours;
        this.minutes = minutes;
        this.isPm = isPm;
        setZoneName();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isPm() {
        return isPm;
    }

    public String getZoneName() {
        return zoneName;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", isPm=" + isPm +
                ", zoneName='" + zoneName + '\'' +
                '}';
    }

    public abstract void setZoneName();
    public abstract UniversalTime toUTC();

    private int toMinute(){
        int h = hours;
        if (h == 12) h = 0;
        if (isPm) h += 12;

        return h * 60 + minutes;
    }

    protected UniversalTime toUTC(int minutesToAdd){
        int minutes = toMinute() + minutesToAdd;
        int h = minutes / 60 % 24;
        int m = minutes % 60;
        boolean isPm = false;
        if(h == 0){
            h = 12;
        }
        if(h > 13){
            h=-12;
            isPm = true;
        }
        return new UniversalTime(h, m, isPm);
    }
}
