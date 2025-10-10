package org.jboss.el;

import jakarta.el.ELContext;
import jakarta.el.ExpressionFactory;

public abstract class MethodResolver {
	public abstract Object invoke(ELContext context, Object base, String name, Object[] params) throws Exception;
}
