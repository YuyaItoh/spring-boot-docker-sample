package com.example;

import java.time.LocalDate;

import com.example.isd.common.ChronoService;

public class DevelopmentChronoService extends ChronoService {
    @Override
    public LocalDate today() {
        return LocalDate.MIN;
    }

}
