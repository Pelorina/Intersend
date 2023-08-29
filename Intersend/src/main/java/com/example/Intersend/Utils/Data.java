package com.example.Intersend.Utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private String accountName;
    private String accountNumber;
    private String accountBalance;
}
