/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaComando extends PComando
{
    private PRepitaEstruturas _repitaEstruturas_;

    public ARepitaComando()
    {
        // Constructor
    }

    public ARepitaComando(
        @SuppressWarnings("hiding") PRepitaEstruturas _repitaEstruturas_)
    {
        // Constructor
        setRepitaEstruturas(_repitaEstruturas_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaComando(
            cloneNode(this._repitaEstruturas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaComando(this);
    }

    public PRepitaEstruturas getRepitaEstruturas()
    {
        return this._repitaEstruturas_;
    }

    public void setRepitaEstruturas(PRepitaEstruturas node)
    {
        if(this._repitaEstruturas_ != null)
        {
            this._repitaEstruturas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repitaEstruturas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repitaEstruturas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repitaEstruturas_ == child)
        {
            this._repitaEstruturas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repitaEstruturas_ == oldChild)
        {
            setRepitaEstruturas((PRepitaEstruturas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}