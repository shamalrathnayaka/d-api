package com.coblendai.enums;

public enum ActivationStatus {
    ACTIVE("ACTIVE", 1),
    INACTIVE("INACTIVE", 2),
    DELETED("DELETED", 3);

    private final String key;
    private final int value;

    ActivationStatus(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public static ActivationStatus fromString(String status) {
        for (ActivationStatus activationKey : ActivationStatus.values()) {
            if (activationKey.key.equals(status)) {
                return activationKey;
            }
        }
        throw new IllegalArgumentException("No constant with key " + status + " found");
    }

    public static ActivationStatus fromValue(int value) {
        for (ActivationStatus activationValue : ActivationStatus.values()) {
            if (activationValue.value == value) {
                return activationValue;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }

}
