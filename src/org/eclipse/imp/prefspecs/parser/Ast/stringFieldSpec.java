
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

package org.eclipse.imp.prefspecs.parser.Ast;

import lpg.runtime.*;

import org.eclipse.imp.parser.IParser;
import java.util.Hashtable;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *<b>
 *<li>Rule 63:  stringFieldSpec ::= STRING$ identifier stringFieldPropertySpecs optConditionalSpec
 *</b>
 */
public class stringFieldSpec extends ASTNode implements IstringFieldSpec
{
    private identifier _identifier;
    private stringFieldPropertySpecs _stringFieldPropertySpecs;
    private optConditionalSpec _optConditionalSpec;

    public identifier getidentifier() { return _identifier; }
    /**
     * The value returned by <b>getstringFieldPropertySpecs</b> may be <b>null</b>
     */
    public stringFieldPropertySpecs getstringFieldPropertySpecs() { return _stringFieldPropertySpecs; }
    /**
     * The value returned by <b>getoptConditionalSpec</b> may be <b>null</b>
     */
    public optConditionalSpec getoptConditionalSpec() { return _optConditionalSpec; }

    public stringFieldSpec(IToken leftIToken, IToken rightIToken,
                           identifier _identifier,
                           stringFieldPropertySpecs _stringFieldPropertySpecs,
                           optConditionalSpec _optConditionalSpec)
    {
        super(leftIToken, rightIToken);

        this._identifier = _identifier;
        ((ASTNode) _identifier).setParent(this);
        this._stringFieldPropertySpecs = _stringFieldPropertySpecs;
        if (_stringFieldPropertySpecs != null) ((ASTNode) _stringFieldPropertySpecs).setParent(this);
        this._optConditionalSpec = _optConditionalSpec;
        if (_optConditionalSpec != null) ((ASTNode) _optConditionalSpec).setParent(this);
        initialize();
    }

    /**
     * A list of all children of this node, including the null ones.
     */
    public java.util.ArrayList getAllChildren()
    {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add(_identifier);
        list.add(_stringFieldPropertySpecs);
        list.add(_optConditionalSpec);
        return list;
    }

    public boolean equals(Object o)
    {
        if (o == this) return true;
        //
        // The super call test is not required for now because an Ast node
        // can only extend the root Ast, AstToken and AstList and none of
        // these nodes contain additional children.
        //
        // if (! super.equals(o)) return false;
        //
        if (! (o instanceof stringFieldSpec)) return false;
        stringFieldSpec other = (stringFieldSpec) o;
        if (! _identifier.equals(other._identifier)) return false;
        if (_stringFieldPropertySpecs == null)
            if (other._stringFieldPropertySpecs != null) return false;
            else; // continue
        else if (! _stringFieldPropertySpecs.equals(other._stringFieldPropertySpecs)) return false;
        if (_optConditionalSpec == null)
            if (other._optConditionalSpec != null) return false;
            else; // continue
        else if (! _optConditionalSpec.equals(other._optConditionalSpec)) return false;
        return true;
    }

    public int hashCode()
    {
        int hash = 7;
        hash = hash * 31 + (_identifier.hashCode());
        hash = hash * 31 + (_stringFieldPropertySpecs == null ? 0 : _stringFieldPropertySpecs.hashCode());
        hash = hash * 31 + (_optConditionalSpec == null ? 0 : _optConditionalSpec.hashCode());
        return hash;
    }

    public void accept(IAstVisitor v)
    {
        if (! v.preVisit(this)) return;
        enter((Visitor) v);
        v.postVisit(this);
    }

    public void enter(Visitor v)
    {
        boolean checkChildren = v.visit(this);
        if (checkChildren)
        {
            _identifier.accept(v);
            if (_stringFieldPropertySpecs != null) _stringFieldPropertySpecs.accept(v);
            if (_optConditionalSpec != null) _optConditionalSpec.accept(v);
        }
        v.endVisit(this);
    }
}


