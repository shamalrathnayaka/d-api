package com.coblendai.enums;

public enum AccountStatus {
    ACTIVE("ACTIVE", 1),
    INACTIVE("INACTIVE", 2),
    DELETED("DELETED", 3);

    private final String key;
    private final int value;

    AccountStatus(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public static AccountStatus fromString(String status) {
        for (AccountStatus accountKey : AccountStatus.values()) {
            if (accountKey.key.equals(status)) {
                return accountKey;
            }
        }
        throw new IllegalArgumentException("No constant with key " + status + " found");
    }

    public static AccountStatus fromValue(int value) {
        for (AccountStatus accountValue : AccountStatus.values()) {
            if (accountValue.value == value) {
                return accountValue;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }

}
