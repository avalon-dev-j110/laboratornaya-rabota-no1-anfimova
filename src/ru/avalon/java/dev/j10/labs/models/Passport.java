package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport{

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечьте возможность использования класса за
     *    пределами пакета.
     */

    private int number;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private String birthDate;
    private String issueDate;
    private String authority;

    public Passport(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Passport(String name, String secondName, String patronymic, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getAuthority() {
        return authority;
    }


}
