package Lab3.Task3_3;

public interface IHospital {
     void addPatient(Patient patient);
     void addDoctorToPatient(Patient patient, Doctor doctor);
     void addDoctor(Doctor doctor);
     void addNurse(Nurse nurse);
     void printAllInfo();
}
