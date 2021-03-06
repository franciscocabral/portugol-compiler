/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AFuncaoComando extends PComando
{
    private PFuncoes _funcoes_;

    public AFuncaoComando()
    {
        // Constructor
    }

    public AFuncaoComando(
        @SuppressWarnings("hiding") PFuncoes _funcoes_)
    {
        // Constructor
        setFuncoes(_funcoes_);

    }

    @Override
    public Object clone()
    {
        return new AFuncaoComando(
            cloneNode(this._funcoes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncaoComando(this);
    }

    public PFuncoes getFuncoes()
    {
        return this._funcoes_;
    }

    public void setFuncoes(PFuncoes node)
    {
        if(this._funcoes_ != null)
        {
            this._funcoes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcoes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcoes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcoes_ == child)
        {
            this._funcoes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcoes_ == oldChild)
        {
            setFuncoes((PFuncoes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
