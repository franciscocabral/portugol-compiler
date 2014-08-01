/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AVetorVariavel extends PVariavel
{
    private TId _id_;
    private TInteiro _inteiro_;

    public AVetorVariavel()
    {
        // Constructor
    }

    public AVetorVariavel(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TInteiro _inteiro_)
    {
        // Constructor
        setId(_id_);

        setInteiro(_inteiro_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVariavel(
            cloneNode(this._id_),
            cloneNode(this._inteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVariavel(this);
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

    public TInteiro getInteiro()
    {
        return this._inteiro_;
    }

    public void setInteiro(TInteiro node)
    {
        if(this._inteiro_ != null)
        {
            this._inteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._inteiro_);
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

        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
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

        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
