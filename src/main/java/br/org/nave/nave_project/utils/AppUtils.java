package br.org.nave.nave_project.utils;

import java.util.UUID;

public class AppUtils {

    public static String generateRandomUuid(){
        return UUID.randomUUID().toString();
    }
}
