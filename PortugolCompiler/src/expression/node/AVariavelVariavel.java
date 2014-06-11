/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AVariavelVariavel extends PVariavel
{
    private PIdentficador _identficador_;

    public AVariavelVariavel()
    {
        // Constructor
    }

    public AVariavelVariavel(
        @SuppressWarnings("hiding") PIdentficador _identficador_)
    {
        // Constructor
        setIdentficador(_identficador_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelVariavel(
            cloneNode(this._identficador_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelVariavel(this);
    }

    public PIdentficador getIdentficador()
    {
        return this._identficador_;
    }

    public void setIdentficador(PIdentficador node)
    {
        if(this._identficador_ != null)
        {
            this._identficador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identficador_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identficador_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identficador_ == child)
        {
            this._identficador_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identficador_ == oldChild)
        {
            setIdentficador((PIdentficador) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}