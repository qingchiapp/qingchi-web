package com.qingchi.server.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author qinkaiyuan
 * @date 2020-03-27 12:48
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumVO {
    private String purePhoneNumber;
    private String countryCode;
}