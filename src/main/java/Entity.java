import java.util.ArrayList;
import java.util.List;

public class Entity {
    private Gender gender;
    private int accent;
    private List<String> syllables;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAccent(int accent) {
        this.accent = accent;
    }

    public void setSyllables(List<String> syllables) {
        this.syllables = syllables;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAccent() {
        return accent;
    }

    public List<String> getSyllables() {
        return syllables;
    }
}
