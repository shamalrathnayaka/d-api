package com.coblendai.enums;

public enum AddressStatus {
    ACTIVE("ACTIVE", 1),
    INACTIVE("INACTIVE", 2),
    DELETED("DELETED", 3);

    private final String key;
    private final int value;

    AddressStatus(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public static AddressStatus fromString(String status) {
        for (AddressStatus addressKey : AddressStatus.values()) {
            if (addressKey.key.equals(status)) {
                return addressKey;
            }
        }
        throw new IllegalArgumentException("No constant with key " + status + " found");
    }

    public static AddressStatus fromValue(int value) {
        for (AddressStatus addressValue : AddressStatus.values()) {
            if (addressValue.value == value) {
                return addressValue;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }

}
