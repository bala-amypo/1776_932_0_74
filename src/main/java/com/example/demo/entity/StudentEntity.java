
package com.example.demo.entity;
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
    public StudentEntity (long id,string name,) 

    public void setName(String name){
        name =this.name;
    }
    public String getname(){
        return  this.name;
    }

    public void setEmail(String email){
        name =this.email;
    }
    public String getEmail(){
        return  this.email;
    }
    public void setCgpa(float cgpa){
        name =this.cgpa;
    }
    public String getCgpa(){
        return  this.cgpa;
    }
    public void setId(int id){
        name =this.id;
    }
    public String getname(){
        return  this.id;
    }
          

}