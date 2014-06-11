/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ARestoMultiplicacao extends PMultiplicacao
{
    private TResto _resto_;

    public ARestoMultiplicacao()
    {
        // Constructor
    }

    public ARestoMultiplicacao(
        @SuppressWarnings("hiding") TResto _resto_)
    {
        // Constructor
        setResto(_resto_);

    }

    @Override
    public Object clone()
    {
        return new ARestoMultiplicacao(
            cloneNode(this._resto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARestoMultiplicacao(this);
    }

    public TResto getResto()
    {
        return this._resto_;
    }

    public void setResto(TResto node)
    {
        if(this._resto_ != null)
        {
            this._resto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._resto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._resto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._resto_ == child)
        {
            this._resto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._resto_ == oldChild)
        {
            setResto((TResto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}