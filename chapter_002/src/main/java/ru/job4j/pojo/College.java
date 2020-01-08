package ru.job4j.pojo;

import java.util.Date;

/**
 * Class College
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Chrenova Gadya Petrovich");
        student.setGroup(174);
        student.setAddmissionDate(new Date());
        System.out.println("Studen : " + student.getFio() + "\n"
                + "Group № " + student.getGroup() + "\n"
                + "Entered : " + student.getAddmissionDate());

    }
}
