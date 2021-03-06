/*
NameFactory.java
Factory for Name
Author: Demi Farquhar (220322104)
Date: 13 June 2022
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;


public class NameFactory {
    public static Name createName(String firstName, String middleName, String lastName){
        Helper.checkStringParam("First Name",firstName);//Mandatory attribute
        Helper.checkStringParam("Last Name",lastName);//Mandatory attribute
        middleName=Helper.setEmptyIfNull(middleName);

        return new Name.Builder().setFirstName(firstName).setMiddleName(middleName).setLastName(lastName)
                .build();

    }

}
