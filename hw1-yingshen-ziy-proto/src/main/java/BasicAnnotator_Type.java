
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

/** the start, end, sofa features are already in its supertype 
 * Updated by JCasGen Tue Sep 10 23:41:14 EDT 2013
 * @generated */
public class BasicAnnotator_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BasicAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BasicAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BasicAnnotator(addr, BasicAnnotator_Type.this);
  			   BasicAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BasicAnnotator(addr, BasicAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BasicAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("BasicAnnotator");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BasicAnnotator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "BasicAnnotator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_casProcessorId;
  /** @generated */
  final int     casFeatCode_casProcessorId;
  /** @generated */ 
  public String getCasProcessorId(int addr) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "BasicAnnotator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorId);
  }
  /** @generated */    
  public void setCasProcessorId(int addr, String v) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "BasicAnnotator");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BasicAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_casProcessorId = jcas.getRequiredFeatureDE(casType, "casProcessorId", "uima.cas.String", featOkTst);
    casFeatCode_casProcessorId  = (null == casFeat_casProcessorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessorId).getCode();

  }
}



    