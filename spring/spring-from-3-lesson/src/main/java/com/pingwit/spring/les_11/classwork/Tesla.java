package com.pingwit.spring.les_11.classwork;

import com.pingwit.spring.les_11.classwork.annotation.UniqueVIN;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public record Tesla(
    Long id,
    @NotNull(message = "Tesla model can not be null!!!")
    TeslaModel model,
    @Size(min = 3, max = 20)
    String motor,
    @NotBlank
    @UniqueVIN
    String vin
) {}
