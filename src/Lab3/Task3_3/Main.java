package Lab3.Task3_3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor("Виктор", "Шишкин", "Георгиевич");
        Doctor doctor2 = new Doctor("Антон", "Шишкин", "Георгиевич");

        Patient patient = new Patient("Олег", "Болотаев", "Лолович");
        hospital.addPatient(patient);
        hospital.addDoctorToPatient(patient, doctor);
        doctor.addApponintment(new Appointment(TypeOfOperation.PROCEDURE, "Доктор", new Date()));

        Patient patient2 = new Patient("Суровый", "Валентин", "Андреевич");
        hospital.addPatient(patient2);
        hospital.addDoctorToPatient(patient2, doctor2);
        doctor2.addApponintment(new Appointment(TypeOfOperation.MEDICAMENT, "Доктор", new Date()));

        hospital.printAllInfo();
    }
}
