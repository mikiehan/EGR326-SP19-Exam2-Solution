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

}
