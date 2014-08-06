/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import java.util.*;
import expression.analysis.*;

@SuppressWarnings("nls")
public final class ASenaoEstruturas extends PSenaoEstruturas
{
    private final LinkedList<PComando> _blocoComando_ = new LinkedList<PComando>();

    public ASenaoEstruturas()
    {
        // Constructor
    }

    public ASenaoEstruturas(
        @SuppressWarnings("hiding") List<?> _blocoComando_)
    {
        // Constructor
        setBlocoComando(_blocoComando_);

    }

    @Override
    public Object clone()
    {
        return new ASenaoEstruturas(
            cloneList(this._blocoComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASenaoEstruturas(this);
    }

    public LinkedList<PComando> getBlocoComando()
    {
        return this._blocoComando_;
    }

    public void setBlocoComando(List<?> list)
    {
        for(PComando e : this._blocoComando_)
        {
            e.parent(null);
        }
        this._blocoComando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._blocoComando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoComando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PComando> i = this._blocoComando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}