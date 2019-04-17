package factory;

public class UniversalTime extends Time {
    public UniversalTime(int hours, int minutes, boolean isPm) {
        super(hours, minutes, isPm);
    }

    @Override
    public void setZoneName() {
        zoneName = "UTC";
    }

    @Override
    public UniversalTime toUTC() {
        return null; //not implemented
    }
}
