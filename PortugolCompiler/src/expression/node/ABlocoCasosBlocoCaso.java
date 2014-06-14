/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoCasosBlocoCaso extends PBlocoCaso
{
    private PBlocoCaso _blocoCaso_;
    private TCaso _caso_;
    private PValor _valor_;
    private TDoispontos _doispontos_;
    private PBlocoComando _blocoComando_;

    public ABlocoCasosBlocoCaso()
    {
        // Constructor
    }

    public ABlocoCasosBlocoCaso(
        @SuppressWarnings("hiding") PBlocoCaso _blocoCaso_,
        @SuppressWarnings("hiding") TCaso _caso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") PBlocoComando _blocoComando_)
    {
        // Constructor
        setBlocoCaso(_blocoCaso_);

        setCaso(_caso_);

        setValor(_valor_);

        setDoispontos(_doispontos_);

        setBlocoComando(_blocoComando_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoCasosBlocoCaso(
            cloneNode(this._blocoCaso_),
            cloneNode(this._caso_),
            cloneNode(this._valor_),
            cloneNode(this._doispontos_),
            cloneNode(this._blocoComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoCasosBlocoCaso(this);
    }

    public PBlocoCaso getBlocoCaso()
    {
        return this._blocoCaso_;
    }

    public void setBlocoCaso(PBlocoCaso node)
    {
        if(this._blocoCaso_ != null)
        {
            this._blocoCaso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoCaso_ = node;
    }

    public TCaso getCaso()
    {
        return this._caso_;
    }

    public void setCaso(TCaso node)
    {
        if(this._caso_ != null)
        {
            this._caso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoCaso_)
            + toString(this._caso_)
            + toString(this._valor_)
            + toString(this._doispontos_)
            + toString(this._blocoComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoCaso_ == child)
        {
            this._blocoCaso_ = null;
            return;
        }

        if(this._caso_ == child)
        {
            this._caso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
            return;
        }

        if(this._blocoComando_ == child)
        {
            this._blocoComando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoCaso_ == oldChild)
        {
            setBlocoCaso((PBlocoCaso) newChild);
            return;
        }

        if(this._caso_ == oldChild)
        {
            setCaso((TCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
            return;
        }

        if(this._blocoComando_ == oldChild)
        {
            setBlocoComando((PBlocoComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
