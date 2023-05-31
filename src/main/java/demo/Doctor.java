package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//by using annotations..
@Scope(scopeName = "singleton")
public class Doctor {

    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }


}
