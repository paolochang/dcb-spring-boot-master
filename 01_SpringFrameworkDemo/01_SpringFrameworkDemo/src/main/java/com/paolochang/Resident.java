package com.paolochang;

import org.springframework.stereotype.Component;

/**
 * @Component annotation creates the Bean out of the Resident class
 * Bean can be created without @Component annotation
 * See the BeanConfig for more detail
 */
//@Component
public class Resident implements Staff {
    public void assist() {
        System.out.println("Resident Doctor is assisting");
    }
}
