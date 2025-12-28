package edu.icet.config;

import org.modelmapper.ModelMapper;

public class AppConfig {
    public static ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
