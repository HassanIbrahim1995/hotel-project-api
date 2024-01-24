package org.hotel.pms.mappers;

/**
 * Generic interface for mapping between DTO (Data Transfer Object) and Entity classes.
 * This interface provides a contract for converting back and forth between DTOs and Entities,
 * ensuring a separation of concerns and a clean architecture.
 *
 * @param <D> the type parameter for the DTO class
 * @param <E> the type parameter for the Entity class
 */
public interface IMapper<D, E> {

    /**
     * Converts a DTO to its corresponding Entity.
     *
     * @param dto the DTO to be converted
     * @return the Entity equivalent of the provided DTO
     */
    E dtoToEntity(D dto);

    /**
     * Converts an Entity to its corresponding DTO.
     *
     * @param entity the Entity to be converted
     * @return the DTO equivalent of the provided Entity
     */
    D entityToDto(E entity);
}
