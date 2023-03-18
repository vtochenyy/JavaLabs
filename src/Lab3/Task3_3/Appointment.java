package Lab3.Task3_3;

import java.util.Date;

public class Appointment {
    private TypeOfOperation typeOfOpertion;
    private String appointedBy;
    private Date dateOfAppoint;

    public Appointment(TypeOfOperation typeOfOpertion, String appointedBy, Date dateOfAppoint) {
        this.typeOfOpertion = typeOfOpertion;
        this.appointedBy = appointedBy;
        this.dateOfAppoint = dateOfAppoint;
    }

    public TypeOfOperation getTypeOfOpertion() {
        return typeOfOpertion;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public Date getDateOfAppoint() {
        return dateOfAppoint;
    }

    @Override
    public String toString() {
        return "Назначение: " +
                "Тип : " + typeOfOpertion.getNameOfOperation() +
                ", назначен лицом : '" + appointedBy + '\'' +
                ", дата назначения : " + dateOfAppoint.toString();
    }
}
