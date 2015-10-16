package wizard.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class User{

    @Id
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