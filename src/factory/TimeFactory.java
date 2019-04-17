package factory;

public class TimeFactory {
    //Implement your code here

    public static Time getTime(Zone z, int hour, int min, boolean isPM){
        if(z == Zone.PST)
            return new PacificTime(hour, min, isPM);
        else if (z == Zone.EST)
            return new EasternTime(hour, min, isPM);
        else //z is Zone.UTC
            return new UniversalTime(hour, min, isPM);
    }

}




