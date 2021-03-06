/**
 * Autogenerated by Thrift Compiler (0.12.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.aries.auth.clotho.idl.thrift.dto;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-06-15")
public enum ResponseCode implements org.apache.thrift.TEnum {
    SUCCESS(1000),
    NOT_CHANGED(1001),
    PARAM_ERROR(2000),
    PARAM_ILLEGAL(2001),
    PARAM_NULL(2002),
    SYSTEM_ERROR(3000),
    OTHERS_SYSTEM_ERROR(3001),
    PERMISSION_FAIL(3002),
    HOPE_RETRY(4001);

    private final int value;

    private ResponseCode(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static ResponseCode findByValue(int value) {
        switch (value) {
            case 1000:
                return SUCCESS;
            case 1001:
                return NOT_CHANGED;
            case 2000:
                return PARAM_ERROR;
            case 2001:
                return PARAM_ILLEGAL;
            case 2002:
                return PARAM_NULL;
            case 3000:
                return SYSTEM_ERROR;
            case 3001:
                return OTHERS_SYSTEM_ERROR;
            case 3002:
                return PERMISSION_FAIL;
            case 4001:
                return HOPE_RETRY;
            default:
                return null;
        }
    }
}
