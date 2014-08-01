/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AStart extends PStart
{
    private PInstanciaPrograma _instanciaPrograma_;

    public AStart()
    {
        // Constructor
    }

    public AStart(
        @SuppressWarnings("hiding") PInstanciaPrograma _instanciaPrograma_)
    {
        // Constructor
        setInstanciaPrograma(_instanciaPrograma_);

    }

    @Override
    public Object clone()
    {
        return new AStart(
            cloneNode(this._instanciaPrograma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStart(this);
    }

    public PInstanciaPrograma getInstanciaPrograma()
    {
        return this._instanciaPrograma_;
    }

    public void setInstanciaPrograma(PInstanciaPrograma node)
    {
        if(this._instanciaPrograma_ != null)
        {
            this._instanciaPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instanciaPrograma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._instanciaPrograma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._instanciaPrograma_ == child)
        {
            this._instanciaPrograma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._instanciaPrograma_ == oldChild)
        {
            setInstanciaPrograma((PInstanciaPrograma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
