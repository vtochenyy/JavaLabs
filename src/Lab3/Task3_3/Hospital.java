package Lab3.Task3_3;

import java.util.ArrayList;
import java.util.Collection;

public class Hospital implements IHospital {
    private final Collection<Patient> patients;
    private final Collection<Doctor> doctors;
    private final Collection<Nurse> nurses;

    public Hospital(Collection<Patient> patients, Collection<Doctor> doctors, Collection<Nurse> nurses) {
        this.patients = patients;
        this.doctors = doctors;
        this.nurses = nurses;
    }

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    @Override
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    @Override
    public void addDoctorToPatient(Patient patient, Doctor doctor) {
        if(!this.doctors.contains(doctor)){
            this.doctors.add(doctor);
        }
        patient.setDoctor(doctor);
        doctor.addPatient(patient);
    }

    @Override
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    @Override
    public void printAllInfo() {
        System.out.println("Информация о бльнице: \nНа данный момент на лечении находятся " + this.patients.size() + " пациента(ов).");
        System.out.println("В штате работников " + this.doctors.size() +  " доктора(ов).\n");
        this.patients.forEach(x -> System.out.println("\n========================================================================================================================\n" +
                "За пациентом - " + x.getFIO() + " , закреплён врач - " + x.getDoctor() + ". \nПацинету были назначены: \n" + x.getAppointmentsStr() +
                "\n========================================================================================================================\n")
        );

    }

    @Override
    public void addNurse(Nurse nurse) {
        this.nurses.add(nurse);
    }
}
