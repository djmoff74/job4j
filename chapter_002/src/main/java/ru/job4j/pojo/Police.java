package ru.job4j.pojo;

import java.util.Date;

/**
 * Class Police
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
