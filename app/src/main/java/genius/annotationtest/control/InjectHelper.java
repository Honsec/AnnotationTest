package genius.annotationtest.control;

import android.app.Activity;

import java.lang.reflect.Field;

import genius.annotationtest.model.ViewInject;

/**
 * Created by Hongsec on 2016-08-23.
 */
public class InjectHelper {


    public static void init(Activity context) {
        Class<?> aClass = context.getClass();
        Field[] fileds = aClass.getDeclaredFields();
        for (Field field : fileds) {

            if (field.isAnnotationPresent(ViewInject.class)) {
                ViewInject viewInject = field.getAnnotation(ViewInject.class);
                int id = viewInject.value();
                if (id > 0) {
                    field.setAccessible(true);
                    try {
                        field.set(context, context.findViewById(id));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                }
            }

        }

    }
}
