package pl.akademiakodu.pl.akademiakodu.animals;

/**
 * Created by Lukasz Kolacz on 27.05.2017.
 */
public class Animal {

    private String name;
    private boolean canRun;
    private boolean canSpeak;
    private boolean canJump;

    public Animal(String name, boolean canRun, boolean canSpeak, boolean canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canSpeak = canSpeak;
        this.canJump = canJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }
}
