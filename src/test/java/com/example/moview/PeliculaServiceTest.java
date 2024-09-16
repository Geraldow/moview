package com.example.moview;

import com.example.moview.service.PeliculaService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.moview.models.Pelicula;
import com.example.moview.repository.PeliculaRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

// Unit test for PeliculaService.crearPelicula function
@RunWith(MockitoJUnitRunner.class) // Para usar Mockito en lugar de SpringRunner ya que es un test unitario
public class PeliculaServiceTest {

    // === Mockeamos el repository ==== //
    @Mock
    private PeliculaRepository peliculaRepository;

    // === Inyectamos el mock en el service ==== //
    @InjectMocks
    private PeliculaService peliculaService;

    // === Declaramos los objetos de prueba ==== //
    private Pelicula peliculaExistente;
    private Pelicula peliculaActualizada;

    // === Inicializamos los objetos de prueba ==== //
    @Before
    public void setUp() {

        // Inicializamos los objetos de prueba
        peliculaExistente = new Pelicula(
                100,
                "The Lord of the Rings",
                123,
                "20th Century Fox",
                "English",
                "HD",
                "An epic adventure in Middle Earth...",
                "Lucas Luis Miguel Jaramillo Ruiz"
        );

        // Creamos una película nueva para actualizarla
        peliculaActualizada = new Pelicula(
                100,
                "El señor de los anillos",
                124,
                "Retro",
                "Español",
                "3D",
                "Una épica aventura en la Tierra Media...",
                "Un desconocido"
        );
    }

    // === Test para crear una película ==== //
    @Test
    public void testCrearPelicula_shouldUpdateExistingMovie() {

        // === Given === //
        /**
         * Existe una película en el repositorio.
         * Primero asimilamos la función {@link PeliculaService#crearPelicula(Pelicula)}
         * guardando los datos de prueba del objeto Pelicula en la variable
         * {@link setUp#peliculaExistente}
         * En este caso, la película {@link #peliculaExistente} representa la película
         * existente en la base de datos. Luego se espera que el método
         * {@link PeliculaService#actualizarPelicula(Pelicula)} actualice la película existente
         * con los datos de la {@link updatedMovie}.
         */
        Mockito.when(peliculaRepository.save(any(Pelicula.class))).thenReturn(peliculaActualizada);

        // === When === //
        /**
         * Cuando se invoca el método {@link PeliculaService#crearPelicula(Pelicula)}
         * con la {@link PeliculaService#actualizarPelicula(Pelicula)}.
         * Se espera que el método actualice la película existente en el repositorio.
         */
        Pelicula result = peliculaService.crearPelicula(peliculaActualizada);

        // === Then === //
        /*
         * Verificamos que el título, duración, clasificación, idioma, formato, trama y director
         * de la película resultante sean los esperados.
         * En este caso, el resultado es una película con los datos actualizados.
         * La comparación se hace con la función {@link org.hamcrest.Matchers#is(Object)}.
         * La función {@link org.hamcrest.MatcherAssert#assertThat(Object, org.hamcrest.Description,
         * org.hamcrest.Matcher)} se utiliza para verificar el resultado.
         * Los valores se comparan contra los valores esperados en la {@link #peliculaActualizada}.
         * El resultado de la comparación es verdadero, lo que indica que la película
         * se ha actualizado correctamente.
         * El método {@link org.hamcrest.Matchers#is(Object or Value)} compara el valor
         */
        assertThat(result.getTitulo(), is("El señor de los anillos"));
        assertThat(result.getDuracion(), is(124));
        assertThat(result.getClasificacion(), is("Retro"));
        assertThat(result.getIdioma(), is("Español"));
        assertThat(result.getFormato(), is("3D"));
        assertThat(result.getTrama(), is("Una épica aventura en la Tierra Media..."));
        assertThat(result.getDirector(), is("Lucas"));
        // Cambiar el director "Lucas" a "Un desconocido" para que se validen todos los datos
    }
}
