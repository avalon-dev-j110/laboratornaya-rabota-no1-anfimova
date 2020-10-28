package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавьте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявлен в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должны быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address{

    private String registrationAddress;
    private String residentialAddress;

    public Address(String registrationAddress, String residentialAddress) {
        this.registrationAddress = registrationAddress;
        this.residentialAddress = residentialAddress;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }
}