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
package org.eclipse.e4.ui.workbench.annotations.contributions;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBarContribution;
import org.eclipse.e4.ui.workbench.annotations.items.DirectToolItem;
import org.eclipse.e4.ui.workbench.annotations.items.HandledToolItem;
import org.eclipse.e4.ui.workbench.annotations.items.Separator;
import org.eclipse.e4.ui.workbench.annotations.tools.ToolControl;

/**
 * Use this annotation to tag types that define a {@link MToolBarContribution}. The annotation's
 * value must return the contribution's id, otherwise the contribution is not created.
 * @see DirectToolItem
 * @see HandledToolItem
 * @see Separator
 * @see ToolControl
 * @required The ID is a required value. 
 */
@Qualifier
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToolbarContribution {
	// the toolbar contribution id
	String value() default "";
}