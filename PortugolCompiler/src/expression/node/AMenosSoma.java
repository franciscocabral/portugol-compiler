/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AMenosSoma extends PSoma
{
    private TMenos _menos_;

    public AMenosSoma()
    {
        // Constructor
    }

    public AMenosSoma(
        @SuppressWarnings("hiding") TMenos _menos_)
    {
        // Constructor
        setMenos(_menos_);

    }

    @Override
    public Object clone()
    {
        return new AMenosSoma(
            cloneNode(this._menos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosSoma(this);
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
