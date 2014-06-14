/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoNegacaoLogica extends PNegacaoLogica
{
    private PExpressao _expressao_;

    public AExpressaoNegacaoLogica()
    {
        // Constructor
    }

    public AExpressaoNegacaoLogica(
        @SuppressWarnings("hiding") PExpressao _expressao_)
    {
        // Constructor
        setExpressao(_expressao_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoNegacaoLogica(
            cloneNode(this._expressao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoNegacaoLogica(this);
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
