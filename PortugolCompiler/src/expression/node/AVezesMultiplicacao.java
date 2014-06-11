/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AVezesMultiplicacao extends PMultiplicacao
{
    private TVezes _vezes_;

    public AVezesMultiplicacao()
    {
        // Constructor
    }

    public AVezesMultiplicacao(
        @SuppressWarnings("hiding") TVezes _vezes_)
    {
        // Constructor
        setVezes(_vezes_);

    }

    @Override
    public Object clone()
    {
        return new AVezesMultiplicacao(
            cloneNode(this._vezes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVezesMultiplicacao(this);
    }

    public TVezes getVezes()
    {
        return this._vezes_;
    }

    public void setVezes(TVezes node)
    {
        if(this._vezes_ != null)
        {
            this._vezes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vezes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._vezes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._vezes_ == child)
        {
            this._vezes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._vezes_ == oldChild)
        {
            setVezes((TVezes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
