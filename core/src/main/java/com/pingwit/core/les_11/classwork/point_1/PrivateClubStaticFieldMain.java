package com.pingwit.core.les_11.classwork.point_1;

import java.lang.reflect.Field;

public class PrivateClubStaticFieldMain {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(PrivateClub.NUM_OF_VIP_CLIENT);
        PrivateClub privateClub = new PrivateClub();
        Class<PrivateClub> privateClubClass = PrivateClub.class;
        Field field = privateClubClass.getDeclaredField("NUM_OF_VIP_CLIENT");
        field.setAccessible(true);
        field.set(privateClub, 55);
        System.out.println(PrivateClub.NUM_OF_VIP_CLIENT);
    }
}
