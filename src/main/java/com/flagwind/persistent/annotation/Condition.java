package com.flagwind.persistent.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.flagwind.persistent.model.ClauseCombine;

/**
 * 
* @ClassName: Condition 
* @Description: 查询条件注解 
* @author chendb hbchendb1985@hotmail 
* @date 2015年9月25日 下午5:32:22 
*
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, METHOD, FIELD })
public @interface Condition {
	  public String name() default "";
	  public ClauseCombine combine() default ClauseCombine.And;
}
