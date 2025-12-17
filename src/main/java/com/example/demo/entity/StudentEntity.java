
package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenrationType.IDENTITY)
      private long id; 
      private String name;
      private String email;
      private float cgpa;

}