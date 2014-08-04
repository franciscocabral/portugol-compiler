/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.analysis;

import java.util.*;
import expression.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPStart().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStart(AStart node)
    {
        defaultIn(node);
    }

    public void outAStart(AStart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        inAStart(node);
        if(node.getInstanciaPrograma() != null)
        {
            node.getInstanciaPrograma().apply(this);
        }
        outAStart(node);
    }

    public void inAInstanciaPrograma(AInstanciaPrograma node)
    {
        defaultIn(node);
    }

    public void outAInstanciaPrograma(AInstanciaPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstanciaPrograma(AInstanciaPrograma node)
    {
        inAInstanciaPrograma(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getBlocoPrograma() != null)
        {
            node.getBlocoPrograma().apply(this);
        }
        outAInstanciaPrograma(node);
    }

    public void inABlocoComando(ABlocoComando node)
    {
        defaultIn(node);
    }

    public void outABlocoComando(ABlocoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        inABlocoComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outABlocoComando(node);
    }

    public void inABlocoPrograma(ABlocoPrograma node)
    {
        defaultIn(node);
    }

    public void outABlocoPrograma(ABlocoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoPrograma(ABlocoPrograma node)
    {
        inABlocoPrograma(node);
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getBlocoDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outABlocoPrograma(node);
    }

    public void inAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelDeclaracao(AVariavelDeclaracao node)
    {
        inAVariavelDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVariavel> copy = new ArrayList<PVariavel>(node.getBlocoVariavel());
            for(PVariavel e : copy)
            {
                e.apply(this);
            }
        }
        outAVariavelDeclaracao(node);
    }

    public void inAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstanteDeclaracao(AConstanteDeclaracao node)
    {
        inAConstanteDeclaracao(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstanteDeclaracao(node);
    }

    public void inAVariavelVariavel(AVariavelVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavelVariavel(AVariavelVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelVariavel(AVariavelVariavel node)
    {
        inAVariavelVariavel(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVariavelVariavel(node);
    }

    public void inAVetorVariavel(AVetorVariavel node)
    {
        defaultIn(node);
    }

    public void outAVetorVariavel(AVetorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        inAVetorVariavel(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAVetorVariavel(node);
    }

    public void inACase(ACase node)
    {
        defaultIn(node);
    }

    public void outACase(ACase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACase(ACase node)
    {
        inACase(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACase(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getNInteiro() != null)
        {
            node.getNInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inACaractereTipo(ACaractereTipo node)
    {
        defaultIn(node);
    }

    public void outACaractereTipo(ACaractereTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        inACaractereTipo(node);
        if(node.getNCaractere() != null)
        {
            node.getNCaractere().apply(this);
        }
        outACaractereTipo(node);
    }

    public void inAValorRealValor(AValorRealValor node)
    {
        defaultIn(node);
    }

    public void outAValorRealValor(AValorRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorRealValor(AValorRealValor node)
    {
        inAValorRealValor(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outAValorRealValor(node);
    }

    public void inAValorInteiroValor(AValorInteiroValor node)
    {
        defaultIn(node);
    }

    public void outAValorInteiroValor(AValorInteiroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorInteiroValor(AValorInteiroValor node)
    {
        inAValorInteiroValor(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAValorInteiroValor(node);
    }

    public void inAValorCaractereValor(AValorCaractereValor node)
    {
        defaultIn(node);
    }

    public void outAValorCaractereValor(AValorCaractereValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorCaractereValor(AValorCaractereValor node)
    {
        inAValorCaractereValor(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outAValorCaractereValor(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getAtribuicoes() != null)
        {
            node.getAtribuicoes().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inAFuncaoComando(AFuncaoComando node)
    {
        defaultIn(node);
    }

    public void outAFuncaoComando(AFuncaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncaoComando(AFuncaoComando node)
    {
        inAFuncaoComando(node);
        if(node.getFuncoes() != null)
        {
            node.getFuncoes().apply(this);
        }
        outAFuncaoComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getSeEstruturas() != null)
        {
            node.getSeEstruturas().apply(this);
        }
        outASeComando(node);
    }

    public void inASeSenaoComando(ASeSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        inASeSenaoComando(node);
        if(node.getSeSenaoEstruturas() != null)
        {
            node.getSeSenaoEstruturas().apply(this);
        }
        outASeSenaoComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getAvalieEstruturas() != null)
        {
            node.getAvalieEstruturas().apply(this);
        }
        outAAvalieComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getEnquantoEstruturas() != null)
        {
            node.getEnquantoEstruturas().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        if(node.getRepitaEstruturas() != null)
        {
            node.getRepitaEstruturas().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getParaEstruturas() != null)
        {
            node.getParaEstruturas().apply(this);
        }
        outAParaComando(node);
    }

    public void inAParaPassoComando(AParaPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaPassoComando(AParaPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        inAParaPassoComando(node);
        if(node.getParaPassoEstruturas() != null)
        {
            node.getParaPassoEstruturas().apply(this);
        }
        outAParaPassoComando(node);
    }

    public void inAAtribuicoes(AAtribuicoes node)
    {
        defaultIn(node);
    }

    public void outAAtribuicoes(AAtribuicoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicoes(AAtribuicoes node)
    {
        inAAtribuicoes(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAAtribuicoes(node);
    }

    public void inALeiaFuncoes(ALeiaFuncoes node)
    {
        defaultIn(node);
    }

    public void outALeiaFuncoes(ALeiaFuncoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaFuncoes(ALeiaFuncoes node)
    {
        inALeiaFuncoes(node);
        {
            List<PVariavel> copy = new ArrayList<PVariavel>(node.getBlocoVariavel());
            for(PVariavel e : copy)
            {
                e.apply(this);
            }
        }
        outALeiaFuncoes(node);
    }

    public void inAEscrevaFuncoes(AEscrevaFuncoes node)
    {
        defaultIn(node);
    }

    public void outAEscrevaFuncoes(AEscrevaFuncoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaFuncoes(AEscrevaFuncoes node)
    {
        inAEscrevaFuncoes(node);
        {
            List<PExpressaoLogica> copy = new ArrayList<PExpressaoLogica>(node.getBlocoExpressao());
            for(PExpressaoLogica e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaFuncoes(node);
    }

    public void inASeStant(ASeStant node)
    {
        defaultIn(node);
    }

    public void outASeStant(ASeStant node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeStant(ASeStant node)
    {
        inASeStant(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outASeStant(node);
    }

    public void inASenaoEstruturas(ASenaoEstruturas node)
    {
        defaultIn(node);
    }

    public void outASenaoEstruturas(ASenaoEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoEstruturas(ASenaoEstruturas node)
    {
        inASenaoEstruturas(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outASenaoEstruturas(node);
    }

    public void inASeEstruturas(ASeEstruturas node)
    {
        defaultIn(node);
    }

    public void outASeEstruturas(ASeEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeEstruturas(ASeEstruturas node)
    {
        inASeEstruturas(node);
        if(node.getSeStant() != null)
        {
            node.getSeStant().apply(this);
        }
        outASeEstruturas(node);
    }

    public void inASeSenaoEstruturas(ASeSenaoEstruturas node)
    {
        defaultIn(node);
    }

    public void outASeSenaoEstruturas(ASeSenaoEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoEstruturas(ASeSenaoEstruturas node)
    {
        inASeSenaoEstruturas(node);
        if(node.getSeStant() != null)
        {
            node.getSeStant().apply(this);
        }
        if(node.getSenaoEstruturas() != null)
        {
            node.getSenaoEstruturas().apply(this);
        }
        outASeSenaoEstruturas(node);
    }

    public void inAAvalieEstruturas(AAvalieEstruturas node)
    {
        defaultIn(node);
    }

    public void outAAvalieEstruturas(AAvalieEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieEstruturas(AAvalieEstruturas node)
    {
        inAAvalieEstruturas(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        {
            List<PCase> copy = new ArrayList<PCase>(node.getBlocoCaso());
            for(PCase e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieEstruturas(node);
    }

    public void inAEnquantoEstruturas(AEnquantoEstruturas node)
    {
        defaultIn(node);
    }

    public void outAEnquantoEstruturas(AEnquantoEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoEstruturas(AEnquantoEstruturas node)
    {
        inAEnquantoEstruturas(node);
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoEstruturas(node);
    }

    public void inARepitaEstruturas(ARepitaEstruturas node)
    {
        defaultIn(node);
    }

    public void outARepitaEstruturas(ARepitaEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaEstruturas(ARepitaEstruturas node)
    {
        inARepitaEstruturas(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outARepitaEstruturas(node);
    }

    public void inAParaEstruturas(AParaEstruturas node)
    {
        defaultIn(node);
    }

    public void outAParaEstruturas(AParaEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaEstruturas(AParaEstruturas node)
    {
        inAParaEstruturas(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaEstruturas(node);
    }

    public void inAParaPassoEstruturas(AParaPassoEstruturas node)
    {
        defaultIn(node);
    }

    public void outAParaPassoEstruturas(AParaPassoEstruturas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaPassoEstruturas(AParaPassoEstruturas node)
    {
        inAParaPassoEstruturas(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getBlocoComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaPassoEstruturas(node);
    }

    public void inAMaisExpressao(AMaisExpressao node)
    {
        defaultIn(node);
    }

    public void outAMaisExpressao(AMaisExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExpressao(AMaisExpressao node)
    {
        inAMaisExpressao(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaisExpressao(node);
    }

    public void inAMenosExpressao(AMenosExpressao node)
    {
        defaultIn(node);
    }

    public void outAMenosExpressao(AMenosExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpressao(AMenosExpressao node)
    {
        inAMenosExpressao(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenosExpressao(node);
    }

    public void inAVezesExpressao(AVezesExpressao node)
    {
        defaultIn(node);
    }

    public void outAVezesExpressao(AVezesExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVezesExpressao(AVezesExpressao node)
    {
        inAVezesExpressao(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAVezesExpressao(node);
    }

    public void inADivididoExpressao(ADivididoExpressao node)
    {
        defaultIn(node);
    }

    public void outADivididoExpressao(ADivididoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivididoExpressao(ADivididoExpressao node)
    {
        inADivididoExpressao(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivididoExpressao(node);
    }

    public void inARestoExpressao(ARestoExpressao node)
    {
        defaultIn(node);
    }

    public void outARestoExpressao(ARestoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARestoExpressao(ARestoExpressao node)
    {
        inARestoExpressao(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outARestoExpressao(node);
    }

    public void inAValorExpressao(AValorExpressao node)
    {
        defaultIn(node);
    }

    public void outAValorExpressao(AValorExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExpressao(AValorExpressao node)
    {
        inAValorExpressao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExpressao(node);
    }

    public void inAVariavelExpressao(AVariavelExpressao node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpressao(AVariavelExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpressao(AVariavelExpressao node)
    {
        inAVariavelExpressao(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelExpressao(node);
    }

    public void inAMenosExpressaoExpressao(AMenosExpressaoExpressao node)
    {
        defaultIn(node);
    }

    public void outAMenosExpressaoExpressao(AMenosExpressaoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpressaoExpressao(AMenosExpressaoExpressao node)
    {
        inAMenosExpressaoExpressao(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAMenosExpressaoExpressao(node);
    }

    public void inAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        inAOuExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAOuExpressaoLogica(node);
    }

    public void inAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpressaoLogica(AXorExpressaoLogica node)
    {
        inAXorExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAXorExpressaoLogica(node);
    }

    public void inAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpressaoLogica(AEExpressaoLogica node)
    {
        inAEExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAEExpressaoLogica(node);
    }

    public void inAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpressaoLogica(AIgualExpressaoLogica node)
    {
        inAIgualExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAIgualExpressaoLogica(node);
    }

    public void inADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpressaoLogica(ADiferenteExpressaoLogica node)
    {
        inADiferenteExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADiferenteExpressaoLogica(node);
    }

    public void inAMaiorigualExpressaoLogica(AMaiorigualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorigualExpressaoLogica(AMaiorigualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorigualExpressaoLogica(AMaiorigualExpressaoLogica node)
    {
        inAMaiorigualExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaiorigualExpressaoLogica(node);
    }

    public void inAMenorigualExpressaoLogica(AMenorigualExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorigualExpressaoLogica(AMenorigualExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorigualExpressaoLogica(AMenorigualExpressaoLogica node)
    {
        inAMenorigualExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenorigualExpressaoLogica(node);
    }

    public void inAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpressaoLogica(AMaiorExpressaoLogica node)
    {
        inAMaiorExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaiorExpressaoLogica(node);
    }

    public void inAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpressaoLogica(AMenorExpressaoLogica node)
    {
        inAMenorExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenorExpressaoLogica(node);
    }

    public void inAMaisExpressaoLogica(AMaisExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMaisExpressaoLogica(AMaisExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExpressaoLogica(AMaisExpressaoLogica node)
    {
        inAMaisExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaisExpressaoLogica(node);
    }

    public void inAMenosExpressaoLogica(AMenosExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAMenosExpressaoLogica(AMenosExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpressaoLogica(AMenosExpressaoLogica node)
    {
        inAMenosExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenosExpressaoLogica(node);
    }

    public void inAVezesExpressaoLogica(AVezesExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAVezesExpressaoLogica(AVezesExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVezesExpressaoLogica(AVezesExpressaoLogica node)
    {
        inAVezesExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAVezesExpressaoLogica(node);
    }

    public void inADivididoExpressaoLogica(ADivididoExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outADivididoExpressaoLogica(ADivididoExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivididoExpressaoLogica(ADivididoExpressaoLogica node)
    {
        inADivididoExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivididoExpressaoLogica(node);
    }

    public void inARestoExpressaoLogica(ARestoExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outARestoExpressaoLogica(ARestoExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARestoExpressaoLogica(ARestoExpressaoLogica node)
    {
        inARestoExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outARestoExpressaoLogica(node);
    }

    public void inANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        inANaoExpressaoLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outANaoExpressaoLogica(node);
    }

    public void inAValorExpressaoLogica(AValorExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAValorExpressaoLogica(AValorExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExpressaoLogica(AValorExpressaoLogica node)
    {
        inAValorExpressaoLogica(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExpressaoLogica(node);
    }

    public void inAVariavelExpressaoLogica(AVariavelExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpressaoLogica(AVariavelExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpressaoLogica(AVariavelExpressaoLogica node)
    {
        inAVariavelExpressaoLogica(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelExpressaoLogica(node);
    }
}
