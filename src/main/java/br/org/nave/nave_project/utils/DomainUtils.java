package br.org.nave.nave_project.utils;

public class DomainUtils {

    public static String loginDomain = "@nave.org.br";

    public static String buildDomain(String firstPlace) {
        return firstPlace + loginDomain;
    }
}
