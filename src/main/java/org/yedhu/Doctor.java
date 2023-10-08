package org.yedhu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //if you want to remove this component then ypu need add bean in xml or java file......
@Scope(scopeName = "prototype")
public class Doctor implements Staff{

    private String qualification;

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public String getQualification(){
        return qualification;
    }
    @Override
    public void assist() {
        System.out.println("Doctor is assisting....2");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
