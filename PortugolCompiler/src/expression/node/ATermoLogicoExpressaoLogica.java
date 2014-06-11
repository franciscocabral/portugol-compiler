/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ATermoLogicoExpressaoLogica extends PExpressaoLogica
{
    private PTermoLogico _termoLogico_;

    public ATermoLogicoExpressaoLogica()
    {
        // Constructor
    }

    public ATermoLogicoExpressaoLogica(
        @SuppressWarnings("hiding") PTermoLogico _termoLogico_)
    {
        // Constructor
        setTermoLogico(_termoLogico_);

    }

    @Override
    public Object clone()
    {
        return new ATermoLogicoExpressaoLogica(
            cloneNode(this._termoLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoLogicoExpressaoLogica(this);
    }

    public PTermoLogico getTermoLogico()
    {
        return this._termoLogico_;
    }

    public void setTermoLogico(PTermoLogico node)
    {
        if(this._termoLogico_ != null)
        {
            this._termoLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoLogico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoLogico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoLogico_ == child)
        {
            this._termoLogico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoLogico_ == oldChild)
        {
            setTermoLogico((PTermoLogico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
