/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AParaComando extends PComando
{
    private PParaEstruturas _paraEstruturas_;

    public AParaComando()
    {
        // Constructor
    }

    public AParaComando(
        @SuppressWarnings("hiding") PParaEstruturas _paraEstruturas_)
    {
        // Constructor
        setParaEstruturas(_paraEstruturas_);

    }

    @Override
    public Object clone()
    {
        return new AParaComando(
            cloneNode(this._paraEstruturas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComando(this);
    }

    public PParaEstruturas getParaEstruturas()
    {
        return this._paraEstruturas_;
    }

    public void setParaEstruturas(PParaEstruturas node)
    {
        if(this._paraEstruturas_ != null)
        {
            this._paraEstruturas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paraEstruturas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paraEstruturas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paraEstruturas_ == child)
        {
            this._paraEstruturas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paraEstruturas_ == oldChild)
        {
            setParaEstruturas((PParaEstruturas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
