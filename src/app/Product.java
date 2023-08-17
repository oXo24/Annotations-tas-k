package app;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface Product {

    String name() default "unknown";

    int quota() default 0;
}
