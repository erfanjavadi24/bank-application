package com.industry.bank.api.dto.general;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class RequestHeader<K , V> extends HashMap<K , V> {

}