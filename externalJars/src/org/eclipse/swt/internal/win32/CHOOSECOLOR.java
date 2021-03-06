/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.win32;

public class CHOOSECOLOR {
	public int lStructSize; 
	/** @field cast=(HWND) */
	public long /*int*/ hwndOwner;
	/** @field cast=(HANDLE) */
	public long /*int*/ hInstance; 
	public int rgbResult;
	/** @field cast=(COLORREF *) */
	public long /*int*/ lpCustColors; 
	public int Flags;
	public long /*int*/ lCustData;
	/** @field cast=(LPCCHOOKPROC) */
	public long /*int*/ lpfnHook; 
	/** @field cast=(LPCTSTR) */
	public long /*int*/ lpTemplateName;
	public static final int sizeof = OS.CHOOSECOLOR_sizeof ();
}
