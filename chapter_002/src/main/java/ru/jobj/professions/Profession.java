package ru.jobj.professions;

/**
 * Class Profession
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private Long birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public Long getBirthday() {
        return birthday;
    }
}
