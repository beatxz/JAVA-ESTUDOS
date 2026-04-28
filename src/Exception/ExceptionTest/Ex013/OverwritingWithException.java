package Exception.ExceptionTest.Ex013;

import Exception.ExceptionTest.Ex012.LoginInvalid;

import java.io.FileNotFoundException;

public class OverwritingWithException {
    public static void main(String[]args){
        Person person = new Person();
        Employee employee = new Employee();
        try{
            employee.save();
            person.save();
        }catch(LoginInvalid | FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
