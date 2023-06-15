package com.pingwit.core.les_11.classwork.point_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateClubConstructorMain {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<PrivateClub> privateClubClass = PrivateClub.class;
        Constructor<?>[] declaredConstructors = privateClubClass.getDeclaredConstructors();

        PrivateClub privateClub = null;
        for (Constructor<?> constructor : declaredConstructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            for (Class<?> type : parameterTypes) {
                if (type.getName().equals(String.class.getName()) && parameterTypes.length == 1) {
                    constructor.setAccessible(true);
                    privateClub = (PrivateClub) constructor.newInstance("Super Club 2");
                }
            }
        }
        System.out.println(privateClub);
    }
}
