/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ASeEstruturas extends PSeEstruturas
{
    private PSeStant _seStant_;

    public ASeEstruturas()
    {
        // Constructor
    }

    public ASeEstruturas(
        @SuppressWarnings("hiding") PSeStant _seStant_)
    {
        // Constructor
        setSeStant(_seStant_);

    }

    @Override
    public Object clone()
    {
        return new ASeEstruturas(
            cloneNode(this._seStant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeEstruturas(this);
    }

    public PSeStant getSeStant()
    {
        return this._seStant_;
    }

    public void setSeStant(PSeStant node)
    {
        if(this._seStant_ != null)
        {
            this._seStant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seStant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seStant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seStant_ == child)
        {
            this._seStant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seStant_ == oldChild)
        {
            setSeStant((PSeStant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
