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
package org.eclipse.e4.ui.workbench.ide.commands;

public interface E4WorkbenchCommandConstants {

    /**
     * Id for command "Show Perspective" in category "Perspectives"
     * (value is <code>"org.eclipse.e4.ui.perspectives.showPerspective"</code>).
     */
    public static final String PERSPECTIVES_SHOW_PERSPECTIVE = "org.eclipse.e4.ui.perspectives.showPerspective"; //$NON-NLS-1$
    
	/**
	 * Id for parameter "Perspective Id" in command "Show Perspective" in
	 * category "Perspectives" (value is
	 * <code>"org.eclipse.e4.ui.perspectives.showPerspective.commandparamerter.perspectiveId"</code>).
	 */
	public static final String PERSPECTIVES_SHOW_PERSPECTIVE_PARM_ID = 
			"org.eclipse.e4.ui.perspectives.showPerspective.commandparamerter.perspectiveId"; //$NON-NLS-1$

	/**
	 * Id for parameter "In New Window" in command "Show Perspective" in
	 * category "Perspectives" (value is
	 * <code>"org.eclipse.e4.ui.perspectives.showPerspective.commandparamerter.newWindow"</code>).
	 * Optional.
	 */
	public static final String PERSPECTIVES_SHOW_PERSPECTIVE_PARM_NEWWINDOW = 
			"org.eclipse.e4.ui.perspectives.showPerspective.commandparamerter.newWindow"; //$NON-NLS-1$
}