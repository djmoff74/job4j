package ru.job4j.professions;

/**
 * Class Doctor
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class Doctor extends Profession {

    private String category;

    public Diagnose heal(Pacient pacient) {
        return null;
    }

    public String getCategory() {
        return category;
    }
}
