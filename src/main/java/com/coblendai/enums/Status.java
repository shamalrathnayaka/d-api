package com.coblendai.enums;

public enum Status {
    ACTIVE("ACTIVE", 1),
    INACTIVE("INACTIVE", 2),
    SUSPENDED("SUSPENDED", 3),
    DELETED("DELETED", 4),
    PENDING("PENDING", 5),
    BANNED("BANNED", 6),
    LOCKED("LOCKED", 7),
    VERIFIED("VERIFIED", 8),
    UNVERIFIED("UNVERIFIED", 9),
    ARCHIVED("ARCHIVED", 10),
    AWAITING_APPROVAL("AWAITING_APPROVAL", 11),
    DEACTIVATED("DEACTIVATED", 12);

    private final String key;
    private final int value;

    Status(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public static Status fromString(String status) {
        for (Status statusKey : Status.values()) {
            if (statusKey.key.equals(status)) {
                return statusKey;
            }
        }
        throw new IllegalArgumentException("No constant with key " + status + " found");
    }

    public static Status fromValue(int value) {
        for (Status statusValue : Status.values()) {
            if (statusValue.value == value) {
                return statusValue;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }

}
