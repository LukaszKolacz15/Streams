package pl.akademiakodu.pl.akademiakodu.animals;

import pl.akademiakodu.pl.akademiakodu.animals.Animal;
import pl.akademiakodu.pl.akademiakodu.animals.AnimalChecker;
import pl.akademiakodu.pl.akademiakodu.animals.checker.CheckJump;
import pl.akademiakodu.pl.akademiakodu.animals.checker.CheckRun;
import pl.akademiakodu.pl.akademiakodu.animals.checker.CheckSpeak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz Kolacz on 27.05.2017.
 */
public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Oskarda", true, true, true));
        animalList.add(new Animal("Kangarooo", true, false, true));
        animalList.add(new Animal("Pagigu", false, true, true));
        animalList.add(new Animal("Ptasznik", false, false, false));

//          ZMIENIAMY NA LAMBDY
//        AnimalChecker checkJump = new CheckJump();
//        AnimalChecker checkRun = new CheckRun();
//        AnimalChecker checkSpeak = new CheckSpeak();

//        checker(animalList,checkJump);
//        checker(animalList,checkRun);
//        checker(animalList,checkSpeak);

//          LAMBDY:
        checker(animalList, s -> s.isCanJump());
        checker(animalList, s -> s.isCanRun());
        checker(animalList, s -> s.isCanSpeak());
//        Po tym zabiegu można usunąć cały pakiet checker, bo jest już nie potrzebny

    }
    private static void checker(List<Animal> animals, AnimalChecker animalChecker){
        for (Animal animal : animals){
            System.out.println(animal.getName() + " : " + animalChecker.checSkill(animal));
        }
    }
}
