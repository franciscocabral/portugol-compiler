/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ASeComando extends PComando
{
    private PSeEstruturas _seEstruturas_;

    public ASeComando()
    {
        // Constructor
    }

    public ASeComando(
        @SuppressWarnings("hiding") PSeEstruturas _seEstruturas_)
    {
        // Constructor
        setSeEstruturas(_seEstruturas_);

    }

    @Override
    public Object clone()
    {
        return new ASeComando(
            cloneNode(this._seEstruturas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComando(this);
    }

    public PSeEstruturas getSeEstruturas()
    {
        return this._seEstruturas_;
    }

    public void setSeEstruturas(PSeEstruturas node)
    {
        if(this._seEstruturas_ != null)
        {
            this._seEstruturas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seEstruturas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seEstruturas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seEstruturas_ == child)
        {
            this._seEstruturas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seEstruturas_ == oldChild)
        {
            setSeEstruturas((PSeEstruturas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}