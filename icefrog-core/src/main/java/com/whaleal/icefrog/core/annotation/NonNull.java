package com.whaleal.icefrog.core.annotation;


import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.*;

/**
 * A common  annotation to declare that annotated elements cannot be {@code null}. Leverages JSR 305 meta-annotations to indicate
 * nullability in Java to common tools with JSR 305 support and used by Kotlin to infer nullability of Spring API.
 *
 * <p>Should be used at parameter, return value, and field level. Method overrides should repeat parent {@code @NonNull} annotations unless
 * they behave differently.</p>
 *
 * <p>Use {@code @NonNullApi} (scope = parameters + return values) to set the default behavior to non-nullable in order to avoid annotating
 * your whole codebase with {@code @NonNull}.</p>
 *
 * @see NonNullApi
 * @see Nullable
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Nonnull
@TypeQualifierNickname
public @interface NonNull {
}
