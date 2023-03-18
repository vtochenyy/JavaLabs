package Lab3.Task3_3;

public class Nurse implements IMedicWorker{
    private final String name;
    private final String surname;
    private final String middlename;
    private Patient patient;
    @Override
    public void addApponintment(Appointment appointment) {
        patient.addAppointment(appointment);
    }

    public Nurse(String name, String surname, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }

    public StringBuilder getFIO(){
        return new StringBuilder(this.surname + " " + this.name + " " + this.middlename);
    }
}
