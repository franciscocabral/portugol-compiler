/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoVariaveisBlocoVariavel extends PBlocoVariavel
{
    private PBlocoVariavel _blocoVariavel_;
    private TVirgula _virgula_;
    private PVariavel _variavel_;

    public ABlocoVariaveisBlocoVariavel()
    {
        // Constructor
    }

    public ABlocoVariaveisBlocoVariavel(
        @SuppressWarnings("hiding") PBlocoVariavel _blocoVariavel_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PVariavel _variavel_)
    {
        // Constructor
        setBlocoVariavel(_blocoVariavel_);

        setVirgula(_virgula_);

        setVariavel(_variavel_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoVariaveisBlocoVariavel(
            cloneNode(this._blocoVariavel_),
            cloneNode(this._virgula_),
            cloneNode(this._variavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoVariaveisBlocoVariavel(this);
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

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoVariavel_)
            + toString(this._virgula_)
            + toString(this._variavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoVariavel_ == child)
        {
            this._blocoVariavel_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoVariavel_ == oldChild)
        {
            setBlocoVariavel((PBlocoVariavel) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
