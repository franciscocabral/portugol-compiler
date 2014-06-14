/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class TNReal extends Token
{
    public TNReal()
    {
        super.setText("real");
    }

    public TNReal(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNReal(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNReal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNReal text.");
    }
}
