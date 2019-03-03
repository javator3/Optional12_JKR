package pl.sda.optional12;

import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;




class ExampleTest  {


    @Test
    public void whenCreateEmptyOptional_thenReturnFalse(){
        Optional<String>empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull(){
        String name = "testowa wartość";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[testowa wartosc]", opt.toString());
    }

    @Test (expected = NullPointerException.class)
    public void givenNullWhenErrorCreate_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

    @Test
    public void givenNullWhenCreateNullable_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty", opt.toString());

    }

    @Test
    public void givenOptional_whenIfPresentOk_thenCorrect(){


//        if (name != null){
//            System.out.println("Nazywam sie: " + name);
//        }

        Optional<String> name = Optional.of(null);
        name.ifPresent(n -> System.out.println("Witaj " + n));

//        if (name.isPresent()){
//            System.out.println();
//        }
    }

    @Test
    public void whenOrElseWorks_thenCorrect(){
        String name = null;
        String nameGood = Optional.ofNullable(name).orElse("Nowe imie");
//        assertEquals("Optional empty", toString());
    }

}
