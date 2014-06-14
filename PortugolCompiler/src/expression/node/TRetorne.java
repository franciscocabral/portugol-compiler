/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class TRetorne extends Token
{
    public TRetorne()
    {
        super.setText("retorne");
    }

    public TRetorne(int line, int pos)
    {
        super.setText("retorne");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRetorne(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRetorne(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRetorne text.");
    }
}
