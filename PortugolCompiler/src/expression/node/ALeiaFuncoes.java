/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaFuncoes extends PFuncoes
{
    private TLeia _leia_;
    private TAParenteses _aParenteses_;
    private PBlocoVariavel _blocoVariavel_;
    private TFParenteses _fParenteses_;
    private TPontovirgula _pontovirgula_;

    public ALeiaFuncoes()
    {
        // Constructor
    }

    public ALeiaFuncoes(
        @SuppressWarnings("hiding") TLeia _leia_,
        @SuppressWarnings("hiding") TAParenteses _aParenteses_,
        @SuppressWarnings("hiding") PBlocoVariavel _blocoVariavel_,
        @SuppressWarnings("hiding") TFParenteses _fParenteses_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setLeia(_leia_);

        setAParenteses(_aParenteses_);

        setBlocoVariavel(_blocoVariavel_);

        setFParenteses(_fParenteses_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaFuncoes(
            cloneNode(this._leia_),
            cloneNode(this._aParenteses_),
            cloneNode(this._blocoVariavel_),
            cloneNode(this._fParenteses_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaFuncoes(this);
    }

    public TLeia getLeia()
    {
        return this._leia_;
    }

    public void setLeia(TLeia node)
    {
        if(this._leia_ != null)
        {
            this._leia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leia_ = node;
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

    public PBlocoVariavel getBlocoVariavel()
    {
        return this._blocoVariavel_;
    }

    public void setBlocoVariavel(PBlocoVariavel node)
    {
        if(this._blocoVariavel_ != null)
        {
            this._blocoVariavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoVariavel_ = node;
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

    public TPontovirgula getPontovirgula()
    {
        return this._pontovirgula_;
    }

    public void setPontovirgula(TPontovirgula node)
    {
        if(this._pontovirgula_ != null)
        {
            this._pontovirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontovirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leia_)
            + toString(this._aParenteses_)
            + toString(this._blocoVariavel_)
            + toString(this._fParenteses_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leia_ == child)
        {
            this._leia_ = null;
            return;
        }

        if(this._aParenteses_ == child)
        {
            this._aParenteses_ = null;
            return;
        }

        if(this._blocoVariavel_ == child)
        {
            this._blocoVariavel_ = null;
            return;
        }

        if(this._fParenteses_ == child)
        {
            this._fParenteses_ = null;
            return;
        }

        if(this._pontovirgula_ == child)
        {
            this._pontovirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leia_ == oldChild)
        {
            setLeia((TLeia) newChild);
            return;
        }

        if(this._aParenteses_ == oldChild)
        {
            setAParenteses((TAParenteses) newChild);
            return;
        }

        if(this._blocoVariavel_ == oldChild)
        {
            setBlocoVariavel((PBlocoVariavel) newChild);
            return;
        }

        if(this._fParenteses_ == oldChild)
        {
            setFParenteses((TFParenteses) newChild);
            return;
        }

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}