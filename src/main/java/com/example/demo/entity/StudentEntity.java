
package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Generatedvalue;
@Entity
public class StudentEntity{
    @Id
      private long id; 
      private String name;
      private String email;
      private float cgpa;

}