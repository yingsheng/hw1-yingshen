

/* First created by JCasGen Tue Sep 10 23:41:14 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** the start, end, sofa features are already in its supertype 
 * Updated by JCasGen Tue Sep 10 23:41:14 EDT 2013
 * XML source: /Users/yingsheng/git/hw1-yingshen/hw1-yingshen/hw1-yingshen-ziy-proto/src/main/resources/hw1-yingshen-typesystem.xml
 * @generated */
public class BasicAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BasicAnnotator.class);
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
  protected BasicAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BasicAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BasicAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BasicAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (BasicAnnotator_Type.featOkTst && ((BasicAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BasicAnnotator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BasicAnnotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (BasicAnnotator_Type.featOkTst && ((BasicAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BasicAnnotator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BasicAnnotator_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets 
   * @generated */
  public String getCasProcessorId() {
    if (BasicAnnotator_Type.featOkTst && ((BasicAnnotator_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "BasicAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BasicAnnotator_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets  
   * @generated */
  public void setCasProcessorId(String v) {
    if (BasicAnnotator_Type.featOkTst && ((BasicAnnotator_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "BasicAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((BasicAnnotator_Type)jcasType).casFeatCode_casProcessorId, v);}    
  }

    