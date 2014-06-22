/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.talend.datatools.xml.utils;

/**
 * This is a utility class which is used to provide some functionality 
 * that are used in instance of ISaxParserConsumer
 */
public class SaxParserUtil
{
	/**
	 * 
	 * @param path
	 *            the path which is stored as column path
	 * @param generatedPath
	 *            the path which is generated by sax parser
	 * @return
	 */
	public static boolean isSamePath( String path, String generatedPath )
	{
		// If two path equal
		if ( path.equals( generatedPath ) )
			return true;

		// Test if column path is absolute path. A generatedPath is always
		// absolute.
		boolean isAbsolute = true;
		if ( path.startsWith( UtilConstants.XPATH_DOUBLE_SLASH ) )
		{
			path = path.replaceFirst( UtilConstants.XPATH_DOUBLE_SLASH, UtilConstants.XPATH_SLASH );
			isAbsolute = false;
		}

		String[] paths = path.replaceFirst( UtilConstants.XPATH_SLASH, "" ).split( UtilConstants.XPATH_SLASH );
		String[] generatedPaths = generatedPath.replaceFirst( UtilConstants.XPATH_SLASH, "" )
				.split( UtilConstants.XPATH_SLASH );
		// The generatePaths always contain no less path elements than path.
		if ( paths.length > generatedPaths.length )
			return false;

		// If is absolute path, then two should contain equal numbers of path
		// element
		if ( isAbsolute )
		{
			if ( paths.length != generatedPaths.length )
				return false;

		}

		for ( int i = 0; i < paths.length; i++ )
		{
			String temp1;
			String temp2;
			temp1 = paths[paths.length - i - 1];

			temp2 = generatedPaths[generatedPaths.length - i - 1];
			if ( !isXPathFragEqual( temp1, temp2 ) )
				return false;
		}
		return true;
	}

	/**
	 * Return whether two XPath Fragment refer to same element/attribute.
	 * @param definedPath
	 *            the defined column path
	 * @param generatedPath
	 *            the sax parser generated path
	 * @return
	 */
	private static boolean isXPathFragEqual( String definedPath, String generatedPath )
	{
		if ( definedPath.startsWith( "*" ) || definedPath.startsWith("[@") )
		{
			String pattern = definedPath.replaceFirst( "\\Q*\\E","" );
			if ( pattern.length()!= 0){
				if ( generatedPath.endsWith( pattern ))
					return true;
			}else
			{
				if( !generatedPath.matches(UtilConstants.XPATH_WITH_ATTR_PATTERN))
					return true;
			}
			return false;
		}

		if ( ( !generatedPath.matches( UtilConstants.XPATH_ELEM_WITH_INDEX_REF_PATTERN ) )
				|| definedPath.matches( UtilConstants.XPATH_ELEM_WITH_INDEX_REF_PATTERN ) )
			return generatedPath.equals( definedPath );
		return generatedPath.replaceFirst( UtilConstants.XPATH_ELEM_INDEX_PATTERN, "" )
				.equals( definedPath );
	}

	/**
	 * Dealing with ".." in a column path. Here the column path is the combination of root path
	 * and the give column path expression.
	 * 
	 * @param path
	 * @return
	 */
	public static String processParentAxis( String path )
	{
		String prefix = "";
		
		//First remove the leading "//" or "/"
		if ( path.startsWith( UtilConstants.XPATH_DOUBLE_SLASH ) )
		{
			path = path.replaceFirst( UtilConstants.XPATH_DOUBLE_SLASH, "" );
			prefix = UtilConstants.XPATH_DOUBLE_SLASH;
		}
		else if ( path.startsWith( UtilConstants.XPATH_SLASH ) )
		{
			path = path.replaceFirst( UtilConstants.XPATH_SLASH, "" );
			prefix = UtilConstants.XPATH_SLASH;
		}
		String[] temp = path.split( UtilConstants.XPATH_SLASH );
		for ( int i = 0; i < temp.length; i++ )
		{
			if ( temp[i].equals( ".." ) )
			{
				temp[i] = null;
				for ( int j = i - 1; j >= 0; j-- )
				{
					if ( temp[j] != null )
					{
						temp[j] = null;
						break;
					}
				}
			}
		}
		
		//Rebuild the path.
		path = prefix;
		for ( int i = 0; i < temp.length; i++ )
		{
			if ( temp[i] != null )
				path = i == 0 ? path + temp[i] : path + (temp[i].startsWith("[")?"":UtilConstants.XPATH_SLASH) + temp[i];
		}

		//Add comments
		if( path.startsWith( "///" ))
			path = path.replaceFirst( "\\Q/\\E", "" );
		return path;
	}
}
