package com.pingwit.core.les_18.classwork.point_2;

public class GenericWarehouseMain {

    public static void main(String[] args) {
        GenericWarehouse<String> stringGenericWarehouse = new GenericWarehouse<>(new String[] {});
        String[] stringProducts = stringGenericWarehouse.getProducts();

        GenericWarehouse<Integer> integerGenericWarehouse = new GenericWarehouse(new Integer[] {});
        Integer[] integerProducts = integerGenericWarehouse.getProducts();

        GenericAnimal[] animals = new GenericAnimal[] {new GenericPet()};
        GenericWarehouse animalGenericWarehouse = new GenericWarehouse<>(new Integer[] {1, 23});
        Object[] products = animalGenericWarehouse.getProducts();
        for (Object obj : products) {
            GenericAnimal ga = (GenericAnimal) obj;
            System.out.println(ga.getName());
        }
    }
}
