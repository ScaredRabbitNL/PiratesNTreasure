package io.github.scaredsmods.piratesntreasure.config;


import io.github.scaredsmods.piratesntreasure.Constants;
import io.wispforest.owo.config.annotation.*;

@Modmenu(modId = "piratesntreasure")
@Config(name = Constants.CONFIG_NAME, wrapperName = Constants.CONFIG_WRAPPER_NAME)
public class PSTConfig {

    @SectionHeader("world-gen")
    public String WORLD_GEN_SECTION_HEADER = "WorldGen";

    @Nest
    public  WorldGen worldGenNest = new WorldGen();


    public static class WorldGen {
        public  boolean isGeneralWorldGenEnabled = true;


    }
}
