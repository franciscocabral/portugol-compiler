/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoSimplesBlocoDeclaracao extends PBlocoDeclaracao
{
    private PDeclaracao _declaracao_;

    public ADeclaracaoSimplesBlocoDeclaracao()
    {
        // Constructor
    }

    public ADeclaracaoSimplesBlocoDeclaracao(
        @SuppressWarnings("hiding") PDeclaracao _declaracao_)
    {
        // Constructor
        setDeclaracao(_declaracao_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoSimplesBlocoDeclaracao(
            cloneNode(this._declaracao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoSimplesBlocoDeclaracao(this);
    }

    public PDeclaracao getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(PDeclaracao node)
    {
        if(this._declaracao_ != null)
        {
            this._declaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracao_ == child)
        {
            this._declaracao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
