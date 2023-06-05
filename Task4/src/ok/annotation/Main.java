package ok.annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        print(new Messages());
    }

    public static void print(Messages mes) throws NoSuchMethodException {
        Method method1 = mes.getClass().getDeclaredMethod("happyBirtday");
        Method method2 = mes.getClass().getDeclaredMethod("warning");
        Method method3 = mes.getClass().getDeclaredMethod("notHappyBirtday");
        Method method4 = mes.getClass().getDeclaredMethod("error");

        method1.setAccessible(true);
        method2.setAccessible(true);
        method3.setAccessible(true);
        method4.setAccessible(true);

        try {
            if (method1.isAnnotationPresent(Paint.class)) {
                System.out.println(method1.getAnnotation(Paint.class).style() + method1.getAnnotation(Paint.class).color() + method1.invoke(mes));
            } else if (mes.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(mes.getClass().getAnnotation(Paint.class).style() + mes.getClass().getAnnotation(Paint.class).color() + method1.invoke(mes));
            }

            if (method2.isAnnotationPresent(Paint.class)) {
                System.out.println(method2.getAnnotation(Paint.class).style() + method2.getAnnotation(Paint.class).color() + method2.invoke(mes));
            } else if (mes.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(mes.getClass().getAnnotation(Paint.class).style() + mes.getClass().getAnnotation(Paint.class).color() + method2.invoke(mes));
            }

            if (method3.isAnnotationPresent(Paint.class)) {
                System.out.println(method3.getAnnotation(Paint.class).style() + method3.getAnnotation(Paint.class).color() + method3.invoke(mes));
            } else if (mes.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(mes.getClass().getAnnotation(Paint.class).style() + mes.getClass().getAnnotation(Paint.class).color() + method3.invoke(mes));
            }

            if (method4.isAnnotationPresent(Paint.class)) {
                System.out.println(method4.getAnnotation(Paint.class).style() + method4.getAnnotation(Paint.class).color() + method4.invoke(mes));
            } else if (mes.getClass().isAnnotationPresent(Paint.class)) {
                System.out.println(mes.getClass().getAnnotation(Paint.class).style() + mes.getClass().getAnnotation(Paint.class).color() + method4.invoke(mes));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
