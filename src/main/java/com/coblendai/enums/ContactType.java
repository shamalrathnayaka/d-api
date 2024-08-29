package com.coblendai.enums;

public enum ContactType {
    MOBILE("MOBILE", 1),
    PHONE("PHONE", 2),
    LANDLINE("LANDLINE", 3);

    private final String key;
    private final int value;

    ContactType(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public static ContactType fromString(String type) {
        for (ContactType contactKey : ContactType.values()) {
            if (contactKey.key.equals(type)) {
                return contactKey;
            }
        }
        throw new IllegalArgumentException("No constant with key " + type + " found");
    }

    public static ContactType fromValue(int value) {
        for (ContactType contactValue : ContactType.values()) {
            if (contactValue.value == value) {
                return contactValue;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }
}
