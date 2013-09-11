

/* First created by JCasGen Tue Sep 10 23:41:14 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:41:14 EDT 2013
 * XML source: /Users/yingsheng/git/hw1-yingshen/hw1-yingshen/hw1-yingshen-ziy-proto/src/main/resources/hw1-yingshen-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: TokenList

  /** getter for TokenList - gets 
   * @generated */
  public FSArray getTokenList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets  
   * @generated */
  public void setTokenList(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - 
   * @generated */
  public Token getTokenList(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - 
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: NGramList

  /** getter for NGramList - gets 
   * @generated */
  public FSArray getNGramList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NGramList == null)
      jcasType.jcas.throwFeatMissing("NGramList", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList)));}
    
  /** setter for NGramList - sets  
   * @generated */
  public void setNGramList(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NGramList == null)
      jcasType.jcas.throwFeatMissing("NGramList", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NGramList - gets an indexed value - 
   * @generated */
  public NGram getNGramList(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NGramList == null)
      jcasType.jcas.throwFeatMissing("NGramList", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList), i)));}

  /** indexed setter for NGramList - sets an indexed value - 
   * @generated */
  public void setNGramList(int i, NGram v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_NGramList == null)
      jcasType.jcas.throwFeatMissing("NGramList", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_NGramList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    