/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.analysis;

import java.util.*;
import expression.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstanciaPrograma(AInstanciaPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoPrograma(ABlocoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelVariavel(AVariavelVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACase(ACase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorRealValor(AValorRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorInteiroValor(AValorInteiroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorCaractereValor(AValorCaractereValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoComando(AFuncaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicoes(AAtribuicoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaFuncoes(ALeiaFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaFuncoes(AEscrevaFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeStant(ASeStant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoEstruturas(ASenaoEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeEstruturas(ASeEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoEstruturas(ASeSenaoEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieEstruturas(AAvalieEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoEstruturas(AEnquantoEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaEstruturas(ARepitaEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaEstruturas(AParaEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoEstruturas(AParaPassoEstruturas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExpressao(AMaisExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpressao(AMenosExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVezesExpressao(AVezesExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivididoExpressao(ADivididoExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARestoExpressao(ARestoExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExpressao(AValorExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExpressao(AVariavelExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorigualExpressaoLogica(AMaiorigualExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorigualExpressaoLogica(AMenorigualExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExpressaoLogica(AMaisExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpressaoLogica(AMenosExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVezesExpressaoLogica(AVezesExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivididoExpressaoLogica(ADivididoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARestoExpressaoLogica(ARestoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExpressaoLogica(AValorExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExpressaoLogica(AVariavelExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBranco(TBranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinhaFinal(TComentarioLinhaFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioFinal(TComentarioFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioCorpo(TComentarioCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRecebe(TRecebe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontovirgula(TPontovirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoispontos(TDoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTACochete(TACochete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFCochete(TFCochete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAParenteses(TAParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFParenteses(TFParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAChave(TAChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFChave(TFChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVezes(TVezes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDividido(TDividido node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTResto(TResto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorigual(TMenorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorigual(TMaiorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPonto(TFimPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProximo(TProximo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscrevaln(TEscrevaln node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInteiro(TNInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNCaractere(TNCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
