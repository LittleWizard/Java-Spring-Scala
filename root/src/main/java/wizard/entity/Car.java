package wizard.entity;


import javax.persistence.*;

@Entity
@SequenceGenerator(name = Car.CAR_SEQUENCE_NAME, sequenceName = Car.CAR_SEQUENCE_NAME, initialValue = 10, allocationSize = 53)
public class Car {
    public static final String CAR_SEQUENCE_NAME = "CAR_SEQUENCE_ID";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = CAR_SEQUENCE_NAME)
    private int id;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
