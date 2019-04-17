package factory;

public class EasternTime extends Time {
    public EasternTime(int hours, int minutes, boolean isPm) {
        super(hours, minutes, isPm);
    }

    @Override
    public void setZoneName() {
        zoneName = "EST";
    }

    @Override
    public UniversalTime toUTC() {
        return null; //not implemented
    }
}
