package pl.akademiakodu.pl.akademiakodu.animals.checker;

import pl.akademiakodu.pl.akademiakodu.animals.Animal;
import pl.akademiakodu.pl.akademiakodu.animals.AnimalChecker;

/**
 * Created by Lukasz Kolacz on 27.05.2017.
 */
public class CheckSpeak implements AnimalChecker{

    @Override
    public boolean checSkill(Animal animal) {
        return animal.isCanSpeak();
    }
}
