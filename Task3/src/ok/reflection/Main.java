package ok.reflection;

import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Pet cat = new Pet("Барсик", Status.AVAILABLE,
            List.of(new Photo ("Барсик с цветочком",
                "https://placekitten.com/200/300"),
                new Photo ("Барсик на ручках",
                "https://placekitten.com/500/605")
            ));

        mapToProductDto mTPD = new mapToProductDto();
        Animal animalCat = mTPD.mapToProductDto(cat);
        System.out.println(animalCat.toString());
    }
}
