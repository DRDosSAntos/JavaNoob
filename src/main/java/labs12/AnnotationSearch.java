package labs12;

import java.lang.reflect.Method;

public class AnnotationSearch {

    public void reflection(Class clazz) {

        Method[] methods = clazz.getMethods();


        for (Method method : methods) {
            boolean anot = method.isAnnotationPresent(MyAnnotation.class);
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                //boolean anot2 = method.isAnnotationPresent(MyAnnotation2.class);
                //System.out.println(clazz.getAnnotation();
                //System.out.println(method);
            }


//        Annotation[] getMyAnnotation = clazz.getDeclaredAnnotations();
//        for (Annotation annotation : getMyAnnotation) {
//            System.out.println(annotation.annotationType());
//        }

//        System.out.println(getMyAnnotation);


        }

    }
}
