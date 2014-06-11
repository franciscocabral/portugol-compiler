/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AAvalieComando extends PComando
{
    private PAvalieEstruturas _avalieEstruturas_;

    public AAvalieComando()
    {
        // Constructor
    }

    public AAvalieComando(
        @SuppressWarnings("hiding") PAvalieEstruturas _avalieEstruturas_)
    {
        // Constructor
        setAvalieEstruturas(_avalieEstruturas_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieComando(
            cloneNode(this._avalieEstruturas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieComando(this);
    }

    public PAvalieEstruturas getAvalieEstruturas()
    {
        return this._avalieEstruturas_;
    }

    public void setAvalieEstruturas(PAvalieEstruturas node)
    {
        if(this._avalieEstruturas_ != null)
        {
            this._avalieEstruturas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._avalieEstruturas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._avalieEstruturas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._avalieEstruturas_ == child)
        {
            this._avalieEstruturas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._avalieEstruturas_ == oldChild)
        {
            setAvalieEstruturas((PAvalieEstruturas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}