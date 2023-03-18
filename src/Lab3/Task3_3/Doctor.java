package Lab3.Task3_3;

import java.util.Date;

public class Doctor implements IMedicWorker {
    private final String name;
    private final String surname;
    private final String middlename;

    private  Patient patient;

    @Override
    public void addApponintment(Appointment appointment) {
        patient.addAppointment(appointment);
    }

    public Doctor(String name, String surname, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }

    public void addPatient(Patient patient){
        this.patient = patient;
    }

    public StringBuilder getFIO(){
        return new StringBuilder(this.surname + " " + this.name + " " + this.middlename);
    }
}
