package wizard.entity;

import javax.persistence.*;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 50)
    private String name;

}