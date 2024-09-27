package com.example.moview.repository;

import com.example.moview.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <strong>Repositorio de Películas</strong>
 *
 * Esta interfaz define los métodos CRUD (Create, Read, Update, Delete) básicos para
 * realizar operaciones con las películas en la base de datos. Spring Data JPA proporciona
 * una implementación automática de estos métodos a partir de la definición de la entidad
 * {@link Pelicula}.
 * <br><br>
 * <strong>Anotación @Repository</strong>
 * <br>
 *   Indica que esta interfaz es un componente de Spring y que se encargará de interactuar
 *   con la base de datos. Spring Data JPA utiliza esta anotación para detectar las interfaces
 *   de repositorio y crear implementaciones dinámicas basadas en las convenciones de nombres.
 * <br><br>
 * <strong>Métodos heredados de JpaRepository</strong>
 * <br>
 * <ul>
 *     <li>findAll():** Devuelve una lista con todas las películas.</li>
 *     <li>findById(Integer id):** Busca una película por su ID.</li>
 *     <li>save(Pelicula pelicula):** Guarda una película en la base de datos (crea o actualiza).</li>
 *     <li>delete(Pelicula pelicula):** Elimina una película de la base de datos.</li>
 *     <li>deleteById(Integer id):** Elimina una película por su ID.</li>
 * </ul>
 * Además de los métodos heredados, también podemos definir métodos personalizados para realizar
 * consultas según la idea de negocio.**
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
@Repository
public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
