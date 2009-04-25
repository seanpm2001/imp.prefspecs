
////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2007 IBM Corporation.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
//Contributors:
//    Stan Sutton (suttons@us.ibm.com) - initial API and implementation
//    Robert Fuhrer (rfuhrer@watson.ibm.com)
////////////////////////////////////////////////////////////////////////////////

package org.eclipse.imp.prefspecs.parser;

public interface PrefspecsParsersym {
    public final static int
      TK_COMMA = 13,
      TK_DOT = 25,
      TK_SEMICOLON = 1,
      TK_PLUS = 43,
      TK_MINUS = 44,
      TK_LEFTPAREN = 66,
      TK_RIGHTPAREN = 67,
      TK_LEFTBRACE = 6,
      TK_RIGHTBRACE = 7,
      TK_PACKAGE = 45,
      TK_PAGE = 26,
      TK_TABS = 46,
      TK_FIELDS = 27,
      TK_CONDITIONALS = 47,
      TK_CHOICETYPE = 28,
      TK_CUSTOM = 48,
      TK_DETAILS = 49,
      TK_DEFAULT = 19,
      TK_CONFIGURATION = 20,
      TK_INSTANCE = 21,
      TK_PROJECT = 22,
      TK_IN = 50,
      TK_OUT = 51,
      TK_BOOLEAN = 29,
      TK_COLOR = 30,
      TK_COMBO = 31,
      TK_DIRECTORY = 32,
      TK_DIRLIST = 33,
      TK_DOUBLE = 34,
      TK_FILE = 35,
      TK_FONT = 36,
      TK_INT = 37,
      TK_RADIO = 38,
      TK_STRING = 39,
      TK_BOLD = 52,
      TK_COLUMNS = 14,
      TK_DEFVALUE = 8,
      TK_EMPTYALLOWED = 11,
      TK_HASSPECIAL = 9,
      TK_ISEDITABLE = 2,
      TK_ISREMOVABLE = 3,
      TK_ITALIC = 53,
      TK_LABEL = 4,
      TK_NORMAL = 54,
      TK_RANGE = 15,
      TK_TOOLTIP = 5,
      TK_TYPE = 16,
      TK_VALIDATOR = 12,
      TK_VALUES = 17,
      TK_TRUE = 40,
      TK_FALSE = 41,
      TK_ON = 55,
      TK_OFF = 56,
      TK_WITH = 57,
      TK_AGAINST = 58,
      TK_IF = 59,
      TK_UNLESS = 60,
      TK_EOF_TOKEN = 61,
      TK_SINGLE_LINE_COMMENT = 68,
      TK_IDENTIFIER = 23,
      TK_INTEGER = 10,
      TK_STRING_LITERAL = 18,
      TK_DECIMAL = 24,
      TK_DOTS = 42,
      TK_booleanCustomSpec = 62,
      TK_intCustomSpec = 63,
      TK_radioCustomSpec = 64,
      TK_stringCustomSpec = 65,
      TK_ERROR_TOKEN = 69;

    public final static String orderedTerminalSymbols[] = {
                 "",
                 "SEMICOLON",
                 "ISEDITABLE",
                 "ISREMOVABLE",
                 "LABEL",
                 "TOOLTIP",
                 "LEFTBRACE",
                 "RIGHTBRACE",
                 "DEFVALUE",
                 "HASSPECIAL",
                 "INTEGER",
                 "EMPTYALLOWED",
                 "VALIDATOR",
                 "COMMA",
                 "COLUMNS",
                 "RANGE",
                 "TYPE",
                 "VALUES",
                 "STRING_LITERAL",
                 "DEFAULT",
                 "CONFIGURATION",
                 "INSTANCE",
                 "PROJECT",
                 "IDENTIFIER",
                 "DECIMAL",
                 "DOT",
                 "PAGE",
                 "FIELDS",
                 "CHOICETYPE",
                 "BOOLEAN",
                 "COLOR",
                 "COMBO",
                 "DIRECTORY",
                 "DIRLIST",
                 "DOUBLE",
                 "FILE",
                 "FONT",
                 "INT",
                 "RADIO",
                 "STRING",
                 "TRUE",
                 "FALSE",
                 "DOTS",
                 "PLUS",
                 "MINUS",
                 "PACKAGE",
                 "TABS",
                 "CONDITIONALS",
                 "CUSTOM",
                 "DETAILS",
                 "IN",
                 "OUT",
                 "BOLD",
                 "ITALIC",
                 "NORMAL",
                 "ON",
                 "OFF",
                 "WITH",
                 "AGAINST",
                 "IF",
                 "UNLESS",
                 "EOF_TOKEN",
                 "booleanCustomSpec",
                 "intCustomSpec",
                 "radioCustomSpec",
                 "stringCustomSpec",
                 "LEFTPAREN",
                 "RIGHTPAREN",
                 "SINGLE_LINE_COMMENT",
                 "ERROR_TOKEN"
             };

    public final static int numTokenKinds = orderedTerminalSymbols.length;
    public final static boolean isValidForParser = true;
}
