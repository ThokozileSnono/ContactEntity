package org.hospitality.utility;

import java.util.UUID;

public class GenericHelper {

    public static String generateContact(){
        return UUID.randomUUID().toString();
    }
}
