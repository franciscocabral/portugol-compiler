/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class TFimPonto extends Token
{
    public TFimPonto()
    {
        super.setText("fim.");
    }

    public TFimPonto(int line, int pos)
    {
        super.setText("fim.");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimPonto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimPonto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimPonto text.");
    }
}
