/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AParentesesFator extends PFator
{
    private TAParenteses _aParenteses_;
    private PExpressao _expressao_;
    private TFParenteses _fParenteses_;

    public AParentesesFator()
    {
        // Constructor
    }

    public AParentesesFator(
        @SuppressWarnings("hiding") TAParenteses _aParenteses_,
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TFParenteses _fParenteses_)
    {
        // Constructor
        setAParenteses(_aParenteses_);

        setExpressao(_expressao_);

        setFParenteses(_fParenteses_);

    }

    @Override
    public Object clone()
    {
        return new AParentesesFator(
            cloneNode(this._aParenteses_),
            cloneNode(this._expressao_),
            cloneNode(this._fParenteses_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParentesesFator(this);
    }

    public TAParenteses getAParenteses()
    {
        return this._aParenteses_;
    }

    public void setAParenteses(TAParenteses node)
    {
        if(this._aParenteses_ != null)
        {
            this._aParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParenteses_ = node;
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

    public TFParenteses getFParenteses()
    {
        return this._fParenteses_;
    }

    public void setFParenteses(TFParenteses node)
    {
        if(this._fParenteses_ != null)
        {
            this._fParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fParenteses_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParenteses_)
            + toString(this._expressao_)
            + toString(this._fParenteses_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aParenteses_ == child)
        {
            this._aParenteses_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._fParenteses_ == child)
        {
            this._fParenteses_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aParenteses_ == oldChild)
        {
            setAParenteses((TAParenteses) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._fParenteses_ == oldChild)
        {
            setFParenteses((TFParenteses) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
