package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * Class PassportOffice
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 24.01.2020
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
        }
        return rsl;
    }


    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
/*Сервис должен проверять, что гражданина с таким паспортом еще нет, а так же возможность получить информацию о гражданине по его паспорту.

Для решения этой задачи Вам потребуются методы Map.containsKey(key) и Map.get(key).

Давайте напишем тесты.*/