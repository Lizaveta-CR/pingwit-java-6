package com.pingwit.core.les_18.classwork.point_1.extension;

interface B {

}

interface C {

}

public class A {
}

class F {
}

class D<T extends A & B & C> {

}
//compile-time error
//class E<T extends B & A & C> {
//
//}
