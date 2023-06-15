package com.pingwit.core.les_11.classwork.point_1;

public class PrivateClub {
    public static int NUM_OF_VIP_CLIENT = 10;
    private final String clubName;
    private final int members;

    public PrivateClub() {
        this("Super Club", 10);
    }

    private PrivateClub(String clubName) {
        this.clubName = clubName;
        this.members = 10;
    }

    private PrivateClub(String clubName, int members) {
        this.clubName = clubName;
        this.members = members;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
            "clubName='" + clubName + '\'' +
            ", members=" + members +
            '}';
    }
}
