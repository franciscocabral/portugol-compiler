/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ANaoExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoLogica _l_;

    public ANaoExpressaoLogica()
    {
        // Constructor
    }

    public ANaoExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoLogica _l_)
    {
        // Constructor
        setL(_l_);

    }

    @Override
    public Object clone()
    {
        return new ANaoExpressaoLogica(
            cloneNode(this._l_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaoExpressaoLogica(this);
    }

    public PExpressaoLogica getL()
    {
        return this._l_;
    }

    public void setL(PExpressaoLogica node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._l_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._l_ == oldChild)
        {
            setL((PExpressaoLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}