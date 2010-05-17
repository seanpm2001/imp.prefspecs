
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
      TK_COMMA = 15,
      TK_DOT = 32,
      TK_SEMICOLON = 1,
      TK_PLUS = 40,
      TK_MINUS = 41,
      TK_LEFTPAREN = 62,
      TK_RIGHTPAREN = 63,
      TK_LEFTBRACE = 2,
      TK_RIGHTBRACE = 3,
      TK_PACKAGE = 42,
      TK_PAGE = 33,
      TK_TABS = 34,
      TK_FIELDS = 35,
      TK_CONDITIONALS = 43,
      TK_CHOICETYPE = 36,
      TK_GROUP = 16,
      TK_DETAILS = 44,
      TK_DEFAULT = 45,
      TK_CONFIGURATION = 46,
      TK_INSTANCE = 47,
      TK_PROJECT = 48,
      TK_IN = 49,
      TK_OUT = 50,
      TK_BOOLEAN = 17,
      TK_COLOR = 18,
      TK_COMBO = 19,
      TK_DIRECTORY = 20,
      TK_DIRLIST = 21,
      TK_DOUBLE = 22,
      TK_FILE = 23,
      TK_FONT = 24,
      TK_INT = 25,
      TK_RADIO = 26,
      TK_STRING = 27,
      TK_BOLD = 51,
      TK_COLUMNS = 28,
      TK_DEFVALUE = 4,
      TK_DYNAMIC = 52,
      TK_EMPTYALLOWED = 10,
      TK_ISEDITABLE = 5,
      TK_ISREMOVABLE = 6,
      TK_ITALIC = 53,
      TK_LABEL = 7,
      TK_NORMAL = 54,
      TK_RANGE = 13,
      TK_TOOLTIP = 8,
      TK_TYPE = 29,
      TK_VALIDATOR = 11,
      TK_VALUES = 30,
      TK_TRUE = 37,
      TK_FALSE = 38,
      TK_ON = 55,
      TK_OFF = 56,
      TK_WITH = 57,
      TK_AGAINST = 58,
      TK_IF = 59,
      TK_UNLESS = 60,
      TK_EOF_TOKEN = 61,
      TK_SINGLE_LINE_COMMENT = 64,
      TK_IDENTIFIER = 14,
      TK_INTEGER = 9,
      TK_STRING_LITERAL = 12,
      TK_DECIMAL = 31,
      TK_DOTS = 39,
      TK_ERROR_TOKEN = 65;

    public final static String orderedTerminalSymbols[] = {
                 "",
                 "SEMICOLON",
                 "LEFTBRACE",
                 "RIGHTBRACE",
                 "DEFVALUE",
                 "ISEDITABLE",
                 "ISREMOVABLE",
                 "LABEL",
                 "TOOLTIP",
                 "INTEGER",
                 "EMPTYALLOWED",
                 "VALIDATOR",
                 "STRING_LITERAL",
                 "RANGE",
                 "IDENTIFIER",
                 "COMMA",
                 "GROUP",
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
                 "COLUMNS",
                 "TYPE",
                 "VALUES",
                 "DECIMAL",
                 "DOT",
                 "PAGE",
                 "TABS",
                 "FIELDS",
                 "CHOICETYPE",
                 "TRUE",
                 "FALSE",
                 "DOTS",
                 "PLUS",
                 "MINUS",
                 "PACKAGE",
                 "CONDITIONALS",
                 "DETAILS",
                 "DEFAULT",
                 "CONFIGURATION",
                 "INSTANCE",
                 "PROJECT",
                 "IN",
                 "OUT",
                 "BOLD",
                 "DYNAMIC",
                 "ITALIC",
                 "NORMAL",
                 "ON",
                 "OFF",
                 "WITH",
                 "AGAINST",
                 "IF",
                 "UNLESS",
                 "EOF_TOKEN",
                 "LEFTPAREN",
                 "RIGHTPAREN",
                 "SINGLE_LINE_COMMENT",
                 "ERROR_TOKEN"
             };

    public final static int numTokenKinds = orderedTerminalSymbols.length;
    public final static boolean isValidForParser = true;
}
