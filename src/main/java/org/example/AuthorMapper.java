package org.example;

import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {

    AuthorDTO entityToDto(Author entity);

    Author dtoToEntity(AuthorDTO dto);

}