/*******************************************************************************
 * Copyright (c) 2012 Joseph Carroll and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joseph Carroll <jdsalingerjr@gmail.com> - initial API and implementation
 ******************************************************************************/ 
package org.eclipse.e4.ui.workbench.annotations.commands;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.workbench.annotations.categories.Category;

/**
 * Use this annotation to tag fields that define tags for a {@link MCommand}. The tagged field
 * must be of type <code>String[]</code>. 
 * <p>
 * This annotation must not be applied to more than one field per class. If several class
 * fields are tagged with this annotation, only one of them will be used.
 * </p>
 * @see Category
 */
@Qualifier
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandTags {
	// reserved for future use
	String value() default "";
}
