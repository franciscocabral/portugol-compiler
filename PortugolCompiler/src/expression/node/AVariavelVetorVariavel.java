/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AVariavelVetorVariavel extends PVariavel
{
    private PIdentficador _identficador_;
    private TACochete _aCochete_;
    private TInteiro _inteiro_;
    private TFCochete _fCochete_;

    public AVariavelVetorVariavel()
    {
        // Constructor
    }

    public AVariavelVetorVariavel(
        @SuppressWarnings("hiding") PIdentficador _identficador_,
        @SuppressWarnings("hiding") TACochete _aCochete_,
        @SuppressWarnings("hiding") TInteiro _inteiro_,
        @SuppressWarnings("hiding") TFCochete _fCochete_)
    {
        // Constructor
        setIdentficador(_identficador_);

        setACochete(_aCochete_);

        setInteiro(_inteiro_);

        setFCochete(_fCochete_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelVetorVariavel(
            cloneNode(this._identficador_),
            cloneNode(this._aCochete_),
            cloneNode(this._inteiro_),
            cloneNode(this._fCochete_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelVetorVariavel(this);
    }

    public PIdentficador getIdentficador()
    {
        return this._identficador_;
    }

    public void setIdentficador(PIdentficador node)
    {
        if(this._identficador_ != null)
        {
            this._identficador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identficador_ = node;
    }

    public TACochete getACochete()
    {
        return this._aCochete_;
    }

    public void setACochete(TACochete node)
    {
        if(this._aCochete_ != null)
        {
            this._aCochete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aCochete_ = node;
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

    public TFCochete getFCochete()
    {
        return this._fCochete_;
    }

    public void setFCochete(TFCochete node)
    {
        if(this._fCochete_ != null)
        {
            this._fCochete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fCochete_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identficador_)
            + toString(this._aCochete_)
            + toString(this._inteiro_)
            + toString(this._fCochete_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identficador_ == child)
        {
            this._identficador_ = null;
            return;
        }

        if(this._aCochete_ == child)
        {
            this._aCochete_ = null;
            return;
        }

        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        if(this._fCochete_ == child)
        {
            this._fCochete_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identficador_ == oldChild)
        {
            setIdentficador((PIdentficador) newChild);
            return;
        }

        if(this._aCochete_ == oldChild)
        {
            setACochete((TACochete) newChild);
            return;
        }

        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        if(this._fCochete_ == oldChild)
        {
            setFCochete((TFCochete) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
