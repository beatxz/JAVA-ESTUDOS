package Exception.ExceptionTest.Ex013;

import Exception.ExceptionTest.Ex012.LoginInvalid;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws LoginInvalid, FileNotFoundException {
        System.out.println("saving person");
    }
}
