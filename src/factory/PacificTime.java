package factory;

public class PacificTime extends Time {
    public PacificTime(int hours, int minutes, boolean isPm) {
        super(hours, minutes, isPm);
    }

    @Override
    public void setZoneName() {
        zoneName = "PST";
    }

    @Override
    public UniversalTime toUTC() {
        return null; //not implemented
    }
}
