/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ANegacaoLogicaFatorLogico extends PFatorLogico
{
    private PNegacaoLogica _negacaoLogica_;

    public ANegacaoLogicaFatorLogico()
    {
        // Constructor
    }

    public ANegacaoLogicaFatorLogico(
        @SuppressWarnings("hiding") PNegacaoLogica _negacaoLogica_)
    {
        // Constructor
        setNegacaoLogica(_negacaoLogica_);

    }

    @Override
    public Object clone()
    {
        return new ANegacaoLogicaFatorLogico(
            cloneNode(this._negacaoLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegacaoLogicaFatorLogico(this);
    }

    public PNegacaoLogica getNegacaoLogica()
    {
        return this._negacaoLogica_;
    }

    public void setNegacaoLogica(PNegacaoLogica node)
    {
        if(this._negacaoLogica_ != null)
        {
            this._negacaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._negacaoLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._negacaoLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._negacaoLogica_ == child)
        {
            this._negacaoLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._negacaoLogica_ == oldChild)
        {
            setNegacaoLogica((PNegacaoLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
