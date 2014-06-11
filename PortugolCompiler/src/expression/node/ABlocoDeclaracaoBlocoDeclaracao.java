/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoDeclaracaoBlocoDeclaracao extends PBlocoDeclaracao
{
    private PBlocoDeclaracao _blocoDeclaracao_;
    private PDeclaracao _declaracao_;

    public ABlocoDeclaracaoBlocoDeclaracao()
    {
        // Constructor
    }

    public ABlocoDeclaracaoBlocoDeclaracao(
        @SuppressWarnings("hiding") PBlocoDeclaracao _blocoDeclaracao_,
        @SuppressWarnings("hiding") PDeclaracao _declaracao_)
    {
        // Constructor
        setBlocoDeclaracao(_blocoDeclaracao_);

        setDeclaracao(_declaracao_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoDeclaracaoBlocoDeclaracao(
            cloneNode(this._blocoDeclaracao_),
            cloneNode(this._declaracao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoDeclaracaoBlocoDeclaracao(this);
    }

    public PBlocoDeclaracao getBlocoDeclaracao()
    {
        return this._blocoDeclaracao_;
    }

    public void setBlocoDeclaracao(PBlocoDeclaracao node)
    {
        if(this._blocoDeclaracao_ != null)
        {
            this._blocoDeclaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoDeclaracao_ = node;
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
            + toString(this._blocoDeclaracao_)
            + toString(this._declaracao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoDeclaracao_ == child)
        {
            this._blocoDeclaracao_ = null;
            return;
        }

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
        if(this._blocoDeclaracao_ == oldChild)
        {
            setBlocoDeclaracao((PBlocoDeclaracao) newChild);
            return;
        }

        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
