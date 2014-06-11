/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class TFCochete extends Token
{
    public TFCochete()
    {
        super.setText("]");
    }

    public TFCochete(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFCochete(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFCochete(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFCochete text.");
    }
}
