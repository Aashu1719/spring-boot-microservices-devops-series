package Jpa_MTM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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
@Table(name = "role-mtm")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer roleId;
     private String roleName;

     @ManyToMany(mappedBy = "roles")
     private List<User> users;
}
