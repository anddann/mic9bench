package mic9bench.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * Created by adann on 05.05.17.
 */

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Critical {

  public enum ViolationType { INTEGRITY, CONFIDENTIALITY, BOTH, NONE }

  String          path() default "";
  ViolationType   type() default ViolationType.NONE;
}
