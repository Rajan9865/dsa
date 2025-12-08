package revision;

/**
 * @author Rajan kumar
 * @version 1.0
 * Dsa
 * @since 12/4/2025
 */
public @interface MyCustomAnnotation {
    String value() default "default value";

    int count() default 0;

    String[] tags() default {};
}

