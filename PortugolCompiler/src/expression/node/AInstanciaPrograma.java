/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AInstanciaPrograma extends PInstanciaPrograma
{
    private TId _id_;
    private PBlocoPrograma _blocoPrograma_;

    public AInstanciaPrograma()
    {
        // Constructor
    }

    public AInstanciaPrograma(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PBlocoPrograma _blocoPrograma_)
    {
        // Constructor
        setId(_id_);

        setBlocoPrograma(_blocoPrograma_);

    }

    @Override
    public Object clone()
    {
        return new AInstanciaPrograma(
            cloneNode(this._id_),
            cloneNode(this._blocoPrograma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstanciaPrograma(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PBlocoPrograma getBlocoPrograma()
    {
        return this._blocoPrograma_;
    }

    public void setBlocoPrograma(PBlocoPrograma node)
    {
        if(this._blocoPrograma_ != null)
        {
            this._blocoPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoPrograma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._blocoPrograma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._blocoPrograma_ == child)
        {
            this._blocoPrograma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._blocoPrograma_ == oldChild)
        {
            setBlocoPrograma((PBlocoPrograma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
