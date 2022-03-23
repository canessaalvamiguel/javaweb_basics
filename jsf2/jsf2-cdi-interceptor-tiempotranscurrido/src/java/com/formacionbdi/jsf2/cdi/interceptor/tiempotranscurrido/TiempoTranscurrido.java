package com.formacionbdi.jsf2.cdi.interceptor.tiempotranscurrido;

import java.lang.annotation.Inherited;
import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

@Inherited
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({
    METHOD,
    TYPE
})
public @interface TiempoTranscurrido {
}
