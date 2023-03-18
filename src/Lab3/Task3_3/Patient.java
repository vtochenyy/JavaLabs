package Lab3.Task3_3;

import java.util.ArrayList;
import java.util.Collection;

public class Patient {
    private Doctor doctor;
    private final String name;
    private final String surname;
    private final String middlename;
    private final Collection<Appointment> appointments;

    public Patient(Doctor doctor, String name, String surname, String middlename, Collection<Appointment> appointments) {
        this.doctor = doctor;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.appointments = appointments;
    }

    public Patient(String name, String surname, String middlename) {
        this.doctor = new Doctor("Дефолт", "Дефолтов", "Дефолтович");
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.appointments = new ArrayList<>();
    }

    public StringBuilder getDoctor() {
        return this.doctor.getFIO();
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void addAppointment(Appointment appointment){
        this.appointments.add(appointment);
    }

    public StringBuilder getFIO(){
        return new StringBuilder(this.surname + " " + this.name + " " +this.middlename);
    }

    public Collection<Appointment> getAppointments() {
        return appointments;
    }

    public StringBuilder getAppointmentsStr(){
        StringBuilder stringBuilder = new StringBuilder();
        this.appointments.forEach(x -> stringBuilder.append(x.toString()));
        return  stringBuilder;
    }
}
