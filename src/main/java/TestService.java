import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestService {

    public void test() {

        try {

            Class clazz = Class.forName("Entity");
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("МЕТОДЫ КЛАССА Entity");

            for (Method method : methods) {

                System.out.println();
                System.out.println("Имя метода: " + method.getName());

                int mods = method.getModifiers();

                System.out.print("Модификатор доступа: ");
                if (Modifier.isPublic(mods)) {
                    System.out.println("public");
                } else if (Modifier.isPrivate(mods)) {
                    System.out.println("private");
                } else if (Modifier.isProtected(mods)) {
                    System.out.println("protected");
                }

                Annotation[] annotations = method.getDeclaredAnnotations();
                for (Annotation currentAnnotation : annotations) {
                    System.out.println("Аннотация: " + currentAnnotation.toString());
                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс");
            System.out.println(ex.getMessage());
        }
    }
}
