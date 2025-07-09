package JpaRelationship.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String personName;
    private LocalDate personDb;
    private String personGender;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL) // that means whatever
//    the opeartions happeens on the person class that will be reflect on the passport
//    class, means the reflection happens on parent to child.
    private Passport passport;
}
