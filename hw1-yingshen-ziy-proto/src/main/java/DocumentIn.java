

/* First created by JCasGen Tue Sep 10 23:41:14 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:41:14 EDT 2013
 * XML source: /Users/yingsheng/git/hw1-yingshen/hw1-yingshen/hw1-yingshen-ziy-proto/src/main/resources/hw1-yingshen-typesystem.xml
 * @generated */
public class DocumentIn extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentIn.class);
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
  protected DocumentIn() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DocumentIn(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DocumentIn(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DocumentIn(JCas jcas, int begin, int end) {
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
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public Question getQuestion() {
    if (DocumentIn_Type.featOkTst && ((DocumentIn_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "DocumentIn");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentIn_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (DocumentIn_Type.featOkTst && ((DocumentIn_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "DocumentIn");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentIn_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public AnswerList getAnswerList() {
    if (DocumentIn_Type.featOkTst && ((DocumentIn_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "DocumentIn");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentIn_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(AnswerList v) {
    if (DocumentIn_Type.featOkTst && ((DocumentIn_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "DocumentIn");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentIn_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    