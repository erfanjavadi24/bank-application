package com.industry.bank.api.enumeration.customer;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true, title = "${GenderType.title}", description = "${GenderType.description}")
public enum GenderType implements Serializable {

    @Schema(name = "MALE", title = "${GenderType.male.title}", description = "${GenderType.male.description}")
    MALE(1, "MALE"),
    @Schema(name = "MALE", title = "${GenderType.female.title}", description = "${GenderType.female.description}")
    FEMALE(2, "FEMALE");

    private final Integer code;
    private final String value;

    GenderType(int code , String value){
        this.code = code;
        this.value = value;
    }

    public static GenderType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in GenderType is invalid : " + code));
    }

    public static GenderType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("value in GenderType is invalid : " + value));
    }

}
