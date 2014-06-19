/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ASeNaoSeEstruturasNao extends PSeEstruturasNao
{
    private TSe _se_;
    private PSinalLogicoNao _sinalLogicoNao_;
    private TAParenteses _aParenteses_;
    private PExpressaoLogica _expressaoLogica_;
    private TFParenteses _fParenteses_;
    private TEntao _entao_;
    private PBlocoComando _blocoComando_;
    private TFimSe _fimSe_;
    private TPontovirgula _pontovirgula_;

    public ASeNaoSeEstruturasNao()
    {
        // Constructor
    }

    public ASeNaoSeEstruturasNao(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") PSinalLogicoNao _sinalLogicoNao_,
        @SuppressWarnings("hiding") TAParenteses _aParenteses_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TFParenteses _fParenteses_,
        @SuppressWarnings("hiding") TEntao _entao_,
        @SuppressWarnings("hiding") PBlocoComando _blocoComando_,
        @SuppressWarnings("hiding") TFimSe _fimSe_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setSe(_se_);

        setSinalLogicoNao(_sinalLogicoNao_);

        setAParenteses(_aParenteses_);

        setExpressaoLogica(_expressaoLogica_);

        setFParenteses(_fParenteses_);

        setEntao(_entao_);

        setBlocoComando(_blocoComando_);

        setFimSe(_fimSe_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new ASeNaoSeEstruturasNao(
            cloneNode(this._se_),
            cloneNode(this._sinalLogicoNao_),
            cloneNode(this._aParenteses_),
            cloneNode(this._expressaoLogica_),
            cloneNode(this._fParenteses_),
            cloneNode(this._entao_),
            cloneNode(this._blocoComando_),
            cloneNode(this._fimSe_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeNaoSeEstruturasNao(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public PSinalLogicoNao getSinalLogicoNao()
    {
        return this._sinalLogicoNao_;
    }

    public void setSinalLogicoNao(PSinalLogicoNao node)
    {
        if(this._sinalLogicoNao_ != null)
        {
            this._sinalLogicoNao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinalLogicoNao_ = node;
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

    public TEntao getEntao()
    {
        return this._entao_;
    }

    public void setEntao(TEntao node)
    {
        if(this._entao_ != null)
        {
            this._entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entao_ = node;
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

    public TFimSe getFimSe()
    {
        return this._fimSe_;
    }

    public void setFimSe(TFimSe node)
    {
        if(this._fimSe_ != null)
        {
            this._fimSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimSe_ = node;
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
            + toString(this._se_)
            + toString(this._sinalLogicoNao_)
            + toString(this._aParenteses_)
            + toString(this._expressaoLogica_)
            + toString(this._fParenteses_)
            + toString(this._entao_)
            + toString(this._blocoComando_)
            + toString(this._fimSe_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._sinalLogicoNao_ == child)
        {
            this._sinalLogicoNao_ = null;
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

        if(this._entao_ == child)
        {
            this._entao_ = null;
            return;
        }

        if(this._blocoComando_ == child)
        {
            this._blocoComando_ = null;
            return;
        }

        if(this._fimSe_ == child)
        {
            this._fimSe_ = null;
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
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._sinalLogicoNao_ == oldChild)
        {
            setSinalLogicoNao((PSinalLogicoNao) newChild);
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

        if(this._entao_ == oldChild)
        {
            setEntao((TEntao) newChild);
            return;
        }

        if(this._blocoComando_ == oldChild)
        {
            setBlocoComando((PBlocoComando) newChild);
            return;
        }

        if(this._fimSe_ == oldChild)
        {
            setFimSe((TFimSe) newChild);
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
