/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ATermoRelacionalFatorLogico extends PFatorLogico
{
    private PTermoRelacional _termoRelacional_;

    public ATermoRelacionalFatorLogico()
    {
        // Constructor
    }

    public ATermoRelacionalFatorLogico(
        @SuppressWarnings("hiding") PTermoRelacional _termoRelacional_)
    {
        // Constructor
        setTermoRelacional(_termoRelacional_);

    }

    @Override
    public Object clone()
    {
        return new ATermoRelacionalFatorLogico(
            cloneNode(this._termoRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoRelacionalFatorLogico(this);
    }

    public PTermoRelacional getTermoRelacional()
    {
        return this._termoRelacional_;
    }

    public void setTermoRelacional(PTermoRelacional node)
    {
        if(this._termoRelacional_ != null)
        {
            this._termoRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoRelacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoRelacional_ == child)
        {
            this._termoRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoRelacional_ == oldChild)
        {
            setTermoRelacional((PTermoRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}