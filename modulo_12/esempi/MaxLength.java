import java.lang.annotation.*;
/**
  Permette il controllo della lunghezza massima di un campo
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MaxLength {
    int value();
}