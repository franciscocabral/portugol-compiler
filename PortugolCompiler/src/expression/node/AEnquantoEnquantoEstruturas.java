/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoEnquantoEstruturas extends PEnquantoEstruturas
{
    private TEnquanto _enquanto_;
    private TAParenteses _aParenteses_;
    private PExpressaoLogica _expressaoLogica_;
    private TFParenteses _fParenteses_;
    private TFaca _faca_;
    private PBlocoComando _blocoComando_;
    private TFimEnquanto _fimEnquanto_;
    private TPontovirgula _pontovirgula_;

    public AEnquantoEnquantoEstruturas()
    {
        // Constructor
    }

    public AEnquantoEnquantoEstruturas(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TAParenteses _aParenteses_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TFParenteses _fParenteses_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PBlocoComando _blocoComando_,
        @SuppressWarnings("hiding") TFimEnquanto _fimEnquanto_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setAParenteses(_aParenteses_);

        setExpressaoLogica(_expressaoLogica_);

        setFParenteses(_fParenteses_);

        setFaca(_faca_);

        setBlocoComando(_blocoComando_);

        setFimEnquanto(_fimEnquanto_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoEnquantoEstruturas(
            cloneNode(this._enquanto_),
            cloneNode(this._aParenteses_),
            cloneNode(this._expressaoLogica_),
            cloneNode(this._fParenteses_),
            cloneNode(this._faca_),
            cloneNode(this._blocoComando_),
            cloneNode(this._fimEnquanto_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoEnquantoEstruturas(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
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

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
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

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
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

    public TFimEnquanto getFimEnquanto()
    {
        return this._fimEnquanto_;
    }

    public void setFimEnquanto(TFimEnquanto node)
    {
        if(this._fimEnquanto_ != null)
        {
            this._fimEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimEnquanto_ = node;
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
            + toString(this._enquanto_)
            + toString(this._aParenteses_)
            + toString(this._expressaoLogica_)
            + toString(this._fParenteses_)
            + toString(this._faca_)
            + toString(this._blocoComando_)
            + toString(this._fimEnquanto_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._aParenteses_ == child)
        {
            this._aParenteses_ = null;
            return;
        }

        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._fParenteses_ == child)
        {
            this._fParenteses_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._blocoComando_ == child)
        {
            this._blocoComando_ = null;
            return;
        }

        if(this._fimEnquanto_ == child)
        {
            this._fimEnquanto_ = null;
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
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._aParenteses_ == oldChild)
        {
            setAParenteses((TAParenteses) newChild);
            return;
        }

        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        if(this._fParenteses_ == oldChild)
        {
            setFParenteses((TFParenteses) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._blocoComando_ == oldChild)
        {
            setBlocoComando((PBlocoComando) newChild);
            return;
        }

        if(this._fimEnquanto_ == oldChild)
        {
            setFimEnquanto((TFimEnquanto) newChild);
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
