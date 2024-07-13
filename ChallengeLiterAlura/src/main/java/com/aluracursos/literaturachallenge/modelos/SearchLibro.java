package com.aluracursos.literaturachallenge.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SearchLibro(
        @JsonAlias("count") Integer resultados,
        @JsonAlias("results") List<DataLibro> libro
) {
}
