import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class fechaTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun valida() {
        val fecha = fecha(15, 13, 2023)
        assertTrue (fecha.valida())
    }


    @Test
    fun fechaInvalidaDia() {
        val fecha = fecha(32, 5, 2022)
        assertFalse (fecha.valida())
    }

    @Test
    fun fechaInvalidaMes() {
        val fecha = fecha(12, 13, 2021)
       // Assert.assertFalse(fecha.valida())
        assertFalse (fecha.valida())
    }

    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = fecha(29, 2, 2021)
        assertFalse (fecha.valida())
        println("Fecha invalida")
        println(fecha.valida())
    }

    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = fecha(29, 2, 2024)
        assertTrue (fecha.valida())
        println("Fecha valida Bisiesto")
        println(fecha.valida())
    }




}