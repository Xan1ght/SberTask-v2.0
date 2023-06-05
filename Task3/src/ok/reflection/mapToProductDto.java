package ok.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

public class mapToProductDto {
    public Animal mapToProductDto(Pet cat) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();

        try {
            Field field1P = cat.getClass().getDeclaredField("name");
            Field field2P = cat.getClass().getDeclaredField("status");
            Field field3P = cat.getClass().getDeclaredField("photosList");

            Field field1A = animal.getClass().getDeclaredField("title");
            Field field2A = animal.getClass().getDeclaredField("isAvailable");
            Field field3A = animal.getClass().getDeclaredField("isSold");
            Field field4A = animal.getClass().getDeclaredField("photosMap");

            field1P.setAccessible(true);
            field2P.setAccessible(true);
            field3P.setAccessible(true);
            field1A.setAccessible(true);
            field2A.setAccessible(true);
            field3A.setAccessible(true);
            field4A.setAccessible(true);

            String name = (String) field1P.get(cat);
            Status status = (Status) field2P.get(cat);
            List<Photo> photolist = (List<Photo>) field3P.get(cat);

            HashMap<String, String> phMap = new HashMap<>();

            for (Photo photo : photolist) {
                phMap.put(photo.getName(), photo.getURL());
            }

            field1A.set(animal, name);
            field2A.set(animal, status == Status.AVAILABLE);
            field3A.set(animal, status == Status.SOLD);
            field4A.set(animal, phMap);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        }

        return animal;
    }
}
