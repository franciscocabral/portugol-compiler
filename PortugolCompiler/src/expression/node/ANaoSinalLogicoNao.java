/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ANaoSinalLogicoNao extends PSinalLogicoNao
{
    private TNao _nao_;

    public ANaoSinalLogicoNao()
    {
        // Constructor
    }

    public ANaoSinalLogicoNao(
        @SuppressWarnings("hiding") TNao _nao_)
    {
        // Constructor
        setNao(_nao_);

    }

    @Override
    public Object clone()
    {
        return new ANaoSinalLogicoNao(
            cloneNode(this._nao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaoSinalLogicoNao(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}