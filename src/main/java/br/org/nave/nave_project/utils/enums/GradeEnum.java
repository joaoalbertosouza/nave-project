package br.org.nave.nave_project.utils.enums;

public enum GradeEnum {

    FIRST(1, "Primeiro Ano", "Tenth Grade"),
    SECOND(2, "Segundo Ano", "Eleventh Grade"),
    THIRD(3, "Terceiro Ano", "Twelfth Grade"),
    ;

    private int number;
    private String translationBr;
    private String translationEn;

    GradeEnum(int number, String translationBr, String translationEn) {
        this.number = number;
        this.translationBr = translationBr;
        this.translationEn = translationEn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTranslationBr() {
        return translationBr;
    }

    public void setTranslationBr(String translationBr) {
        this.translationBr = translationBr;
    }

    public String getTranslationEn() {
        return translationEn;
    }

    public void setTranslationEn(String translationEn) {
        this.translationEn = translationEn;
    }
}
