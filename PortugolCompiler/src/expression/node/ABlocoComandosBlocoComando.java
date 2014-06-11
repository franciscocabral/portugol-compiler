/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoComandosBlocoComando extends PBlocoComando
{
    private PBlocoComando _blocoComando_;
    private PComando _comando_;

    public ABlocoComandosBlocoComando()
    {
        // Constructor
    }

    public ABlocoComandosBlocoComando(
        @SuppressWarnings("hiding") PBlocoComando _blocoComando_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setBlocoComando(_blocoComando_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoComandosBlocoComando(
            cloneNode(this._blocoComando_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComandosBlocoComando(this);
    }

    public PBlocoComando getBlocoComando()
    {
        return this._blocoComando_;
    }

    public void setBlocoComando(PBlocoComando node)
    {
        if(this._blocoComando_ != null)
        {
            this._blocoComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoComando_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoComando_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoComando_ == child)
        {
            this._blocoComando_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoComando_ == oldChild)
        {
            setBlocoComando((PBlocoComando) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
