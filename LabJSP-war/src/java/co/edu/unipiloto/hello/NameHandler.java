package co.edu.unipiloto.hello;

import java.time.LocalDate;

public class NameHandler {
    
    String name;
    LocalDate birthDate;
    
    public NameHandler(){
        name=null;
        birthDate=null;
    }
    
    public int age(){
     
        return birthDate.until(LocalDate.now()).getYears(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
       return birthDate.toString();
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = LocalDate.parse(birthDate);
    }
    
}
