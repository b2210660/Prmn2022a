package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        List<Insect> Insects = new ArrayList<>();
        Insects.add(new Insect());
        Insects.add(new Butterfly());
        Insects.add(new Locust());
        Insects.add(new SwallowtailButterfly());

        for(Insect i : Insects){
            i.move();

        }

    }

}
