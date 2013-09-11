
/* First created by JCasGen Tue Sep 10 23:41:14 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 23:41:14 EDT 2013
 * @generated */
public class Question_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Question");
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
   /** @generated */
  public int getTokenList(int addr, int i) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
  }
   
  /** @generated */ 
  public void setTokenList(int addr, int i, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_NGramList;
  /** @generated */
  final int     casFeatCode_NGramList;
  /** @generated */ 
  public int getNGramList(int addr) {
        if (featOkTst && casFeat_NGramList == null)
      jcas.throwFeatMissing("NGramList", "Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NGramList);
  }
  /** @generated */    
  public void setNGramList(int addr, int v) {
        if (featOkTst && casFeat_NGramList == null)
      jcas.throwFeatMissing("NGramList", "Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_NGramList, v);}
    
   /** @generated */
  public int getNGramList(int addr, int i) {
        if (featOkTst && casFeat_NGramList == null)
      jcas.throwFeatMissing("NGramList", "Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i);
  }
   
  /** @generated */ 
  public void setNGramList(int addr, int i, int v) {
        if (featOkTst && casFeat_NGramList == null)
      jcas.throwFeatMissing("NGramList", "Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramList), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.FSArray", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

 
    casFeat_NGramList = jcas.getRequiredFeatureDE(casType, "NGramList", "uima.cas.FSArray", featOkTst);
    casFeatCode_NGramList  = (null == casFeat_NGramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NGramList).getCode();

  }
}



    