package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */

public class Person {

    private Passport passport;
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

    public Person(Passport passport) {
        this.passport = passport;
    }

    public Person(Address address) {
        this.address = address;
    }

    /**
     * Возвращает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращает Имя, Фамилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */

    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if (passport.getName() != null & passport.getSurname() != null & passport.getPatronymic() != null) {
            return "%s %s %s".formatted(passport.getName(), passport.getSurname(), passport.getPatronymic());
        } else if (passport.getPatronymic() == null & passport.getSecondName() != null) {
            return "%s %s. %s".formatted(passport.getName(), passport.getSecondName().substring(0, 1), passport.getSurname());
        } else if (passport.getPatronymic() == null & passport.getSecondName() == null
                & passport.getName() != null & passport.getSurname() != null) {
            return "%s %s".formatted(passport.getName(), passport.getSurname());
        }
        return "%s %s %s %s".formatted(passport.getName(), passport.getSecondName(),
                passport.getSurname(), passport.getPatronymic());
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */

    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        if (address.getRegistrationAddress().equals(address.getResidentialAddress())) {
            return address.getRegistrationAddress();
        }
        return address.getResidentialAddress();
    }
}