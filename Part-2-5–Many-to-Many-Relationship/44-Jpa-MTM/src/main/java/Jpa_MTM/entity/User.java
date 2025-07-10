package Jpa_MTM.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer userId;
     private String uname;
     private String gender;

     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(
             name = "user_roles",
             joinColumns = {
                     @JoinColumn(name = "user_id")
             },
             inverseJoinColumns = {
                     @JoinColumn(name = "role_id")
             }
     )
     private List<Role> roles;

}
