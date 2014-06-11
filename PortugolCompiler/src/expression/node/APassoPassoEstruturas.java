/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class APassoPassoEstruturas extends PPassoEstruturas
{
    private TPasso _passo_;
    private TInteiro _inteiro_;

    public APassoPassoEstruturas()
    {
        // Constructor
    }

    public APassoPassoEstruturas(
        @SuppressWarnings("hiding") TPasso _passo_,
        @SuppressWarnings("hiding") TInteiro _inteiro_)
    {
        // Constructor
        setPasso(_passo_);

        setInteiro(_inteiro_);

    }

    @Override
    public Object clone()
    {
        return new APassoPassoEstruturas(
            cloneNode(this._passo_),
            cloneNode(this._inteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPassoPassoEstruturas(this);
    }

    public TPasso getPasso()
    {
        return this._passo_;
    }

    public void setPasso(TPasso node)
    {
        if(this._passo_ != null)
        {
            this._passo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._passo_ = node;
    }

    public TInteiro getInteiro()
    {
        return this._inteiro_;
    }

    public void setInteiro(TInteiro node)
    {
        if(this._inteiro_ != null)
        {
            this._inteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._passo_)
            + toString(this._inteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._passo_ == child)
        {
            this._passo_ = null;
            return;
        }

        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._passo_ == oldChild)
        {
            setPasso((TPasso) newChild);
            return;
        }

        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
