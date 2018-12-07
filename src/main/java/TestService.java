import java.lang.reflect.Method;

public class TestService {


public void test() {

    try {

        Class cl = Class.forName("Entity");

        if (!cl.isAnnotationPresent(Entity.class)) {
            System.err.println("no annotation");
        } else {
            System.out.println("class annotated ; name  -  " + cl.getAnnotation(Entity.class));
        }
        boolean hasSecured = false;

        Method[] method = cl.getMethods();
        for(Method md: method){
            if(md.isAnnotationPresent(Secured.class)) {hasSecured=true;}

            System.out.println("Имя метода: "+md.getName());
            System.out.println("Модификаторы метода: "+md.getModifiers());
            System.out.println("Secured annotaton  - " + hasSecured);

        }


    } catch (ClassNotFoundException ex) {
        System.out.println("Не найден класс");
        System.out.println(ex.getMessage());
    }




    }

}
